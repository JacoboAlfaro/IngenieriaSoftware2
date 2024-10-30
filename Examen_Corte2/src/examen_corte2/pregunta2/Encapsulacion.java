/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_corte2.pregunta2;

/**
 *
 * @author jacob
 */
public class Encapsulacion {
    INotificador notificador;

    public Encapsulacion(INotificador notificador) {
        this.notificador = notificador;
    }
    
    public void enviarNotificacion(){
        this.notificador.EnviarNotificacion();
    }
}
