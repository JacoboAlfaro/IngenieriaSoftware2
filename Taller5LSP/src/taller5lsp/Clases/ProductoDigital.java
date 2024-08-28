/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller5lsp.Clases;

/**
 *
 * @author jacob
 */
public class ProductoDigital extends Producto {

    private double tamArchivo;

    public ProductoDigital(double tamArchivo, String nombre, double precio, int cantidad) {
        super(nombre, precio, cantidad);
        this.tamArchivo = tamArchivo;
    }

    
    
    @Override
    public double caluclarCostoTotal() {
        return this.tamArchivo * this.getPrecio() * this.getCantidad();
    }
    
}
