package com.ultratech.ecommerce.models;

public class Producto {

    String nombre;
    String descripcion;
    int imagen;
    double precio;

    public Producto(String nombre, String descripcion, int imagen, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getImagen() {
        return imagen;
    }

    public double getPrecio() {
        return precio;
    }
}