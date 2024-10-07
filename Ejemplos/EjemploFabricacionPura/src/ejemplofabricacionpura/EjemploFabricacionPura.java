/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplofabricacionpura;

/**
 *
 * @author jacob
 */
public class EjemploFabricacionPura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Fabricante fabrica = new Fabricante();
        Mesa mesa = fabrica.crearMesa("2");
        Cocinero cocinero = fabrica.crearCocinero("12124123", "Chef 1", "2");
        Camarero camarero = fabrica.crearCamarero("Camarero 1", "143252");
    }
    
}
