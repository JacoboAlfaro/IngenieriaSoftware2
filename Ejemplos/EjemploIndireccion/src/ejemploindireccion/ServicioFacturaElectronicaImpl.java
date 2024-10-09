/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploindireccion;

/**
 *
 * @author jacob
 */
public class ServicioFacturaElectronicaImpl implements IServicioFacturaElectronica {

    @Override
    public FacturaElectronica crear(Cliente cliente) {
        //LOGICA
        return new FacturaElectronica("", "", 0, cliente);
    }
    
}
