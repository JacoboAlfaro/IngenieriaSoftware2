/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller6_2isp.Clases;

import Interfaces.IPaquetePeligroso;

/**
 *
 * @author jacob
 */
public class PaquetePeligroso extends Paquete implements IPaquetePeligroso{
    
    private String etiquetas;
    private boolean embalajeEspecial;

    public PaquetePeligroso(String etiquetas, boolean embalajeEspecial, double peso, String dimensiones) {
        super(peso, dimensiones);
        this.etiquetas = etiquetas;
        this.embalajeEspecial = embalajeEspecial;
    }

    public String getEtiquetas() {
        return etiquetas;
    }

    public boolean isEmbalajeEspecial() {
        return embalajeEspecial;
    }

    public void setEtiquetas(String etiquetas) {
        this.etiquetas = etiquetas;
    }

    public void setEmbalajeEspecial(boolean embalajeEspecial) {
        this.embalajeEspecial = embalajeEspecial;
    }
    

    @Override
    public void verificarCOntenidoPeligroso() {
        System.out.println("Se verifica el contendio del paquete peligroso");
    }

    @Override
    public void asegurarPaquetePeligroso() {
        if(this.embalajeEspecial){
            System.out.println("Paquete ya asegurado");
        }else{
            this.setEmbalajeEspecial(true);
            System.out.println("Se asegura el paquete peligroso");
        }
    }
    
    
}
