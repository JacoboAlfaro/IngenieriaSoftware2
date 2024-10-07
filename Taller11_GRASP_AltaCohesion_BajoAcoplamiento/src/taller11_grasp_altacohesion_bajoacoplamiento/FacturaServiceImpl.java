package taller11_grasp_altacohesion_bajoacoplamiento;

import taller11_grasp_altacohesion_bajoacoplamiento.Modelos.*;

public class FacturaServiceImpl implements IFacturaService{
    
    Factura factura;

    public FacturaServiceImpl(Factura factura) {
        this.factura = factura;
    }
    
    @Override
    public double calcularPrecioConDescuento() {
        return calcularTotal() - (calcularTotal() * factura.getDescuento()); 
    }

    @Override
    public double calcularTotal() {
        double total = 0.0;
        for(Producto producto: factura.getProductos()){
            total += producto.getPrecio();
        }
        factura.setTotal(total);
        return total;
    }

    @Override
    public String generarNumeroFactura() {
        return factura.getFechaFactura().toString() + factura.getCodigo();
    }

    @Override
    public void procesarFactura(Cliente cliente){
        System.out.println("-----FACTURA NO." + generarNumeroFactura() + "-----");
        System.out.println("Codigo: " + factura.getCodigo());
        System.out.println("Fecha: " + factura.getFechaFactura());
        System.out.println("Descuento aplicado: " + factura.getDescuento() * 100 + "%");
        System.out.println("Precio total sin descuento: " + calcularTotal());
        System.out.println("Precio total con descuento: " + calcularPrecioConDescuento());
        System.err.println("Cliente: " + cliente.getNombre());
    }
    
}
