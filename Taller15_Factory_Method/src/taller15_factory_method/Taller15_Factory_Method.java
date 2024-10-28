/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller15_factory_method;

/**
 *
 * @author jacob
 */
public class Taller15_Factory_Method {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Creadora creadoraPagoPaypal = new CreadoraPagoPaypal();
        Creadora creadoraPagoTarjeta = new CreadoraPagoTarjeta();
        
        MetodoPago notificacionEmail = creadoraPagoPaypal.crear(10000);
        MetodoPago notificacionSMS = creadoraPagoTarjeta.crear(1200);
        
        notificacionEmail.procesarPago(5000);
        notificacionSMS.procesarPago(200);
    }
    
}
