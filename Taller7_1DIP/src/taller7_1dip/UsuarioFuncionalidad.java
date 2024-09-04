/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller7_1dip;

/**
 *
 * @author jacob
 */
public class UsuarioFuncionalidad {
    
    private IServicioDeCorreo _servicioDeCorreo;

    public UsuarioFuncionalidad(IServicioDeCorreo servicioDeCorreo) {
        this._servicioDeCorreo = servicioDeCorreo;
    }
    
    public void enviarNotificacion(Usuario usuario){
        _servicioDeCorreo.enviarCorreo(usuario);
    }
    
    
}
