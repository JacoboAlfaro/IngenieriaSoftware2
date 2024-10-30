/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_corte2.pregunta2;

/**
 *
 * @author jacob
 */
public class mainPregunta2 {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Pregunta 2");
        
        Encapsulacion notificadorWhatsapp = new Encapsulacion(new NotificadorWhatsappImpl());
        Encapsulacion notificadorSMS = new Encapsulacion(new NotificadorSMSImpl());
        
        notificadorSMS.enviarNotificacion();
        notificadorWhatsapp.enviarNotificacion();
    }
}
