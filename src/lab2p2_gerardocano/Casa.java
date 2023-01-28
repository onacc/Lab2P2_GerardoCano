/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_gerardocano;

import java.awt.Color;

/**
 *
 * @author gcano
 */
public class Casa {
    private int numcasa,numbloque,numbath,numcuart,ancho,largo;
    private Color color; 
    private String Estado;

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public Casa() {
    }

    public Casa(int numcasa, int numbloque, int numbath, int numcuart, int ancho, int largo, Color color) {
        this.numcasa = numcasa;
        this.numbloque = numbloque;
        this.numbath = numbath;
        this.numcuart = numcuart;
        this.ancho = ancho;
        this.largo = largo;
        this.color = color;
    }

    public int getNumcasa() {
        return numcasa;
    }

    public void setNumcasa(int numcasa) {
        this.numcasa = numcasa;
    }

    public int getNumbloque() {
        return numbloque;
    }

    public void setNumbloque(int numbloque) {
        this.numbloque = numbloque;
    }

    public int getNumbath() {
        return numbath;
    }

    public void setNumbath(int numbath) {
        this.numbath = numbath;
    }

    public int getNumcuart() {
        return numcuart;
    }

    public void setNumcuart(int numcuart) {
        this.numcuart = numcuart;
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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public String toString(){
        return "Casa"+"\n"+"Numero de casa "+numcasa+"\n"+"Numero de bloque "+numbloque+"\n"+"Numero de baños "
                +numbath+"\n"+"Numero de Cuartos "+numcuart+"\n"+"Ancho "+ancho+"\n"+"Largo "+largo+"\n"+"Estado "+Estado;
    }
    
}
