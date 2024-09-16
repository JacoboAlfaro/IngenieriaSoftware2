/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8isp;

/**
 *
 * @author jacob
 */
public class Carro implements ITransporte, ITransporteAutomovil{
    
    private String marca;
    private String modelo;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public void obtenerMarca() {
        System.out.println("Marca");
    }

    @Override
    public void obtenerModelo() {
        System.out.println("Modelo");
    }

    @Override
    public void comprarSoat() {
        System.out.println("Comprar Soat");
    }

    @Override
    public void comprarTecnicoMecanica() {
        System.out.println("Comprar TecnicoMecanico");
    }
    
}
