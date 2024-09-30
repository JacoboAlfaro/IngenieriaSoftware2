/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller10_grasp_creador;

/**
 *
 * @author jacob
 */
public class ComputadoraFactory implements IComputadoraFactory{
    
    /*
        Se crea el objeto de tipo computadora dentro de la fabica de 
        computadoras en vez de dentro de la porpia clase
    */
    @Override
    public Computadora crearComputadora(String procesador, String tarjetaGrafica, int ram){
        return new Computadora(procesador, tarjetaGrafica, ram);
    }
}
