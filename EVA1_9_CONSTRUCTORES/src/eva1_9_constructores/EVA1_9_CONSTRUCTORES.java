/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_constructores;

/**
 *
 * @author ihdzg
 */
public class EVA1_9_CONSTRUCTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaBancaria cuenta = new CuentaBancaria();
        System.out.println("Cliente: " + cuenta.getCliente());
        System.out.println("Cuenta: " + cuenta.getNumCuenta());
        System.out.println("Saldo: " + cuenta.getSaldo());
    }
    
}
