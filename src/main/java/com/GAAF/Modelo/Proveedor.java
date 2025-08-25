package com.GAAF.Modelo;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "proveedor")
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proveedor")
    private Long idProveedor;

    @Column(name = "nombre", length = 80, nullable = false)
    private String nombre;

    @Column(name = "direccion", length = 50, nullable = false)
    private String direccion;

    @Column(name = "telefono", length = 10, nullable = false)
    private String telefono;

    @Column(name = "correo", length = 50, nullable = false)
    private String correo;

    @Column(name = "observaciones", length = 200)
    private String observaciones;

    @Column(name = "ciudad", length = 30, nullable = false)
    private String ciudad;

    @Column(name = "vereda", length = 30, nullable = false)
    private String vereda;

    @Column(name = "activo", nullable = false, length = 1)
    private String activo;  // 'S' or 'N'

    // 1 Proveedor a Muchos Pedidos
    @OneToMany(mappedBy = "proveedor", cascade = CascadeType.ALL)
    private List<Pedido> pedidos;

    // Getters y setters
    public Long getIdProveedor() {
        return idProveedor;
    }
    public void setIdProveedor(Long idProveedor) {
        this.idProveedor = idProveedor;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getObservaciones() {
        return observaciones;
    }
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getVereda() {
        return vereda;
    }
    public void setVereda(String vereda) {
        this.vereda = vereda;
    }
    public String getActivo() {
        return activo;
    }
    public void setActivo(String activo) {
        this.activo = activo;
    }
    public List<Pedido> getPedidos() {
        return pedidos;
    }
    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

 
    
}
