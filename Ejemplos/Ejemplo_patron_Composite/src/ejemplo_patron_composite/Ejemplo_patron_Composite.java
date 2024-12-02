/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo_patron_composite;

import java.time.LocalDateTime;

/**
 *
 * @author jacob
 */
public class Ejemplo_patron_Composite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        EmpleadoIndividual empleado1 = new EmpleadoIndividual("Empleado 1", "Desarrollador");
        EmpleadoIndividual empleado2 = new EmpleadoIndividual("Empleado 2", "Diseniador");
        EmpleadoIndividual empleado3 = new EmpleadoIndividual("Empleado 3", "Analista");
        
        Gerente gerente1 = new Gerente("gerente 1", "Gerente de Disenio");
        Gerente gerente2 = new Gerente("gerente 2", "Gerente de Desarrolladores");
        
        gerente1.agregarSubordinado(empleado1);
        gerente1.agregarSubordinado(empleado2);
        gerente1.agregarSubordinado(empleado3);
        
        Gerente gerentePrincipal = new Gerente("Macho", "Gerente de gerentes");
        
        gerentePrincipal.agregarSubordinado(gerente1);
        gerentePrincipal.agregarSubordinado(gerente2);
        
        gerentePrincipal.mostrarDetalles();
    }
}
