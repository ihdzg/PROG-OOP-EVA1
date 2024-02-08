/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_3_modificadores_acceso;

import OTRO_PAQUETE.NEWCLASS;

/**
 *
 * @author ihdzg
 */
public class EVA1_3_MODIFICADORES_ACCESO {
    public int x;
    protected int y;
    private int z;
    int w;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PruebaA objA = new PruebaA();
        //ObjA. ---> puedo ver x (porque es public)
        //Puedo ver a y (proteccted)
        //puedo ver a w (default)
        NEWCLASS otroObj = new NEWCLASS();
        //otroObj.x --> se ve x porque es public
        //los demas no son visibles
        //Esta clase no es visible para el paquete
        //PrubeaB obj3 = new PruebaB();
    }
    
}

class PruebaA {
    public int x;
    protected int y;
    private int z;
    int w;
}