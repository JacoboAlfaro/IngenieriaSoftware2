/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_patron_decorator;

/**
 *
 * @author jacob
 */
public class Cafe implements Bebida{

    @Override
    public double costo() {
        return 2.0;
    }

    @Override
    public String descripcion() {
        return "Cafe mas caro de colombia";
    }
    
}
