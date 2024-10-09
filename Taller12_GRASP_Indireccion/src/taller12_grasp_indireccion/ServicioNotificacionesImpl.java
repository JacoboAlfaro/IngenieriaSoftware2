/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller12_grasp_indireccion;

/**
 *
 * @author jacob
 */
public class ServicioNotificacionesImpl implements IServicioNotificaciones{

    @Override
    public Correo crearCorreo(Usuario usuario) {
        Correo correo = new Correo();
        correo.setUsuario(usuario);
        correo.setAsunto("Asunto");
        correo.setCuerpo("Cuerpo");
        
        System.out.println("Correo creado");
        
        return correo;
    }
    
}
