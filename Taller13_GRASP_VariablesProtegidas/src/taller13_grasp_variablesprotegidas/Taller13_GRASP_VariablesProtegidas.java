
package taller13_grasp_variablesprotegidas;

/**
 *
 * @author jacob
 */
public class Taller13_GRASP_VariablesProtegidas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ICanalNotificacion notificadorW = new CanalWhatsapp();
        ICanalNotificacion notificadorSMS = new CanalSMS();
        ICanalNotificacion notificadorCorreo = new CanalCorreoElectronico();
        Notificador notificarWhatsapp = new Notificador(notificadorW);
        Notificador notificarSMS = new Notificador(notificadorSMS);
        Notificador notificarCorreo= new Notificador(notificadorCorreo);
        notificarWhatsapp.enviarNotificacion();
        notificarSMS.enviarNotificacion();
        notificarCorreo.enviarNotificacion();
    }
    
}
