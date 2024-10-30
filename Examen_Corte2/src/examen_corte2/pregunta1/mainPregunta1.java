/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_corte2.pregunta1;

/**
 *
 * @author jacob
 */
public class mainPregunta1 {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("------------------- PREGUNTA 1 -------------------");
        
        
        //DRY
        
        Orden orden1 = new Orden();
        
        System.out.println("CALCULAR PRECIO SIN DESCUENTO: " + orden1.calcularTotalPrecio(10000, 0)); //Sin descuento
         System.out.println("CALCULAR PRECIO CON DESCUENTO: " + orden1.calcularTotalPrecio(12000, 2000)); //Con descuento
        //Principio Controllador
        
        LibreriaController controlador = new LibreriaController(new Libreria());
        controlador.aniadirLibro(new Libro("Libro 1", "Persona 1", 12.4, 2024));
        controlador.buscarLibroTitulo("Libro 1");
        controlador.obtenerLibroPrecios(12000, 200000);
        
        OrdenEstado estado = new OrdenEstado();
        System.out.println(estado.obtenerEstado(100));
        System.out.println(estado.obtenerEstado(10));
    }
}
