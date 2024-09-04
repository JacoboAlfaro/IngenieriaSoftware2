/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller6isp;

/**
 *
 * @author jacob
 */
public class Cartilla implements CartillaInterface{
    private String nombre;
    private int numeroHojas;

    public Cartilla(String nombre, int numeroHojas) {
        this.nombre = nombre;
        this.numeroHojas = numeroHojas;
    }
    
    @Override
    public void prestar() {
        System.out.println("Prestando Cartilla " + this.nombre);
    }

    @Override
    public void devolver() {
        System.out.println("Devolviendo Cartilla " + this.nombre);
    }

    @Override
    public void mantenimeintoHojas() {
        System.out.println("Se realiza mantenimiento de hojas del Libro " + this.nombre);
    }
}
