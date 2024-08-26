/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1ocp;

/**
 *
 * @author jacob
 */
public class CalcularCostoService {
    
    public double calcularCosto(EnvioInterface envio){
        return envio.calcularPrecio();
    }
    
    /*
    Se crea la clase CalcularCostoService para calcular el costo de envio de
    todas las clases que impelemnten la interfaz Envio. Esto para no violar el
    principio OCP de SOLID.
    */
}
