/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo_patron_singleton;

/**
 *
 * @author jacob
 */
public class Ejemplo_Patron_Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Obtener instancia unica de configuracion
        Configuracion config = Configuracion.getInstancia();
        
        //Mostrar config
        System.out.println("URL: " + config.getUrl());
        System.out.println("Usuario: " + config.getUsuario());
        System.out.println("Contrasenia: " + config.getPassword());
        
        //Verificar unica instancia
        Configuracion config2 = Configuracion.getInstancia();
        System.out.println("¿Son la misma instancia? " + (config == config2));

        
    }
    
}
