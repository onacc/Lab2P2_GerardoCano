/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_gerardocano;

/**
 *
 * @author gcano
 */
public class Edificio {
    private int numpisos, locales;
    private String direccion, estado;

    public Edificio() {
    }

    public Edificio(int numpisos, int locales, String direccion) {
        this.numpisos = numpisos;
        this.locales = locales;
        this.direccion = direccion;
    }
    

    public int getNumpisos() {
        return numpisos;
    }

    public void setNumpisos(int numpisos) {
        this.numpisos = numpisos;
    }

    public int getLocales() {
        return locales;
    }

    public void setLocales(int locales) {
        this.locales = locales;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String toString(){
        return "Numero de Pisos"+numpisos+"\n"+"Numero de Locales "+locales+"\n"+direccion+"\n"+"Estado "+estado;
    }
}
