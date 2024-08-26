/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2srp.DAOs;

import taller2srp.Clases.Cliente;


/**
 *
 * @author jacob
 */
public class ClienteDAO {
    
    public void guardarCliente(Cliente cliente){
        System.out.println("Cliente con identificacion-nombre  " + 
                cliente.getIdentificacion()+ "-" + cliente.getNombre() + 
                " guardada correctamente en la BD");
    }
    
    /*
    Se separa el guardar cliente de la clase Cliente ya que esta clase no debería
    encargarse de la gestion de estos mismos, para ello se crea una clase 
    ClienteDAO encargada unicamente de la gestión de clientes directamente con la base de datos
    */
    
}
