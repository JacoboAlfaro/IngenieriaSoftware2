package taller10_grasp_experto;

public class Taller10_GRASP_Experto {

    public static void main(String[] args) {
        //Creacion de libtos
        Libro libro1 = new Libro("El principito", "Persona 1", "21123", 12.99);
        Libro libro2 = new Libro("Doon quijote", "Persona 2", "d12432d", 9.50);
        Libro libro3 = new Libro("Libro 3", "Persona 3", "d1sdfdsf32d", 15.20);
        
        ICarrito carrito = new Carrito();
        
        carrito.agregarLibroCarrito(libro1);
        carrito.calcularPrecioTotal();
        
        carrito.agregarLibroCarrito(libro2);
        carrito.agregarLibroCarrito(libro3);
        carrito.calcularPrecioTotal();
        
        carrito.eliminarLibroCarrito(2);
        carrito.calcularPrecioTotal();


    }
    
}
