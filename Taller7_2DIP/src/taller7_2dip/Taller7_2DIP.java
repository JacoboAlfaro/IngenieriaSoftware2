
package taller7_2dip;

import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author jacob
 */
public class Taller7_2DIP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IProcesarOrdenFedex procesarOrdenFedex = new ProcesarOrdenFedexImpl();
        IProcesarOrdenDHL procesarOrdenDHL = new ProcesarOrdenDHLImpl();
        IProcesarOrdenUPS procesarOrdenUPS = new ProcesarOrdenUPSImpl();
        SistemaEnvios sistemaEnvios = new SistemaEnvios(procesarOrdenFedex,procesarOrdenDHL,procesarOrdenUPS);
        
        Orden orden = new Orden(new Date(), "Manizales" , "Bogota");
        sistemaEnvios.enviarOrdenFedex(orden);
        sistemaEnvios.enviarOrdenDHL(orden);
        sistemaEnvios.enviarOrdenUPS(orden);
    }
    
}
