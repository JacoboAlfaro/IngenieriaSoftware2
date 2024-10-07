/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploaltacohesionbajoacoplamiento;

/**
 *
 * @author jacob
 */
public class ServicioNotificacionesImpl implements IServicioNotificaciones{

    @Override
    public void enviarNotificacioSMS() {
        System.out.println("ENVIANDO NOTIFICACION POR SMS");
    }

    @Override
    public void enviarNotificacioWhatsapp() {
        System.out.println("ENVIANDO NOTIFICACION POR WHATSAPP");
    }
    
}
