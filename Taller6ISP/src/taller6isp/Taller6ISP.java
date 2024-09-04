/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller6isp;

/**
 *
 * @author jacob
 */
public class Taller6ISP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Se separa las interfaces por metodos porpios de cada clase, eliminado
        //por completo la interfaz Libreria
        
        System.out.println("METODOS LIBRO");
        Libro libro1 = new Libro("Principito", 126, "Portada1", "Norma");
        libro1.devolver();
        libro1.prestar();
        libro1.renovarPortada();
        libro1.mantenimeintoHojas();
        libro1.soliciarNuevaVersion();
        
        System.out.println("METODOS DVD");
        DVD dvd1 = new DVD("DVD 1", 12, 1253);
        dvd1.prestar();
        dvd1.devolver();
        
        System.out.println("METODOS CARTILLA");
        Cartilla cartilla1 = new Cartilla("Cartilla Nacho", 324);
        cartilla1.prestar();
        cartilla1.devolver();
        cartilla1.mantenimeintoHojas();
    }
    
}
