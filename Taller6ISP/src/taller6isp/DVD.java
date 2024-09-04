/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller6isp;

/**
 *
 * @author jacob
 */
public class DVD implements DVDInterface{ 
    private String nombre;
    private int stock;
    private double tamanio;

    public DVD(String nombre, int stock, double tamanio) {
        this.nombre = nombre;
        this.stock = stock;
        this.tamanio = tamanio;
    }

    @Override
    public void prestar() {
        System.out.println("DVD prestado");
    }

    @Override
    public void devolver() {
        System.out.println("DVD devuelto");
    }
    
    
}
