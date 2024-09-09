/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8dip;

import taller8dip.Clases.Email;
import taller8dip.Clases.EmailOutlook;

/**
 *
 * @author jacob
 */
public class EmailOutlookImpl extends EmailOutlook implements IServicioEmail {

    public EmailOutlookImpl(String to, String subject, String body) {
        super(to, subject, body);
    }

    @Override
    public void enviarEmail() {
        //LOGICA
        System.out.println("ENVIANDO EMAIL CON OUTLOOK");
    }
    
}
