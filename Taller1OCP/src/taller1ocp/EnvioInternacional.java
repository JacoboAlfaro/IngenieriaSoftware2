/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1ocp;

/**
 *
 * @author jacob
 */
public class EnvioInternacional implements EnvioInterface{
    private double peso;
    private double distancia;

    public EnvioInternacional(double peso, double distancia) {
        this.peso = peso;
        this.distancia = distancia;
    }

    public double getPeso() {
        return peso;
    }

    public double getDistancia() {
        return distancia;
    }
    
    @Override
    public double calcularPrecio() {
        return (this.peso * 5.0) + (this.distancia * 0.7);
    }
    
    
}
