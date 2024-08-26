/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2srp.Clases;

/**
 *
 * @author jacob
 */
public class Cliente {
    private String nombre;
    private String identificacion;

    public Cliente(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }   
    
    /*
    De la clase Cliente se elimina el metodo de guardar cliente en base de datos y se crea una nueva clase para este.
    Debido a que viola el principio SRP de SOLID dandole mas de una resposabilidad  a la clase Cliente. 
    */
}
