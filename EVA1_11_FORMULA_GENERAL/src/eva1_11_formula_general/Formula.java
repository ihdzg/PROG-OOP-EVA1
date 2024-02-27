/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_11_formula_general;

/**
 *
 * @author ihdzg
 */
public class Formula {
    private double a;
    private double b;
    private double c;
    private double operacion;
    
    
     public Formula(){
        a = 1;
        b = -4;
        c = 3;
    }
    
    public void setA(double valor){
    a = valor;
}
    public double getA(){
    return a;
    }
     public void setB(double valor){
    b = valor;
}
    public double getB(){
    return b;
    }
    
     public void setC(double valor){
    c = valor;
}
    public double getC(){
    return c;
    }
    
    private double CalcularMas(){
       operacion = ((-1 * b) + ((Math.sqrt((Math.pow(b, 2)) - (4 * (a * c)))))) / 2;
        return operacion;
    }
    
    private double CalcularMenos(){
        operacion = ((-1 * b) - ((Math.sqrt((Math.pow(b, 2)) - (4 * (a * c)))))) / 2;
        return operacion;
    }
    
    public void imprimirdatos(){
        System.out.println("El valor de 'A' es: " + getA());
        System.out.println("El valor de 'B' es: " + getB());
        System.out.println("El valor de 'C' es: " + getC());
        System.out.println("x1: " + CalcularMenos());
        System.out.println("x2: " + CalcularMas());
    }

}
