package com.GAAF.Modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long idProducto;

    @Column(name = "descripcion", length = 200, nullable = false)
    private String descripcion;

    @Column(name = "peso_kg", precision = 12, scale = 2, nullable = false)
    private BigDecimal pesoKg;

    @Column(name = "estado_cacao", length = 100, nullable = false)
    private String estadoCacao;

    @Column(name = "humedad", precision = 12, scale = 2, nullable = false)
    private BigDecimal humedad;

    @Column(name = "fermentacion", precision = 12, scale = 2, nullable = false)
    private BigDecimal fermentacion;

    @ManyToOne
    @JoinColumn(name = "id_pedido", nullable = false)
    private Pedido pedido;

    // Getters y setters
    public Long getIdProducto() {
        return idProducto;
    }
    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public BigDecimal getPesoKg() {
        return pesoKg;
    }
    public void setPesoKg(BigDecimal pesoKg) {
        this.pesoKg = pesoKg;
    }
    public String getEstadoCacao() {
        return estadoCacao;
    }
    public void setEstadoCacao(String estadoCacao) {
        this.estadoCacao = estadoCacao;
    }
    public BigDecimal getHumedad() {
        return humedad;
    }
    public void setHumedad(BigDecimal humedad) {
        this.humedad = humedad;
    }
    public BigDecimal getFermentacion() {
        return fermentacion;
    }
    public void setFermentacion(BigDecimal fermentacion) {
        this.fermentacion = fermentacion;
    }
    public Pedido getPedido() {
        return pedido;
    }
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
 
}
