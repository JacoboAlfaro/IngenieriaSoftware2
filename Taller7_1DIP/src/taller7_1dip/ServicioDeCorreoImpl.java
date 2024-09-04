/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller7_1dip;

/**
 *
 * @author jacob
 */
public class ServicioDeCorreoImpl implements IServicioDeCorreo{
    
    @Override
    public void enviarCorreo(Usuario usuario){
        System.out.println("Enviando correo a: " + usuario.getNombre());
    }
}
