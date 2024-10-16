/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test; 
import ejemplocalidadsoftware1.Calculadora;
import org.junit.jupiter.api.Assertions;
/**
 *
 * @author jacob
 */
public class CalculadoraTest {
    
    @Test
    public void sumarTest() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.sumar(10, 5);
        Assertions.assertEquals(15, resultado);
    }
    
}
