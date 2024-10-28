/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller16_patron_builder;

/**
 *
 * @author jacob
 */
public class Taller16_Patron_Builder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Usuario usuario = new Builder()
                        .setNombre("Usuario 1")
                        .setEdad(18)
                        .setCorreo("Correo@test.com")
                        .build();
        System.out.println(usuario.toString());
    }
    
}
