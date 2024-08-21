/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1srp;

/**
 *
 * @author jacob
 */
public class UsuarioDAO {
    
    public void obtenerInformacion(Usuario usuario){
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Correo: " + usuario.getCorreo());
        System.out.println("Contraseña: HASH(" + usuario.getContrasenia() + ")");
    }
    
    /*
    Se separa el obtener informacion de usuarios de la clase Usuario ya que esta clase no 
    debería encargarse de la gestion de estos mismos, 
    para ello se crea una clase UsuarioDAO encargada unicamente de la
    gestion de usuarios, ya sea obtener su informacion, actualizarla, crear o eliminar registros (CRUD)
    */
    
}
