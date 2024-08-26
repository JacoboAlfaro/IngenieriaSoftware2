/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package taller1ocp;

/**
 *
 * @author jacob
 */
public interface EnvioInterface {
    
    public double calcularPrecio();
    
    /*
        Se crea una interfaz con el fin de cumplir el principio OCP de SOLID.
        permitiendonos asi, en caso de agregar nuevos metodos de envio, no tener que modificar
        codigo ya existente y evitar problemas futuros.
    */
}
