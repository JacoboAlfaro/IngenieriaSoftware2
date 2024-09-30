/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller10_grasp_creador;

/**
 *
 * @author jacob
 */
public class Taller10_GRASP_Creador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        IComputadoraFactory computadoraFactory = new ComputadoraFactory();
        Orden orden = new Orden(computadoraFactory);

        orden.agregarComputadoraCarrito("Ryzen 5", "RTX4090", 64);
        orden.agregarComputadoraCarrito("Intel Core i9", "GTX1060", 12);
        orden.agregarComputadoraCarrito("Intel Core i5 12500H", "RTX3050", 8);
        orden.listarOrden();
    }
    
}
