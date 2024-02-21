/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_9_constructores;

/**
 *
 * @author ihdzg
 */
public class CuentaBancaria {
    private double saldo;
    private int numCuenta;
    private String cliente;
    
    //CONSTRUCTOR DEFAULT (SIN ARGUMENTOS)
    public CuentaBancaria(){
        numCuenta = 0;
        cliente = "SIN CLIENTE";
        saldo = 1000000;
    }
    
    // get y set
    public int getNumCuenta(){
        return numCuenta;
    }
    
    public void setNumCuenta(int cuenta){
        numCuenta = cuenta;
    }
    
    public String getCliente(){
        return cliente;
    }
    
    public void setCliente(String nomCliente){
        cliente = nomCliente;
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void retirar(double monto){
        if(saldo >= monto)    //hay que tener dinero
            saldo = saldo - monto;
    }
    
    public void depositar(double deposito){
        saldo = saldo + deposito;
    }
}
