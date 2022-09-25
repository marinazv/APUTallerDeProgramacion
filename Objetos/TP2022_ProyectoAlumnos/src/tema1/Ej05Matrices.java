/*
El dueño de un restaurante entrevista a cinco clientes y les pide que califiquen 
(con puntaje de 1 a 10) los siguientes aspectos: (0) Atención al cliente (1) Calidad 
de la comida (2) Precio (3) Ambiente.
Escriba un programa que lea desde teclado las calificaciones de los cinco clientes 
para cada uno de los aspectos y almacene la información en una estructura. Luego 
imprima la calificación promedio obtenida por cada aspecto
 */
package tema1;

/**
 *
 * @author Usuario
 */
import PaqueteLectura.*;
public class Ej05Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cli=5;
        int item=4;
        
        double [][] table= new double[cli][item];
        double []totales= new double[item];
        
        for (int i = 0; i < cli; i++) {
            
            System.out.println("Ingrese puntaje de atencion al cliente: ");
            table[i][0]= Lector.leerDouble();
            totales[0]= totales[0]+ table[i][0];
            System.out.println("Ingrese puntaje de Calidad de la comida: ");
            table[i][1]= Lector.leerDouble();
            totales[1]= totales[1]+ table[i][1];
            System.out.println("Ingrese puntaje de Precio: ");
            table[i][2]= Lector.leerDouble();
            totales[2]= totales[2]+ table[i][2];
            System.out.println("Ingrese puntaje de Ambiente: ");
            table[i][3]= Lector.leerDouble();
            totales[3]= totales[3]+ table[i][3];            
            
        }
        for (int i = 0; i < item; i++) {
            System.out.println("Item "+ i+ ", tiene calificacion promedio de: "+ totales[i]/cli);
        }
        
    }
    
}
