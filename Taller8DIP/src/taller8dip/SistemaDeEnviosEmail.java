/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8dip;

/**
 *
 * @author jacob
 */
public class SistemaDeEnviosEmail {
    private IServicioEmail _servicioEmail;

    public SistemaDeEnviosEmail(IServicioEmail servicioEmail) {
        this._servicioEmail = servicioEmail;
    }
    
    public void enviarEmail(){
        _servicioEmail.enviarEmail();
    }
    
    
}
