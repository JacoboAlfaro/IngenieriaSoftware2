/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller12_grasp_indireccion;

/**
 *
 * @author jacob
 */
public class Taller12_GRASP_Indireccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        IServicioNotificaciones servicioNotificaciones = new ServicioNotificacionesImpl();
        Usuario user = new Usuario("Nombre1", "23132543");
        Correo correo = servicioNotificaciones.crearCorreo(user);
        System.out.println(correo.getUsuario().getIdentificacion());
    }
    
}
