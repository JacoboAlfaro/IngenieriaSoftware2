/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller16_patron_prototype;

/**
 *
 * @author jacob
 */
public class Producto implements Prototype{
    private String nombre;
    private double precio;
    private String categoria;

    public Producto(String nombre, double precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public Prototype clonar() {
        return new Producto(nombre, precio, categoria);
    }

    public void mostrarInformacion() {
        System.out.println("NOMBRE: " + nombre);
        System.out.println("PRECIO: " + precio);
        System.out.println("CATEGORIA: " + categoria);
    }
    
    
    
}
