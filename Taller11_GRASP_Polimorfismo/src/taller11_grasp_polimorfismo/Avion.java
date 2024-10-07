/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11_grasp_polimorfismo;

/**
 *
 * @author jacob
 */
public class Avion implements ITransporte {
    private double aluturaMax;
    private double velMax;
    private String aerolinea;

    public Avion(double aluturaMax, double velMax, String aerolinea) {
        this.aluturaMax = aluturaMax;
        this.velMax = velMax;
        this.aerolinea = aerolinea;
    }

    @Override
    public void acelerar() {
        System.out.println("Avion acelerando");
    }

    @Override
    public void frenar() {
        System.out.println("Avion frenado");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Avion informacion");
    }
    
    public void volar(){
        System.out.println("Avion volando");
    }
    
    
}

