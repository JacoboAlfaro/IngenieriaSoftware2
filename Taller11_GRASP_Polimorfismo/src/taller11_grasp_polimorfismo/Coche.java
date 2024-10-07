/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11_grasp_polimorfismo;

/**
 *
 * @author jacob
 */
public class Coche implements ITransporte {
    private int puertas;
    private int kilometraje;
    private String marca;

    public Coche(int puertas, int kilometraje, String marca) {
        this.puertas = puertas;
        this.kilometraje = kilometraje;
        this.marca = marca;
    }
    

    @Override
    public void acelerar() {
        System.out.println("Carro acelerando");
    }

    @Override
    public void frenar() {
        System.out.println("Carro frenado");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Carro informacion");
    }
    
    public void encenderLuces(){
        System.out.println("Carro encendiendo luces");
    }
    
}
