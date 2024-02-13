/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_vehiculoo;

/**
 *
 * @author ihdzg
 */
public class EVA1_6_VEHICULOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo miCarrito = new Vehiculo();
        miCarrito.setmarca("Ford");
        miCarrito.setmodelo("F150");
        miCarrito.setannio(2024);
        miCarrito.setprecio(500000);
        miCarrito.setcolor("Rojo");
        
        System.out.println("Marca: " + miCarrito.getMarca());
        System.out.println("Modelo: " + miCarrito.getmodelo());
        System.out.println("Año: " + miCarrito.getAnnio());
        System.out.println("Color: " + miCarrito.getcolor());
        System.out.println("Vlor: " + miCarrito.getprecio());
    }
    
}
