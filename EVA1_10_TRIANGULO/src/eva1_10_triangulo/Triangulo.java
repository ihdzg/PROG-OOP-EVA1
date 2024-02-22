/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_10_triangulo;

/**
 *
 * @author ihdzg
 */
public class Triangulo {
    private double base;
    private double altura;
    
    
    public Triangulo(){
        base = -1;
        altura = -1;
    }
    
    public double getBase(){
        return base;
    }
    
    public void setBase(double valBase){
        base = valBase;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public void setAltura(double valAltura){
        altura = valAltura;
    }
    
    private double calcularArea(){
        return (base * altura)/2;
    }
    
    private double calcularHipo(){
        double hipotenusa = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        return hipotenusa;
    }
    
    private double calcularPeri(){
        return (calcularHipo() + base + altura);
    }
    
    public void imprimirDatos(){
        System.out.println("Base: " + getBase());
        System.out.println("Altura: " + getAltura());
        System.out.println("El area del trangulo es: " + calcularArea());
        System.out.println("El perimetro del trangulo es: " + calcularPeri());
    }
}
