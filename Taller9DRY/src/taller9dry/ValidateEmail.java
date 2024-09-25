/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller9dry;

/**
 *
 * @author jacob
 */
public class ValidateEmail {
    public void validarEmail(String email){
        if(!email.contains("@") || !email.contains(".")){
            System.out.println("Email " + email + " invalido");
        } else{
            System.out.println("Email " + email + " valido");  
        }
    }
}
