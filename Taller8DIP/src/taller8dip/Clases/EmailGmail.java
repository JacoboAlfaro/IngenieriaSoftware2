/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8dip.Clases;

/**
 *
 * @author jacob
 */
public class EmailGmail extends Email{
    private String image;

    public EmailGmail(String image, String to, String subject, String body) {
        super(to, subject, body);
        this.image = image;
    }

    public String getImage() {
        return image;
    }
    
    
    
}
