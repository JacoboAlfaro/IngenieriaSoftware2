/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1srp;

/**
 *
 * @author jacob
 */
public class NotificacionesService{
    
    public String EnviarCorreo(String correo){
        return "Correo enviado correctamente a: " + correo;
    }
    
    /*
    Se separa el envio de correo de la clase usuario ya que esta clase no 
    deberia encargarse de funciones no propias de un usuario, para ello
    se crea una clase notificacionesService encargada unicamente de las
    notificaciones por diferentes métodos.
    */
}
