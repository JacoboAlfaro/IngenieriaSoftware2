/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_patron_bridge;

/**
 *
 * @author jacob
 */
public class CorreoElectronico implements IPlataformaMensaje{

    @Override
    public void enviarMensaje() {
        System.out.println("Enviando mensaje Correo electronico");
    }
   
}
