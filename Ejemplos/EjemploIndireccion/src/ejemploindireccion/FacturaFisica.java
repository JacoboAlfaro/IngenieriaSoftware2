/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploindireccion;

/**
 *
 * @author jacob
 */
public class FacturaFisica extends Factura {
    private String nombre;

    public FacturaFisica(String nombre, String codigo, double total, Cliente cliente) {
        super(codigo, total, cliente);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
