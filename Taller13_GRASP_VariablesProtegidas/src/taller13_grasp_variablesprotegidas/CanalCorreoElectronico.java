/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller13_grasp_variablesprotegidas;

/**
 *
 * @author jacob
 */
public class CanalCorreoElectronico implements ICanalNotificacion{

    @Override
    public void enviarNotificacion() {
        System.out.println("ENVIANDO NOTIFICACION POR CORREO ELECTRONICO");
    }
    
}
