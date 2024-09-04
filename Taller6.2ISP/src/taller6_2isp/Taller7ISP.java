/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller6_2isp;

import Interfaces.IPaqueteGrande;
import Interfaces.IPaquetePeligroso;
import Interfaces.IPaquetePequenio;
import taller6_2isp.Clases.PaqueteGrande;
import taller6_2isp.Clases.PaquetePeligroso;
import taller6_2isp.Clases.PaquetePequenio;

/**
 *
 * @author jacob
 */
public class Taller7ISP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //SE SEPARA LOS METODOS DE LA INTERFAZ PAQUETE EN UNA INTERFAZ POR CADA 
        //CLASE QUE EXTIENDE DE PAQUE QUE SOLO CONTENGA METODOS QUE USA
        
        IPaqueteGrande paqueteGrande = new PaqueteGrande(12, "Bus", 12.4, "12x21x43");
        IPaquetePequenio paqutePequenio = new PaquetePequenio(12.32, 123, "11x54x10");
        IPaquetePeligroso paquetePeligroso = new PaquetePeligroso("desechos", false, 123.2, "12x53");
        
        //Metodos interfaz paqueteGrande
        paqueteGrande.calcularCostoEnvioGrande();
        
        //Metodos interfaz paquetePequenio
        paqutePequenio.calcularCostoEnvioPequenio();
        
        //Metodos interfaz paquetePeligroso
        paquetePeligroso.verificarCOntenidoPeligroso();
        paquetePeligroso.asegurarPaquetePeligroso();
    }
    
}
