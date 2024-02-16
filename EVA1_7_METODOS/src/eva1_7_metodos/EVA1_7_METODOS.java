/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_metodos;

import java.util.Scanner;

/**
 *
 * @author ihdzg
 */
public class EVA1_7_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona perso = new Persona();
        perso.setNombre("Hugo");
        perso.setApellidos("Hernandez");
        perso.setEdad(16);
        
        System.out.println("El nomobre es: " + perso.generarnombrecompleto());
        System.out.println("Nacio en el año: " + perso.calcularañodenacimiento());
        //------
        Persona[] grupo = new Persona[5];
        //HAY QUE CERAR CADA OBJETO
        for (int i = 0; i < grupo.length; i++) {
            Scanner input = new Scanner(System.in);
            grupo[i] = new Persona();
            //Una vez creado el objeto hay que llenarlo;
            System.out.println("Introduce el nombre:");
            String nombre = input.nextLine();
            grupo[i].setNombre(nombre);
            
            System.out.println("Introduce el apellido:");
            String ape = input.nextLine();
            grupo[i].setApellidos(ape);
            
            System.out.println("Introduce la edad:");
            int edad = input.nextInt();
            grupo[i].setEdad(edad);
                    
        }
        //Leer
        for (int i = 0; i < grupo.length; i++) {
            System.out.println("El nomobre es: " + grupo[i].generarnombrecompleto());
            System.out.println("Nacio en el año: " + grupo[i].calcularañodenacimiento());
        }
    }
    
}
