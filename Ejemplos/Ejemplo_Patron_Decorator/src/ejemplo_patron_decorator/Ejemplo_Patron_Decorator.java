/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo_patron_decorator;

/**
 *
 * @author jacob
 */
public class Ejemplo_Patron_Decorator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Bebida bebida = new Cafe();
        
        Bebida bebidaAzucar = new Azucar(bebida);
        
        System.out.println("Descripcion: " + bebida.descripcion() + ", Precio: " + bebida.costo());
        System.out.println("Descripcion: " + bebidaAzucar.descripcion() + ", Precio: " + bebidaAzucar.costo());
    }
    
}
