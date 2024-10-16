package pruebasUnitarias;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.RepeatedTest;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    static Calculadora calculadora;

    @BeforeAll
    //Crea objeto calculadora antes de cualquier test
    public static void crearCalculadora() {
        calculadora = new Calculadora();
    }

    @Test
    public void testSumar() {
    	int res = calculadora.suma(2, 5);
        assertEquals(7, res);
        System.out.println("Test 1 suma superado");
        assertNotEquals(10, res);
        System.out.println("Test 2 suma superado");
    }

    @Test
    public void testRestar() {
        assertEquals(1, calculadora.resta(3, 2));
        System.out.println("Test 3 resta");
    }

    @Test
    public void testMultiplicar() {
        assertEquals(6, calculadora.multiplicacion(2, 3));
        System.out.println("Test 4 multiplicar");
    }
    
    @Test
    public void testMultiplicar2() {
    	int res = calculadora.multiplicacion(-10, 11);
        assertNotEquals(110, res);
        System.out.println("Test 5 multiplicar");
        
        assertFalse(res > 0,  "El resultado se espera que no sea  mayor a 0");
        System.out.println("Test 6 multiplicar");
    }

    @Test
    public void testDividir() {
    	int res = calculadora.division(-10, 2);
        assertTrue(res < 0,  "El resultado se espera que sea  menor a 0");
        System.out.println("Test 7 division");
        
        assertEquals(0, calculadora.division(3, 0));
        System.out.println("Test 8 division por 0");
    }

    @RepeatedTest(3)
    public void testSumarRepetido() {
        assertEquals(10, calculadora.suma(5, 5));
        System.out.println("Test 9 suma repetida");
    }
}

