package com.example.test_scringboot;

public class ProductosLimpieza {

    private int id_producto;
    private  String descripcion;
    private int stock;
    private  int precio;

    public ProductosLimpieza(){
        this.id_producto = 0;
        this.descripcion = "";
        this.stock = 0;
        this.precio = 0;

    }
    public void setId_producto(Integer id) {
        this.id_producto = id;
    }

    public String Descripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public int Id_producto() {
        return this.id_producto;
    }

    public int Stock() {
        return this.stock;
    }
    public int  Precio(){
        return this.precio;
    }

}
