/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11_grasp_polimorfismo;

/**
 *
 * @author jacob
 */
public class Bicicleta implements ITransporte {
    private boolean luces;
    private int numCambios;

    public Bicicleta(boolean luces, int numCambios) {
        this.luces = luces;
        this.numCambios = numCambios;
    }
    
    @Override
    public void acelerar() {
        System.out.println("Bicicleta acelerando");
    }

    @Override
    public void frenar() {
        System.out.println("Bicicleta frenado");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Bicicleta informacion");
    }
    
    public void pedalear(){
        System.out.println("Bicicleta pedaleando");
    }
}

