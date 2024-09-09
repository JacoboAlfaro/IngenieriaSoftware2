/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8dip.Clases;

/**
 *
 * @author jacob
 */
public class EmailYahoo extends Email{
    private String file;

    public EmailYahoo(String file, String to, String subject, String body) {
        super(to, subject, body);
        this.file = file;
    }

    public String getFile() {
        return file;
    }
    
    
}
