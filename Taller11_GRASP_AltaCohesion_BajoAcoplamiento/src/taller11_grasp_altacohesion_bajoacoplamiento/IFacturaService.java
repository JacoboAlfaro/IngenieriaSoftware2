/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11_grasp_altacohesion_bajoacoplamiento;

import java.util.List;
import taller11_grasp_altacohesion_bajoacoplamiento.Modelos.*;

/**
 *
 * @author jacob
 */
public interface IFacturaService {
    public double calcularPrecioConDescuento();
    public double calcularTotal();
    public String generarNumeroFactura();
    public void procesarFactura(Cliente cliente);
}
