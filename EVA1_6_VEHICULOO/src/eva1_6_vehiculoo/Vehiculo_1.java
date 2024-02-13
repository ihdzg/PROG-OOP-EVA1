/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_6_vehiculoo;

/**
 *
 * @author ihdzg
 */
class Vehiculo {
    private String marca;
        private String modelo;
        private int annio;
        private String color;
        private double precio;
    
    public String getMarca(){
        return marca;
    }
    
    public void setmarca(String valor){
    marca = valor;
    }
    
    public int getAnnio(){
        return annio;
    }
    
    public void setannio(int valor){
    annio = valor;
    }
    
    public String getmodelo(){
    return modelo;
    }
    
    public void setmodelo(String valor){
    modelo = valor;
    }
    
    public String getcolor(){
    return color;
    }
    
    public void setcolor(String valor){
    color = valor;
    }
    
    public double getprecio(){
    return precio;
    }
    
    public void setprecio(double valor){
    precio = valor;
    }
}
