/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller6_2isp.Clases;

import Interfaces.IPaqueteGrande;

/**
 *
 * @author jacob
 */
public class PaqueteGrande extends Paquete implements IPaqueteGrande{
    public double volumen;
    public String medioTransporte;

    public PaqueteGrande(double volumen, String medioTransporte, double peso, String dimensiones) {
        super(peso, dimensiones);
        this.volumen = volumen;
        this.medioTransporte = medioTransporte;
    }

    public double getVolumen() {
        return volumen;
    }

    public String getMedioTransporte() {
        return medioTransporte;
    }

    @Override
    public void calcularCostoEnvioGrande() {
        System.out.println(this.getPeso() * volumen); 
    }
    
    
}
