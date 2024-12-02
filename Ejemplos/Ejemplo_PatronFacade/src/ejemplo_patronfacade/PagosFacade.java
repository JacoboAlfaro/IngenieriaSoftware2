/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_patronfacade;

/**
 *
 * @author jacob
 */
public class PagosFacade {
    private SubsistemaDisponibilidad disponibilidad;
    private SubsistemaConfirmacionPago confirmacionPago;
    private SubsistemaPago pago;
    
    public PagosFacade(){
        disponibilidad = new SubsistemaDisponibilidad();
        confirmacionPago = new SubsistemaConfirmacionPago();
        pago = new SubsistemaPago();
    }
    
    public void comprarBoleto(){
        disponibilidad.prcesarDisponibilidad();
        pago.procesarPago();
        confirmacionPago.procesarConfirmacion();
    }
}
