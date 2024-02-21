/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_8_tv;

/**
 *
 * @author ihdzg
 */
public class television {
    //ATRIBUTOS DE UNA TV
    //valor automatico para enteros = 0
    //no siempre es cpnveniente dejar los valores por default
    private int volumen;
    private int canal;
    //valor automatico para booleanos = falso
    private boolean estaEncendida;
    
    
    //CONSTRUCTORES: 
    //Constructor sin argumentos --> constructor default, java le asigna los valores automaticamente
    //Metodo para inicializar los objetos (con los valores deseados)
    public television(){
        //NO ES OBLIGATORIO INICIALIZAR LOS ATRIBUTOS
        volumen = 30;
        canal = 5;
        estaEncendida = false;
    }
    
    
    //
    public void subirVolumen(){
        if(estaEncendida && (volumen < 100))
            volumen++;
    }
    
    public void bajarVolumen(){
        if(estaEncendida && (volumen > 0))
            volumen--;
    }
    
    public void subirCanal(){
        if(estaEncendida)
            canal++;
    }
    
    public void bajarCanal(){
        if(estaEncendida && (canal > 0))
            canal--;
    }
    
    public void cambiarCanal(int numcanal){
                          // ! --> negacion 
        if(estaEncendida && !(numcanal < 0))
            canal = numcanal;
    }
    
    public void power(){
        /*if(estaEncendida == true)
            estaEncendida = false;
        else
            estaEncendida = true;*/
        estaEncendida = !estaEncendida;
    }
    
    public void imprimirConfig(){
        System.out.println("Volumen: " + volumen);
        System.out.println("Canal: " + canal);
        System.out.println("Power: " + estaEncendida);
    }
}
