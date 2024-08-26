/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2srp;

import taller2srp.Clases.Factura;

/**
 *
 * @author jacob
 */
public class NotificacionesService {
    
    //CONSTANTE
    private final String CORREO_DIAN = "correodian@test.com";
    
    public void enviarEmailFactura(String correo, Factura factura){
        System.out.println("Factura con codigo: " + factura.getCodigo() + 
                        " enviado por correo correctamente a: " + correo); 
    }
    
    public void enviarFacturaDian(Factura factura){
        System.out.println("Factura con codigo: " + factura.getCodigo() +
                        " enviada a la DIAN (" + CORREO_DIAN +") correctamente");
    }
    
    /*
    Se separa el envio de factura por correo y enviar correo a la DIAN
    de la clase Factura ya que esta clase no deberia encargarse de funciones no propias de una factura,
    para ello se crea una clase notificacionesService encargada unicamente de las
    notificaciones por diferentes métodos (incluyendo el envio de correos a diferentes destiantarios).
    */
}
