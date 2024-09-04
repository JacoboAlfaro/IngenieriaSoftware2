/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller7_1dip;

/**
 *
 * @author jacob
 */
public class Taller7_1DIP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario user = new Usuario("Jacobo", "1312432");
        IServicioDeCorreo servicio = new ServicioDeCorreoImpl();
        UsuarioFuncionalidad funcionalidad = new UsuarioFuncionalidad(servicio);
        
        funcionalidad.enviarNotificacion(user);
    }
    
}
