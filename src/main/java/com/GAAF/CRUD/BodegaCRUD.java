package com.GAAF.CRUD;

import java.util.List;

import com.GAAF.Modelo.Bodega;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class BodegaCRUD {
    private EntityManagerFactory emf;
    private EntityManager em;

    public BodegaCRUD() {
        this.emf = Persistence.createEntityManagerFactory("miUnidadPersistencia");
        this.em = emf.createEntityManager();
    }

    public void crear(Bodega bodega) {
        em.getTransaction().begin();
        em.persist(bodega);
        em.getTransaction().commit();
    }

    public Bodega buscar(Long id) {
        return em.find(Bodega.class, id);
    }

    public void actualizar(Bodega bodega) {
        em.getTransaction().begin();
        em.merge(bodega);
        em.getTransaction().commit();
    }

    public void borrar(Long id) {
        Bodega bodega = em.find(Bodega.class, id);
        if (bodega != null) {
            em.getTransaction().begin();
            em.remove(bodega);
            em.getTransaction().commit();
        }
    }

    public List<Bodega> listarTodos() {
        return em.createQuery("SELECT b FROM Bodega b", Bodega.class).getResultList();
    }

    public void cerrar() {
        if (em != null && em.isOpen()) em.close();
        if (emf != null && emf.isOpen()) emf.close();
    }
}
