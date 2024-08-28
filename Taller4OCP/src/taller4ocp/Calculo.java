/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller4ocp;

/**
 *
 * @author jacob
 */
public abstract class Calculo {
    
    private String producto;
    private int cantidad;
    private double precio;

    public Calculo(String producto, int cantidad, double precio) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }
    
    public abstract double calcularImpuesto();
    
    /*
    Se crea la clase abstracta Calculo la cual tendra los datos propias de todas las clases Impuesto,
    además de un metodo abstract CalcularImpuesto para que todas las clases que extiendan de Calculo 
    lo tengan. Esto con el fin de no violar el principio OCP de SOLID y volver el codigo mas modular y
    facil de mantener.
    */
}
