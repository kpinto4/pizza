package com.GAAF.Modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "bodega")
public class Bodega {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bodega")
    private Long idBodega;

    @Column(name = "lugar", length = 20, nullable = false)
    private String lugar;

    // Relación 1 Bodega a muchos Pedidos
    @ManyToMany(mappedBy = "bodegas")
    private List<Pedido> pedidos;


    // Getters y setters
    public Long getIdBodega() {
        return idBodega;
    }
    public void setIdBodega(Long idBodega) {
        this.idBodega = idBodega;
    }
    public String getLugar() {
        return lugar;
    }
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public List<Pedido> getPedidos() {
        return pedidos;
    }
    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }


    
}
