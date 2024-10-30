/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_corte2.pregunta3;

/**
 *
 * @author jacob
 */
public class FacturaService implements IFacturaService{

    @Override
    public FacturaFisica crearFacturaFisica(Cliente cliente) {
        System.out.println("CREANDO FACTURA FISICA");
        return new FacturaFisica("", 0, cliente);
    }

    @Override
    public FacturaElectronica crearFacturaElectronica(Cliente cliente) {
        System.out.println("CREANDO FACTURA ELECTRONICA");
        return new FacturaElectronica("", "", 0, cliente);
    }

    
    
}
