/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller17_patron_adapter;

/**
 *
 * @author jacob
 */
public class Taller17_Patron_Adapter {

    public static void main(String[] args) {
        ImpresoraLaser laser = new ImpresoraLaser();
        ImpresoraInkJet inkJet = new ImpresoraInkJet();
        
        Impresora laserAdapter = new LaserAdapter(laser);
        Impresora inkJetAdapter = new InkJetAdapter(inkJet);
        
        laserAdapter.imprimir();
        inkJetAdapter.imprimir();
    }
}
