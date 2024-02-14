/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_4_clase;

/**
 *
 * @author ihdzg
 */
public class EVA1_4_CLASE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso1 = new Persona();
        perso1.setNombre("Ivan");
        perso1.setApellidos("Hernandez Garcia");
        perso1.setEdad(18);
        
        System.out.println(perso1.getNombre());
        System.out.println(perso1.getApellidos());
        System.out.println(perso1.getEdad());
    }
    
}

class Persona{
    
    private String nombre;
    private String apellidos;
    private int edad;
    
    public String getNombre(){
    return nombre;
}

    public void setNombre(String valor){
    nombre = valor;
}
    public String getApellidos(){
    return apellidos;
    }
    
    public void setApellidos (String valor){
    apellidos = valor;
    }
    
    
    public int getEdad(){
    return edad;
    }
    
    public void setEdad (int valor){
    edad = valor;
    }
}