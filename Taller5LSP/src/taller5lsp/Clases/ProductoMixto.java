/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller5lsp.Clases;

import taller5lsp.Envio;

/**
 *
 * @author jacob
 */
public class ProductoMixto extends Producto implements Envio{

    private double peso;
    private double tamArchivo;

    public ProductoMixto(double peso, double tamArchivo, String nombre, double precio, int cantidad) {
        super(nombre, precio, cantidad);
        this.peso = peso;
        this.tamArchivo = tamArchivo;
    }
    
    
    @Override
    public double caluclarCostoTotal() {
        return (this.peso * this.getPrecio()) + ( this.tamArchivo * this.getCantidad());
    }
    
    @Override
    public void enviarPorCorreo(){
        System.out.println("Estoy enviando este producto mixto por correo");
    }
    
}
