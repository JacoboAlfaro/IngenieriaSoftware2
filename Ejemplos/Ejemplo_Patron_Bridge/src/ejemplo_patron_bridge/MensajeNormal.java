/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_patron_bridge;

/**
 *
 * @author jacob
 */
public class MensajeNormal extends Mensaje{

    public MensajeNormal(IPlataformaMensaje plataforma) {
        super(plataforma);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        //logica adicional
        System.out.println("Mensaje Urgente");
        plataforma.enviarMensaje(mensaje);
    }
    
}
