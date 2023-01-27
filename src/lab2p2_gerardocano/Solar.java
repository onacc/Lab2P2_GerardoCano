/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_gerardocano;

/**
 *
 * @author gcano
 */
public class Solar {
    private int ancho, largo;
    //private String Estado;
    public Solar(){
        
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
    public Solar(int ancho, int largo) {
        this.ancho = ancho;
        this.largo = largo;
    }
    public String toString(){
        return "Ancho"+ancho+"\n"+"Largo"+largo+"\n";
    }
}
