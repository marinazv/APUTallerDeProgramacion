/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author marin
 */
public class Ej01Figuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       Circulo c= new Circulo(6,"azul", "rojo");
       
       Triangulo t = new Triangulo(10,12,20, "celeste", "rosa");
       
        System.out.println(c.toString());
        c.despintar();
         System.out.println("Circulo despintado: "+ c.toString());
         
        System.out.println(t.toString());
        
       
        
    }
    
}
