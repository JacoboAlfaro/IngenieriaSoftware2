/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller9kiss;

import java.util.Arrays;

/**
 *
 * @author jacob
 */
public class MetodosNumeros {
    public int encontrarMayor(int[] numeros){
        return Arrays.stream(numeros).max().getAsInt();
    }
}
