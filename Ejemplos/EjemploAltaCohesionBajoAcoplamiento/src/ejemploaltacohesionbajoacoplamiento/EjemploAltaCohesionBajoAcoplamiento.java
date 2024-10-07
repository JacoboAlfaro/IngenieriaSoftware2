/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploaltacohesionbajoacoplamiento;

/**
 *
 * @author jacob
 */
public class EjemploAltaCohesionBajoAcoplamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SistemaTareas sistema = new SistemaTareas(new ServicioNotificacionesImpl(), new TareaDAOImpl());
        sistema.getDAO().leer();
        sistema.getServicioNotificaciones().enviarNotificacioSMS();
        sistema.getServicioNotificaciones().enviarNotificacioWhatsapp();
        
    }
    
}
