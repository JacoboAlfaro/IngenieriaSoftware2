/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8dip;

import taller8dip.Clases.Email;
import taller8dip.Clases.EmailGmail;

/**
 *
 * @author jacob
 */
public class EmailGmailImpl extends EmailGmail implements IServicioEmail {

    public EmailGmailImpl(String image, String to, String subject, String body) {
        super(image, to, subject, body);
    }

    @Override
    public void enviarEmail() {
        //LOGICA
        System.out.println("ENVIANDO EMAIL CON GMAIL");
    }
    
    
    
}
