/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11_grasp_altacohesion_bajoacoplamiento.Modelos;

import java.util.Date;
import java.util.List;

/**
 *
 * @author jacob
 */
public class Factura {
    private String codigo;
    private double descuento;
    private double total;
    private Date fechaFactura;
    List<Producto> productos;

    public Factura(String codigo, double descuento) {
        this.codigo = codigo;
        this.descuento = descuento;
        this.fechaFactura = new Date();
    }

    public Factura(String codigo, double descuento, List<Producto> productos) {
        this.codigo = codigo;
        this.descuento = descuento;
        this.fechaFactura = new Date();
        this.productos = productos;
    }
    

    public double getDescuento() {
        return descuento;
    }

    public double getTotal() {
        return total;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public String getCodigo() {
        return codigo;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
    
}
