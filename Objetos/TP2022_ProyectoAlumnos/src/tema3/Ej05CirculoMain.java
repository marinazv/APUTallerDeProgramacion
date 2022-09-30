/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;
import PaqueteLectura.Lector;
/**
 *
 * @author marin
 */
public class Ej05CirculoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Ingrese el radio del circulo: ");
        double radio= Lector.leerDouble();
        System.out.println("Ingrese color de relleno: ");
        String relleno= Lector.leerString();
        System.out.println("Ingrese color de linea: ");
        String linea = Lector.leerString();
        Circulo c= new Circulo(radio,relleno, linea);
        
        System.out.println("El area del circulo es: "+ c.calcularArea());
        System.out.println("El perimetro del circulo es: "+ c.calcularPerimetro());
    }
    
}
