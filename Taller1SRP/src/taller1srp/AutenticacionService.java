/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1srp;

/**
 *
 * @author jacob
 */
public class AutenticacionService {
    public String ValidarContrasenia(Usuario usuario){
        String password= "Hola123";
        
        System.out.println("Test");
        
        if(usuario.getContrasenia() != password){
            return "Contrasena incorrecta";
        }
        
        return "Contraseña correcta, acceso validado";
    }
    
    /*
    Se separa la autenticación de usuarios de la clase Usuario ya que esta clase no 
    debería encargarse de validar si la contraseña ingresada por un usuario es correcta o no, 
    para ello se crea una clase autenticacionService encargada unicamente de los
    diferentes metodos con los que cuente la aplicacion para validar info. de usuarios.
    */
}
