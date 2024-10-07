
package taller11_grasp_polimorfismo;

public class Taller11_GRASP_Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta(true, 2);
        IGaraje garaje = new Garaje();
        
        garaje.estacionar(bicicleta);
        garaje.estacionar(new Coche(0, 0, ""));
        garaje.estacionar(new Coche(0, 0, ""));
        garaje.estacionar(new Avion(0, 0, ""));
    }
    
}
