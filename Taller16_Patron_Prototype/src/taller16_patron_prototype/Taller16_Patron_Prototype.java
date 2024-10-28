/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller16_patron_prototype;

/**
 *
 * @author jacob
 */
public class Taller16_Patron_Prototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Producto producto1 = new Producto("Producto 1", 1200, "Comida");
        Producto producto2 = (Producto) producto1.clonar();
        
        producto1.mostrarInformacion();
        
        //Cambio informacion producto clonado
        producto2.setNombre("Product 2");
        producto2.setCategoria("Bebidas");
        
        producto2.mostrarInformacion();
    }
    
}
