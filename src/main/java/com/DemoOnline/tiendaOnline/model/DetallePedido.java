package com.DemoOnline.tiendaOnline.model;

public class DetallePedido {
    private Integer id;
    private String nombre;
    private double cantidad;
    private double precio;
    private double total;
    private String estado;
    public DetallePedido() {

    }
    public DetallePedido(Integer id, String nombre, double cantidad, double precio, double total, String estado) {
        super ();
        this.id = id;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = total;
        this.estado = estado;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getCantidad() {
        return cantidad;
    }
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "DetallePedido [id=" + id + ", nombre=" + nombre + ", cantidad=" + cantidad
                + ", precio=" + precio + ", total=" + total + ", estado=" + estado + "]";
    }
}
