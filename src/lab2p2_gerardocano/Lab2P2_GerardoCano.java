/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_gerardocano;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JColorChooser;
/**
 *
 * @author gcano
 */
public class Lab2P2_GerardoCano {
static Scanner read = new Scanner (System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //arraylist para usuarios
        String usuario = "admin";
        String password = "admin1234";
        Usuario u = new Usuario(usuario,password);
        ArrayList<Usuario> users = new ArrayList();
        users.add(u);
        //arraylist para edificios, casa, colares
        ArrayList builds = new ArrayList();
        //System.out.println(u);
        int log;
        do{
        System.out.println("");
        System.out.println("Menu Principal");
        System.out.println("Bienvenido");
        System.out.println("1.Login");
        System.out.println("2.Sign up");
        System.out.println("3.Salir");
        log = read.nextInt();
        switch(log){
            case 1:
                
                System.out.println("Ingrese usuario ");
                String user = read.next();
                System.out.println("Ingrese contrasena");
                String pass = read.next();
                boolean wawa = false;
                wawa = verif(user,pass,users);
                    if (wawa==true){
                        int op = 0;
                        
                        
        do{
            System.out.println("Menu");
            System.out.println("1.Registro de inmueble");
            System.out.println("2.Manejo de Estados");
            System.out.println("3.Salir");
            op = read.nextInt();
            switch(op){
                case 1:
                
                    
                        
                        System.out.println("Ingrese una opcion");
                        System.out.println("1.Crear Casas/Edificios/Solares");
                        System.out.println("2.Listar Casas/Edificios/Solares");
                        System.out.println("3.Modificar Casas/Edficios/Solares");
                        System.out.println("4.Borrar Casas/Edficios/Solares");
                        System.out.println("5.Comprar Casas/Edficios/Solares");
                        int ops = read.nextInt();
                        switch(ops){
                            case 1:{
                                int o=0;
                                System.out.println("Desea Crear...");
                                System.out.println("1.Casas");
                                System.out.println("2.Edificios");
                                System.out.println("3.Solares");
                                o = read.nextInt();
                                switch (o){
                                    case 1:
                                        builds.add(newCasa());
                                    break;
                                    case 2:
                                        builds.add(newEdificio());
                                    break;
                                    case 3:
                                        builds.add(newSolar());
                                    break;
                                }
                            }break;   
                            case 2:{
                                 int o=0;
                                System.out.println("Desea Listar...");
                                System.out.println("1.Casas");
                                System.out.println("2.Edificios");
                                System.out.println("3.Solares");
                                System.out.println("4.Listar todo");
                                o = read.nextInt();
                                switch (o){
                                    case 1:
                                        String casas="";
                                        for (Object t : builds) {
                                            if(t instanceof Casa){
                                                casas+=""+builds.indexOf(t)+"- "+t+"\n";
                                            }
                                        }
                                        System.out.println(casas);
                                    break;
                                    case 2:
                                        String edif="";
                                        for (Object t : builds) {
                                            if(t instanceof Edificio){
                                                edif+=""+builds.indexOf(t)+"- "+t+"\n";
                                            }
                                        }
                                        System.out.println(edif);
                                    break;
                                    case 3:
                                        String Solar="";
                                        for (Object t : builds) {
                                            if(t instanceof Solar){
                                                Solar+=""+builds.indexOf(t)+"- "+t+"\n";
                                            }
                                        }
                                        System.out.println(Solar);
                                    break;
                                    case 4:
                                        printlist(builds);
                                    break;
                                }
                            }    
                            break;
                            case 3:{
                                 int o=0;
                                System.out.println("Desea Modificar...");
                                System.out.println("1.Casas");
                                System.out.println("2.Edificios");
                                System.out.println("3.Solares");
                                o = read.nextInt();
                                switch (o){
                                    case 1:
                                        System.out.println("Ingrese la posicion a modificar");
                                        int p = read.nextInt();
                                        if( p>=0& p<builds.size()&&builds.get(p)instanceof Casa ){
                                            builds.set(p, newCasa());
                                        }else{
                                            System.out.println("La posicion no es valida");
                                        }
                                    break;
                                    case 2:
                                        System.out.println("Ingrese la posicion a modificar");
                                         p = read.nextInt();
                                        if( p>=0& p<builds.size()&&builds.get(p)instanceof Edificio ){
                                            builds.set(p, newEdificio());}
                                    break;
                                    case 3:
                                    System.out.println("Ingrese la posicion a modificar");
                                         p = read.nextInt();
                                        if( p>=0& p<builds.size()&&builds.get(p)instanceof Solar ){
                                            builds.set(p, newSolar());}
                                    break;
                                }
                            }
                            break;
                            case 4:{
                                 int o=0;
                                System.out.println("Desea Borrar...");
                                System.out.println("1.Casas");
                                System.out.println("2.Edificios");
                                System.out.println("3.Solares");
                                o = read.nextInt();
                                switch (o){
                                    case 1:
                                        System.out.println("Ingrese la posicion de casa a eliminar ");
                                        int posi = read.nextInt();
                                         if( posi>=0& posi<builds.size()&&builds.get(posi)instanceof Casa ){
                                            builds.remove(posi);
                                             System.out.println("Eliminado correctamente");
                                        }else{
                                             System.out.println("La posicion entregada no es valida");
                                    }
                                    break;
                                    case 2:
                                        System.out.println("Ingrese la posicion de edificio a eliminar ");
                                        int pos = read.nextInt();
                                         if( pos>=0& pos<builds.size()&&builds.get(pos)instanceof Edificio ){
                                            builds.remove(pos);
                                             System.out.println("Eliminado correctamente");
                                        }else{
                                             System.out.println("La posicion entregada no es valida");
                                    }
                                    break;
                                    case 3:
                                        System.out.println("Ingrese la posicion de solar a eliminar ");
                                        int popo = read.nextInt();
                                         if( popo>=0& popo<builds.size()&&builds.get(popo)instanceof Solar ){
                                            builds.remove(popo);
                                             System.out.println("Eliminado correctamente");
                                        }else{
                                             System.out.println("La posicion entregada no es valida");
                                    }

                                    break;
                                }
                            }
                            break;
                            case 5:{
                                 int o=0;
                                System.out.println("Desea Comprar...");
                                System.out.println("1.Casas");
                                System.out.println("2.Edificios");
                                System.out.println("3.Solares");
                                o = read.nextInt();
                                switch (o){
                                   case 1:
                                        System.out.println("Ingrese la posicion de casa a comprar ");
                                        int posi = read.nextInt();
                                         if( posi>=0& posi<builds.size()&&builds.get(posi)instanceof Casa ){
                                            builds.remove(posi);
                                             System.out.println("Elemento Comprado");
                                        }else{
                                             System.out.println("La posicion entregada no es valida");
                                    }
                                    break;
                                    case 2:
                                        System.out.println("Ingrese la posicion de edificio a comprar ");
                                        int pos = read.nextInt();
                                         if( pos>=0& pos<builds.size()&&builds.get(pos)instanceof Edificio ){
                                            builds.remove(pos);
                                             System.out.println("Elemento comprado");
                                        }else{
                                             System.out.println("La posicion entregada no es valida");
                                    }
                                    break;
                                    case 3:
                                        System.out.println("Ingrese la posicion de solar a comprar ");
                                        int popo = read.nextInt();
                                         if( popo>=0& popo<builds.size()&&builds.get(popo)instanceof Solar ){
                                            builds.remove(popo);
                                             System.out.println("Elemento comprado");
                                        }else{
                                             System.out.println("La posicion entregada no es valida");
                                    }

                                    break;
                                }
                            }
                            
                        }

                    
                break;
                case 2:
                     System.out.println("Ingrese contraseña de administrador");
                    String passi = read.next();
                    if(passi.equals(u.getContra())){
                    System.out.println("Ingrese el indice del inmueble que desea agregar un estado");
                    printlist(builds);
                    int papa = read.nextInt(); 
                    
                    for (Object j : builds) {
                        if(j instanceof Casa ){
                            if( papa>=0& papa<builds.size()&&builds.get(papa)instanceof Casa ){
                                            System.out.println("Ingrese el estado de la casa");
                                            String estate = read.next();
                                            ((Casa)builds.get(papa)).setEstado(estate);
                                        }else{
                                             System.out.println("La posicion entregada no es valida");
                                    }
                            if(j instanceof Edificio){
                                
                            }
                        }
                    }
                    }else{
                        System.out.println("Contrasena ingresada incorrecta");
                    }
                break;
                case 3:
                     System.out.println("Salir");
            }
        }while(op!=3);
                    }else{
                        System.out.println("Usuario invalido");
                    }
                
            break;
            case 2: 
                users.add(newUsuario());
            break;
            
        }
        }while (log!=3);
        
    }//fin main
    static Casa newCasa(){
        Color c;
        System.out.println("Ingrese Numero de casa ");
        int casa = read.nextInt();
        System.out.println("Ingrese Numero de bloque");
        int bloque = read.nextInt();
        c=JColorChooser.showDialog(null,"seleccione color",Color.black);
        System.out.println("Ingrese ancho");
        int ancho = read.nextInt();
        System.out.println("Ingrese largo");
        int largo = read.nextInt();
        System.out.println("Ingrese Numero de baños");
        int ban = read.nextInt();
        System.out.println("Ingrese Numero de Cuartos");
        int cuart = read.nextInt();
        Casa retorno = new Casa(casa,bloque,ban,cuart,ancho,largo,c);
        return retorno;
    }
    static Edificio newEdificio(){
        System.out.println("Ingrese Numero de pisos");
        int pisos = read.nextInt();
        System.out.println("Ingrese cantidad de locales");
        int local = read.nextInt();
        System.out.println("Ingrese Direccion por referencia");
        read.next();
        String dir = read.next();
        Edificio e = new Edificio(pisos,local,dir);
        return e;
    }
    static Solar newSolar(){
        System.out.println("Ingrese largo");
        int largo = read.nextInt();
        System.out.println("Ingrese ancho");
        int ancho = read.nextInt();
        Solar s = new Solar(ancho,largo);
        return s;
    }
    static Usuario newUsuario(){
        System.out.println("Ingrese nombre");
        
        String nombre = read.next();
        System.out.println("Ingrese edad");
        int e = read.nextInt();
        System.out.println("Ingrese nombre de usuario");
        String user = read.next();
        System.out.println("Ingrese contraseña");
        String contra =read.next();
        Usuario retorno = new Usuario(nombre,user,contra,e);
        return retorno;
    }
    static boolean verif(String cad, String pas, ArrayList<Usuario> usuario){
       boolean verf = false;
        for (int i = 0; i < usuario.size(); i++) {
            if(usuario.get(i).getUsername().equals(cad)){
                if(usuario.get(i).getContra().equals(pas)){
                    verf = true;
                }
        }
        }
        return verf;
    }
    static void printlist(ArrayList builds){
        for (int i = 0; i < builds.size(); i++) {
            System.out.println(i+". "+builds.get(i));
            System.out.println("");
        }
    }
    
}
