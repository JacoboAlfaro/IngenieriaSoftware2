
package taller9yagni;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author jacob
 */
public class Taller9YAGNI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro libro1 = new Libro("Don quijote", "Miguel", 2021);
        Libro libro2 = new Libro("100 años de soledad", "Gabriel garcia", 1967);
        
        Biblioteca biblioteca = new Biblioteca();
        
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
    }
}
