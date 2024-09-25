/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller9kiss;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author jacob
 */
public class Taller9KISS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MetodosCadenas cadenas = new MetodosCadenas();
        MetodosNumeros numeros = new MetodosNumeros();
        
        //Numero mayor de una lista de enteros
        int[] numerosList = {1, 4, 5, 7, 2, 34, 321, 5};
        int mayor = numeros.encontrarMayor(numerosList);
        System.out.println("Numero mayor del arreglo: " + mayor);
        
        //Invertir cadenas
        String cadena = "cadena al contrario";
        String inverso = cadenas.invertirCadena(cadena);
        System.out.println("Cadena '" + cadena + "' invertida: " + inverso );
        
    }
    
}
