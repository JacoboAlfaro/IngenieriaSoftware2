/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pregunta4;

/**
 *
 * @author jacob
 */
public class main4 {
    public static void main(String[] args) {
        System.out.println("PREGUNTA 4");
        Configuracion config = Configuracion.getInstancia();
        System.out.println("Config url: " + config.getUrl());
        System.out.println("Config username: " + config.getUsuario());
        System.out.println("Config password: " + config.getContrasenia());
        
        Configuracion config2 = Configuracion.getInstancia();


        System.out.println("No se puede crear otra instancia : " + (config == config2));
    }
    
}
