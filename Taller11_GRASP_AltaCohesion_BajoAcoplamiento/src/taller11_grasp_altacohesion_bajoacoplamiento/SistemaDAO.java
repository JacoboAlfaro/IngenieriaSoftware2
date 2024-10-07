/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11_grasp_altacohesion_bajoacoplamiento;

/**
 *
 * @author jacob
 */
public class SistemaDAO {
    private IClienteDAO clienteDAO;
    private IFacturaDAO facturaDAO;
    private IProductoDAO productoDAO;

    public SistemaDAO(IClienteDAO clienteDAO, IFacturaDAO facturaDAO, IProductoDAO productoDAO) {
        this.clienteDAO = clienteDAO;
        this.facturaDAO = facturaDAO;
        this.productoDAO = productoDAO;
    }
    
    public IClienteDAO getClienteDAO(){
        return clienteDAO;
    }

    public IFacturaDAO getFacturaDAO() {
        return facturaDAO;
    }

    public IProductoDAO getProductoDAO() {
        return productoDAO;
    }
}
