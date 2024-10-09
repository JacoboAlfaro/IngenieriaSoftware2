/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploindireccion;

/**
 *
 * @author jacob
 */
public class FacturaElectronica extends Factura{
    private String numeroElectronico;

    public FacturaElectronica(String numeroElectronico, String codigo, double total, Cliente cliente) {
        super(codigo, total, cliente);
        this.numeroElectronico = numeroElectronico;
    }

    public String getNumeroElectronico() {
        return numeroElectronico;
    }

    
}
