/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2srp.Clases;

/**
 *
 * @author jacob
 */
public class Factura {
    private String codigo;
    private String producto;
    private int cantidad;
    private double valorTotal;

    public Factura(String codigo, String producto, int cantidad, double valorTotal) {
        this.codigo = codigo;
        this.producto = producto;
        this.cantidad = cantidad;
        this.valorTotal = valorTotal;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getValorTotal() {
        return valorTotal;
    }
    
    /*
    De la clase Factura se eliminan los metodos de guardar factura en base de datos,
    enviar factura a cliente por correo, enviar correo a la DIAN y generar reporte de facturas.
    Debido a que viola el principio SRP de SOLID dandole mas de una resposabilidad  a la clase Cliente, 
    para ello se crea una nueva clase para cada uno de estos metodos.
    */
    
}
