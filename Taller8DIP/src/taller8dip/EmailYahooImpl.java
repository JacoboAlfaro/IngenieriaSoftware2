/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8dip;

import taller8dip.Clases.Email;
import taller8dip.Clases.EmailYahoo;

/**
 *
 * @author jacob
 */
public class EmailYahooImpl extends EmailYahoo implements IServicioEmail{

    public EmailYahooImpl(String file, String to, String subject, String body) {
        super(file, to, subject, body);
    }

    @Override
    public void enviarEmail() {
        //LOGICA
        System.out.println("ENVIANDO EMAIL CON YAHOO");
    }
    
}
