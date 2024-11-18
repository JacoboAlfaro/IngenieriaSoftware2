/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller17_patron_singleton;

/**
 *
 * @author jacob
 */
public class Taller17_Patron_Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Settings ajustes = Settings.getInstancia();
        
        System.out.println("configuraciones: " + ajustes.getConfiguracion());
        
        Settings ajustes2 = Settings.getInstancia();
        System.out.println("Son la misma instancia? : " + (ajustes == ajustes2));
    }
    
}
