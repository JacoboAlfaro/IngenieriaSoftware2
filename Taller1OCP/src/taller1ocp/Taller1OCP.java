/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller1ocp;

/**
 *
 * @author jacob
 */
public class Taller1OCP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Cada explicacion de la separacion del codigo se encuentra dentro de cada clase.
        */
        
        EnvioInterface estandar = new EnvioEstandar(10, 100);
        EnvioInterface express = new EnvioExpress(10, 100);
        EnvioInterface internacional = new EnvioInternacional(10, 100);
        
        CalcularCostoService calcularCostoService = new CalcularCostoService();
        
        System.out.println("Costo de envio estandar: " + calcularCostoService.calcularCosto(estandar));
        System.out.println("Costo de envio express: " + calcularCostoService.calcularCosto(express));
        System.out.println("Costo de envio internacional: " + calcularCostoService.calcularCosto(internacional));


    }
    
}
