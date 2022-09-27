/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;

import PaqueteLectura.Lector;

/**
 *
 * @author marin
 */
public class PersonaMain {

    /**
     * Realice un programa que cree un objeto persona con datos leídos desde teclado. Luego 
muestre en consola la representación de ese objeto en formato String.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* Persona p1=new Persona();
        System.out.println("Ingrese nombre de la persona:");
        p1.setNombre(Lector.leerString());
        System.out.println("Ingrese dni:");
        p1.setDNI(Lector.leerInt());
        System.out.println("Ingrese edad: ");
        p1.setEdad(Lector.leerInt());
        
        System.out.println( p1.toString());
        */
        Persona p2= new Persona("ariel", 34555,37);
        System.out.println(p2.toString());
        
 
    }
    
}
