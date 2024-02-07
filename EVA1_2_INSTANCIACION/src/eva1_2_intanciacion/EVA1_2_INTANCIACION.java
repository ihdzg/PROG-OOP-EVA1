/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_2_intanciacion;

/**
 *
 * @author ihdzg
 */
public class EVA1_2_INTANCIACION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor = 100;
        //INsTANCIACION:
        //CLASE IDENTIFICADOR = new CONSTRUCTOR();
        //Constructor --> Metodo con el mismo nombre que la clase.
        Persona perso1 = new Persona(); //Instanciacion
        System.out.println(perso1);
        //perso1 --> referencia --> que es una direccion de memoria
        
        Vehiculo perron = new Vehiculo();
        System.out.println(perron);
        perron.marca = "Ford";
        perron.modelo = "Mustang";
        perron.año = 1965;
        System.out.println("Marca: " + perron.marca);
        System.out.println("Modelo: " + perron.modelo);
        System.out.println("Año: " + perron.año);
    }
    
}


//TIPO DE DATO ABSTRACTO
class Persona {

}

class Vehiculo {
    //ABSTRACCION: estamos simplificando un vehiculo a solo tres datos
    //Atributos 
    String marca;
    int año;
    String modelo;

}