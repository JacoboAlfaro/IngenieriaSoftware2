/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1ocp;

/**
 *
 * @author jacob
 */
public class EnvioEstandar implements EnvioInterface{
    private double peso;
    private double distancia;

    public EnvioEstandar(double peso, double distancia) {
        this.peso = peso;
        this.distancia = distancia;
    }
    
    @Override
    public double calcularPrecio(){
        return (this.peso * 0.5) + (this.distancia * 0.1);
    }

    public double getPeso() {
        return peso;
    }

    public double getDistancia() {
        return distancia;
    }
    
    /*
        Se crea metodo calcularPrecio en la clase EnvioEstandar implementando la interfaz EnvioInterface 
    */
    
}
