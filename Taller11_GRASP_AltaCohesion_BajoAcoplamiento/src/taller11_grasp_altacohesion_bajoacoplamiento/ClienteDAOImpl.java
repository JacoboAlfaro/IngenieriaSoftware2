/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11_grasp_altacohesion_bajoacoplamiento;

/**
 *
 * @author jacob
 */
public class ClienteDAOImpl implements IClienteDAO{

    @Override
    public void agregarCliente() {
        System.out.println("Agregando cliente.....");
    }

    @Override
    public void buscarCliente() {
        System.out.println("buscando cliente.....");    
    }

    @Override
    public void actualizarCliente() {
        System.out.println("Actualizando cliente.....");

    }

    @Override
    public void eliminarCliente() {
            System.out.println("Eliminando cliente.....");
    }
    
}
