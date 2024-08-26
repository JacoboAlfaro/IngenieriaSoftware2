/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1ocp;

/**
 *
 * @author jacob
 */
public class EnvioExpress implements EnvioInterface{
    private double peso;
    private double distancia;

    public EnvioExpress(double peso, double distancia) {
        this.peso = peso;
        this.distancia = distancia;
    }
    
    @Override
    public double calcularPrecio(){
        return (this.peso * 1.0) + (this.distancia * 0.2);
    }
    
    public double getPeso() {
        return peso;
    }

    public double getDistancia() {
        return distancia;
    }
    
    /*
        Se crea metodo calcularPrecio en la clase EnvioExpress implementando la interfaz EnvioInterface 
    */
}
