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
public class Ej02EmpleadosMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jugador j= new Jugador(14, 6, "juan gomez", 12345.56,9);
        
        Entrenador e = new Entrenador(8, "martin garcia", 3456.7,12);
        System.out.println(j.toString());
        System.out.println(e.toString());
    }
    
}
