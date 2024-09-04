/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller6_2isp.Clases;

/**
 *
 * @author jacob
 */
public abstract class Paquete {
    private double peso;
    private String dimensiones;

    public Paquete(double peso, String dimensiones) {
        this.peso = peso;
        this.dimensiones = dimensiones;
    }

    public double getPeso() {
        return peso;
    }

    public String getDimensiones() {
        return dimensiones;
    }
}
