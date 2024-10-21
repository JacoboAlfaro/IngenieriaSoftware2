package taller14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EstudianteTest {

	static Estudiante estudiante;
	
	@BeforeAll
	public static void beforeAll() {
		System.out.println("INICIAN LAS PRUEBAS");
    }
	
	@BeforeEach
	public void agregarNotas() {
		estudiante = new Estudiante("Nombre", 21);
		System.out.println("agregarNotas()");
		estudiante.agregarCalificacion(6);
		estudiante.agregarCalificacion(10);
		estudiante.agregarCalificacion(7);
		estudiante.agregarCalificacion(4);
		estudiante.agregarCalificacion(0);
	}
	
	@Test
	public void agregarCalificacionTest() {
		
		estudiante.agregarCalificacion(3);
		System.out.println(estudiante.getCalificaciones().get(5));
		assertEquals(3, estudiante.getCalificaciones().get(5));
		System.out.println("agregarCalificacionTest()");
	}
	
	@Test
	public void obtenerPromedioTest() {
		double prom = estudiante.obtenerPromedio();
		System.out.println(prom);
		assertEquals(prom, 5.4);
		System.out.println("obtenerPromedioTest()");
	}
	
	@Test
	public void getNumeroCalificacionesTest() {
		int num = estudiante.getNumeroCalificaciones();
		System.out.println(num);
		assertEquals(num, 5);
		System.out.println("getNumeroCalificacionesTest()");
	}
	
	@Test
	public void agregarCalificacionNegativaTest() {
		assertThrows(IllegalArgumentException.class, () -> { estudiante.agregarCalificacion(-1); });
		System.out.println("agregarCalificacionNegativaTest()");
	}
	
	@Test
	public void agregarCalificacionSuperior10Test() {
		assertThrows(IllegalArgumentException.class, () -> { estudiante.agregarCalificacion(11); });
		System.out.println("agregarCalificacionSuperior10Test()");
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("TERMINAN LAS PRUEBAS UNITARIAS");
	}

}
