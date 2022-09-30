/*
-A- Definir una clase para representar triángulos. Un triángulo se caracteriza por el
tamaño de sus 3 lados (double), el color de relleno (String) y el color de línea (String).
Provea un constructor que reciba todos los datos necesarios para iniciar el objeto.
Provea métodos para:
- Devolver/modificar el valor de cada uno de sus atributos (métodos get y set)
- Calcular el perímetro y devolverlo (método calcularPerimetro)
- Calcular el área y devolverla (método calcularArea)
B- Realizar un programa que instancie un triángulo, le cargue información leída desde
teclado e informe en consola el perímetro y el área. 
 */
package tema3;

/**
 *
 * @author marin
 */
import PaqueteLectura.Lector;
public class Ej01BTriangulos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Triangulo t= new Triangulo();
        System.out.println("Ingrese lado A del triangulo: ");
        t.setA(Lector.leerDouble());
        System.out.println("Ingrese lado B del triangulo: ");
        t.setB(Lector.leerDouble());
        System.out.println("Ingrese lado C del triangulo: ");
        t.setC(Lector.leerDouble());
        System.out.println("Ingrese color de linea: ");
        t.setColor(Lector.leerString());
        
        System.out.println("El perimeto del triangulo es: "+ t.calcularPerimetro());
        System.out.println("El area del triangulo es: "+ t.calcularArea());
        System.out.println(t.toString());
    }
    
}
