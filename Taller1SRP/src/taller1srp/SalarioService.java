/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1srp;

/**
 *
 * @author jacob
 */
public class SalarioService {
    private final double VALOR_HORA = 78000;
    
    public void calcularSalarioUsuario(Usuario usuario, int horasTrabajadas){
        double salario = VALOR_HORA * horasTrabajadas;
        System.out.println("El salario del usuario " + usuario.getNombre() + " es de: $" + salario);
    }
    
    /*
    Se separa el calcular salario de la clase Usuario ya que esta informacion 
    de salarios no es propia de la clase, por lo tanto no deberia  
    haber un metodo calcular usuario dentro de Usuario.  
    para ello se crea una clase SalarioService encargada unicamente de los
    metodos para calcular salarios y temas afines a dinero.
    */
}
