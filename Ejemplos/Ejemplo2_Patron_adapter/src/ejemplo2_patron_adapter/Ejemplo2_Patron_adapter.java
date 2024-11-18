/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo2_patron_adapter;

/**
 *
 * @author jacob
 */
public class Ejemplo2_Patron_adapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // CLIENTE SIMULACION
        
        SistemaPagoExterno sistemaPagoExterno = new SistemaPagoExterno();
        ISistemaPagos sistemaPago = new AdapterSistemaPagoExterno(sistemaPagoExterno);
        
        sistemaPago.procesarPago();
                
    }
    
}
