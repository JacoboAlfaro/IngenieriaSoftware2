/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_patron_bridge;

/**
 *
 * @author jacob
 */
public abstract class Mensaje {
    
    protected IPlataformaMensaje plataforma;

    public Mensaje(IPlataformaMensaje plataforma) {
        this.plataforma = plataforma;
    }
    public abstract void enviarMensaje(String mensaje);
    
}
