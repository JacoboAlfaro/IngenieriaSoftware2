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
public class ProductoFisico extends Producto implements Envio{
    
    private double peso;

    public ProductoFisico(double peso, String nombre, double precio, int cantidad) {
        super(nombre, precio, cantidad);
        this.peso = peso;
    }

    @Override
    public double caluclarCostoTotal() {
        return this.peso * this.getPrecio();
    }
    
    @Override
    public void enviarPorCorreo(){
        System.out.println("Estoy enviando este producto fisico por correo");
    }
    
    
}
