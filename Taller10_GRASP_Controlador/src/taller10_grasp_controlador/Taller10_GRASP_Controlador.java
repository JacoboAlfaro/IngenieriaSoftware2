/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller10_grasp_controlador;

/**
 *
 * @author jacob
 */
public class Taller10_GRASP_Controlador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Entrada entradaVIP = new Entrada("VIP", 12.21, true);
        Entrada entradaGeneral = new Entrada("General", 4.50, false);
        
        //Se compran diferentes entrada teniendo como ejemplo un punto fisico 
        //donde los boletos ya existen, solo son comprados por el usuario.
        UsuarioCompra usuario = new UsuarioCompra();
        usuario.comprar(entradaVIP);
        usuario.comprar(entradaGeneral);
        usuario.comprar(entradaVIP); //Ya se compró previamente la entrada

    }
    
}
