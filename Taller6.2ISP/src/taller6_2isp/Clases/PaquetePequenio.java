/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller6_2isp.Clases;

import Interfaces.IPaquetePequenio;

/**
 *
 * @author jacob
 */
public class PaquetePequenio extends Paquete implements IPaquetePequenio{ 
    
    private double valorDeclarado;

    public PaquetePequenio(double valorDeclarado, double peso, String dimensiones) {
        super(peso, dimensiones);
        this.valorDeclarado = valorDeclarado;
    }

    public double getValorDeclarado() {
        return valorDeclarado;
    }

    @Override
    public void calcularCostoEnvioPequenio() {
        System.out.println(this.getPeso() * valorDeclarado);
    }
}
