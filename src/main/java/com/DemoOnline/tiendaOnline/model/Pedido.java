package com.DemoOnline.tiendaOnline.model;

public class Pedido {
    private Integer id;
    private String numero;
    private String creado;
    private String cofirmado;
    private String cancelado;

    public Pedido() {
        super();
        this.id = id;
        this.numero = numero;
        this.creado = creado;
        this.cofirmado = cofirmado;

    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getCreado() {
        return creado;
    }
    public void setCreado(String creado) {
        this.creado = creado;
    }
    public String getCofirmado() {
        return cofirmado;
    }
    public void setCofirmado(String cofirmado) {
        this.cofirmado = cofirmado;
    }
    public String getCancelado() {
        return cancelado;
    }
    public void setCancelado(String cancelado) {
        this.cancelado = cancelado;
    }

    @Override
    public String toString() {
        return "Pedido [id=" + id + ", numero=" + numero + ", creado=" + creado
                + ", cofirmado=" + cofirmado + ", cancelado=" + cancelado + "]";
    }
}
