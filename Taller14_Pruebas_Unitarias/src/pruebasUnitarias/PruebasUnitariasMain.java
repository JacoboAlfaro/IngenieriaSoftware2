package pruebasUnitarias;

public class PruebasUnitariasMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calculadora = new Calculadora();
		
		System.out.println("Suma 1 + 2 = " + calculadora.suma(1, 2));
		System.out.println("Resta 10 - 5 = " + calculadora.resta(10, 5));
		System.out.println("multiplicacion 13 * (-6) = " + calculadora.multiplicacion(13, -6));
		System.out.println("Division 100 / 2 = " + calculadora.division(100, 2));
	}
}
