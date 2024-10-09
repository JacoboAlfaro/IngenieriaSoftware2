/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploindireccion;

/**
 *
 * @author jacob
 */
public class EjemploIndireccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IServicioFacturaFisica servicioFacturaFisica = new ServicioFacturaFisicaImpl();
        Cliente cliente = new Cliente("12231", "Test nombre", "correo@test.com");
        FacturaFisica fact = servicioFacturaFisica.crear(cliente);
        System.out.println(fact.getCliente().getIndentificacion());
    }
    
}
