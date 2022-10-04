/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

import tema2.Persona;

/**
 *
 * @author marin
 */
public class Ej03GaritaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p= new Persona("marina", 432563, 35);
        
        Trabajador t= new Trabajador("jardinero","Juan", 254664, 45);
        
        System.out.println(p.toString());
        System.out.println(t.toString());
    }
    
}
