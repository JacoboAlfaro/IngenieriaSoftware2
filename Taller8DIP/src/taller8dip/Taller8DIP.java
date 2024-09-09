
package taller8dip;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author jacob
 */
public class Taller8DIP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        IServicioEmail servicioEmailGmail = new EmailGmailImpl("sdasd", "sadasd", "sadas", "sadfasdf");
        SistemaDeEnviosEmail sistemaGmail = new SistemaDeEnviosEmail(servicioEmailGmail);
        sistemaGmail.enviarEmail();
        
        IServicioEmail servicioEmailYahoo = new EmailYahooImpl("sdasd", "sadasd", "sadas", "sadfasdf");
        SistemaDeEnviosEmail sistemaYahoo = new SistemaDeEnviosEmail(servicioEmailYahoo);
        sistemaYahoo.enviarEmail();
        
        IServicioEmail servicioEmailOutlook = new EmailOutlookImpl("asdasd", "sadasd", "sdasd");
        SistemaDeEnviosEmail sistemaOutlook = new SistemaDeEnviosEmail(servicioEmailOutlook);
        sistemaOutlook.enviarEmail();
    }
    
}
