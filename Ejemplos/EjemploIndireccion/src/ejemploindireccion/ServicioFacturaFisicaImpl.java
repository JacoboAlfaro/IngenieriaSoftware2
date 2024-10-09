/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploindireccion;

/**
 *
 * @author jacob
 */
public class ServicioFacturaFisicaImpl implements IServicioFacturaFisica{
    @Override
    public FacturaFisica crear(Cliente cliente) {
        //LOGICA
        FacturaFisica fs = new FacturaFisica("", "", 0, cliente);
        return fs;
    }
}
