/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller13_grasp_variablesprotegidas;

/**
 *
 * @author jacob
 */
public class Notificador {
    private ICanalNotificacion canalNotificacion;

    public Notificador(ICanalNotificacion canalNotificacion) {
        this.canalNotificacion = canalNotificacion;
    }
    
    public void enviarNotificacion(){
        this.canalNotificacion.enviarNotificacion();
    }
}
