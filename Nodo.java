/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodo;

import java.util.Scanner;
/**
 *
 * @author Ana Karen
 */
public class Nodo {
    Scanner sc = new Scanner(System.in);
    
    static class nodo {
        String dato;
        nodo sig; 
    }
    
    nodo fin = null; 

    /**
     * @param args the command line arguments
     */
public void agregar() { 
        nodo temp;
        System.out.println("agregar el dato ");
        if (fin == null) {
            fin = new nodo();
            fin.dato = sc.nextLine();
            fin.sig = null;
        } else {
            temp = new nodo();
            temp.dato = sc.nextLine();
            temp.sig = fin;
            fin = temp;  
        }    
    }
    public void mostrar() {

        nodo actual = new nodo();
        actual = fin;
        if (fin != null) {
            while (actual != null) {
                if(actual.dato!=null){
                System.out.print(" DATO " + "[" + actual.dato + "]\n");
                };
                actual = actual.sig;
            }
        } else {
            System.out.println("\n La lista se encuentra vacia\n");
        }
    }
    public void eliminar() {
    	if(fin!=null) {
    		fin=fin.sig;
    	}else {
    		System.out.print("No hay nada que eliminar en el nodo");
    	}
      
    }
    public static void main(String[] args) {
   
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        String dato;
        nodo n = new nodo();
        do {
            System.out.println("1 Agregar \n"
                    + "2 Mostrar dato \n"
                    + "3 Eliminar DATO\n"
                    + "4 Salir");
            switch (opt = sc.nextInt()) {
                case 1:
                    n.agregar(); 
                    break;

                case 2:
                    n.mostrar();
                    break;
                case 3:
                    n.eliminar();
                    break;
                case 4: 
                    System.out.println("fin");
                    break;
                    default:
                        System.out.println("Invalido");
                        
            }
        } while (opt != 5);
    }
    
}
