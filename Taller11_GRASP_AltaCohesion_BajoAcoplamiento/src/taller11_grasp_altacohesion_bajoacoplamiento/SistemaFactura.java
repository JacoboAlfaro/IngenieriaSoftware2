/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11_grasp_altacohesion_bajoacoplamiento;

/**
 *
 * @author jacob
 */
public class SistemaFactura {
    IFacturaService facturaService;

    public SistemaFactura(IFacturaService facturaService) {
        this.facturaService = facturaService;
    }

    public IFacturaService getFacturaService() {
        return facturaService;
    }
}
