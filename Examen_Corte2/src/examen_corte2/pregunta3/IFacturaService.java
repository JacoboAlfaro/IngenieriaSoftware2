/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_corte2.pregunta3;

/**
 *
 * @author jacob
 */
public interface IFacturaService {
    public FacturaFisica crearFacturaFisica(Cliente cliente);
    public FacturaElectronica crearFacturaElectronica(Cliente cliente);
}
