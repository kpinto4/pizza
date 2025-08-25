package com.GAAF;

import java.util.List;

import com.GAAF.CRUD.BodegaCRUD;
import com.GAAF.Modelo.Bodega;

public class Main {
    public static void main(String[] args) {
        ejecutarCRUDBodega();
    }




    
    //BODEGA CRUD   
    public static void ejecutarCRUDBodega() {
        BodegaCRUD bodegaCRUD = new BodegaCRUD();

        // Crear una nueva bodega
        Bodega nuevaBodega = new Bodega();
        nuevaBodega.setLugar("Ciudad A");
        bodegaCRUD.crear(nuevaBodega);
        System.out.println("Bodega creada con ID: " + nuevaBodega.getIdBodega());

        // Buscar una bodega por ID
        Long idAActualizar = 5L; // Reemplaza 5L con el ID que quieras actualizar
        Bodega bodegaBuscada;

        try {
            bodegaBuscada = bodegaCRUD.buscar(idAActualizar);
            if (bodegaBuscada == null) {
                System.out.println("Bodega no encontrada con ID: " + idAActualizar);
                return;
            }

            // Actualizar la bodega
            bodegaBuscada.setLugar("Ciudad B");
            bodegaCRUD.actualizar(bodegaBuscada);
            System.out.println("Bodega actualizada a: " + bodegaBuscada.getLugar());

        } catch (Exception e) {
            System.out.println("Error al buscar o actualizar la bodega: " + e.getMessage());
        } finally {
            bodegaCRUD.cerrar();
        }


        // Listar todas las bodegas
        List<Bodega> todasLasBodegas = bodegaCRUD.listarTodos();
        System.out.println("Listado de todas las bodegas:");
        for (Bodega b : todasLasBodegas) {
            System.out.println("ID: " + b.getIdBodega() + ", Lugar: " + b.getLugar());
        }

        // Borrar la bodega
        Long idABorrar = 5L;  // Reemplaza 5L con el ID que quieras eliminar

            try {
            bodegaCRUD.borrar(idABorrar);
            System.out.println("Bodega con ID " + idABorrar + " eliminada correctamente.");
            } finally {
            bodegaCRUD.cerrar();
        }

        // Cerrar el EntityManager y EntityManagerFactory
        bodegaCRUD.cerrar();
    }

}