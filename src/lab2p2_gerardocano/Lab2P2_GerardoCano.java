/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_gerardocano;

import java.util.ArrayList;

/**
 *
 * @author gcano
 */
public class Lab2P2_GerardoCano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //arraylist para usuarios
        String usuario = "admin";
        String password = "admin1234";
        Usuario u = new Usuario(usuario,password);
        ArrayList<Usuario> users = new ArrayList();
        //arraylist para edificios, casa, colares
        ArrayList builds = new ArrayList();
        System.out.println(u);
        
    }
    
}
