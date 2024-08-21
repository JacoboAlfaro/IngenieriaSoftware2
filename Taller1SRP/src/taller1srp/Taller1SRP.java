/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller1srp;

/**
 *
 * @author jacob
 */
public class Taller1SRP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Cada explicacion de la separacion del codigo se encuentra dentro de cada clase.
        */
        
        //Crear usuario
        Usuario user1 = new Usuario("Jacobo", "jacobo.alfaro06@gmail.com", "Hola123");
        
        //Mostrar informacion del usuario
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        System.out.println("INFORMACION DEL USUARIO");
        usuarioDAO.obtenerInformacion(user1);

        //Envio de Correo
        NotificacionesService notificacionesService = new NotificacionesService();
        String mesagge = notificacionesService.EnviarCorreo(user1.getCorreo());
        System.out.println(mesagge);
        
        //Validar Contraseña
        AutenticacionService autenticacionService = new AutenticacionService();
        System.out.println(autenticacionService.ValidarContrasenia(user1));
        
        //CalcularSalario
        SalarioService salarioService = new SalarioService();
        salarioService.calcularSalarioUsuario(user1, 10);
        
    }
    
}
