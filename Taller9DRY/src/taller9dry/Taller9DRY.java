/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller9dry;

/**
 *
 * @author jacob
 */
public class Taller9DRY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ValidateEmail valEmail = new ValidateEmail();
        //Email valido
        valEmail.validarEmail("jacobo.alfaroh@autonoma.edu.co");
        //Emails no validos 
        valEmail.validarEmail("test@mail");
        valEmail.validarEmail("test.mail.com");

    }
    
}
