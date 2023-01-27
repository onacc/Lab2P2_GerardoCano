/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_gerardocano;

/**
 *
 * @author gcano
 */
class Usuario {
    private String Nombre,username,Contra;
private int edad;

    public Usuario(String Nombre, String username, String Contra, int edad) {
        this.Nombre = Nombre;
        this.username = username;
        this.Contra = Contra;
        this.edad = edad;
    }

    public Usuario(String username, String Contra) {
        this.username = username;
        this.Contra = Contra;
    }
    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContra() {
        return Contra;
    }

    public void setContra(String Contra) {
        this.Contra = Contra;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String toString(){
        return "Nombre "+Nombre+"\n"+"Edad "+edad+"\n"+"Username "+username+"\n"+"Password "+Contra;
    }
}

