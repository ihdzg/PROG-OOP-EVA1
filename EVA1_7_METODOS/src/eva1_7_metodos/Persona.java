/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_7_metodos;

/**
 *
 * @author ihdzg
 */
public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    
    //Metodos get y set
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
    
    //reglas para el  nombre de los metodos en java
    //iniciar el nombre de los metodos en un verbo
    
    public String generarnombrecompleto(){
        return nombre + " " + apellidos;
    }
    
    //calcular año de nacimiento
    public int calcularañodenacimiento(){
        return 2024 - edad;
    }
}
