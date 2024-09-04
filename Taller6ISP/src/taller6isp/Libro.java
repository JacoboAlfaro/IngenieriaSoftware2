/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller6isp;

/**
 *
 * @author jacob
 */
public class Libro implements LibroInterface{
    private String nombre;
    private int numeroHojas;
    private String imagen;
    private String editorial;

    public Libro(String nombre, int numeroHojas, String imagen, String editorial) {
        this.nombre = nombre;
        this.numeroHojas = numeroHojas;
        this.imagen = imagen;
        this.editorial = editorial;
    }
    
    

    @Override
    public void prestar() {
        System.out.println("Prestando Libro " + this.nombre);
    }

    @Override
    public void devolver() {
        System.out.println("Devolviendo Libro " + this.nombre);
    }

    @Override
    public void renovarPortada() {
        System.out.println("Se renueva la portada del libro " + this.nombre + "a la imagen " + this.imagen);
    }

    @Override
    public void mantenimeintoHojas() {
        System.out.println("Se realiza mantenimiento de hojas del Libro " + this.nombre);
    }

    @Override
    public void soliciarNuevaVersion() {
         System.out.println("Solicitando nueva version del libro " + this.nombre);
    }
    
}
