/*Escriba un programa que lea las alturas de los 15 jugadores de un equipo de 
básquet y las almacene en un vector. Luego informe: 
- la altura promedio
- la cantidad de jugadores con altura por encima del promedio*/
package tema1;

//Paso 1: Importar la funcionalidad para lectura de datos
import PaqueteLectura.*;

public class Ej02Jugadores {

  
    public static void main(String[] args) {
        //Paso 2: Declarar la variable vector de double 
        int cant= 15;
        double [] jugadores= new double[cant];
        double tot=0;
        for(int i=0; i<cant; i++){
            System.out.println("Ingrese altura del jugador: ");
            jugadores[i]= Lector.leerDouble();
            tot= tot + jugadores[i];
        }
        double promedio= tot/cant;
        System.out.println("La altura promedio es: "+ promedio);
        int altos=0;
        for(int i= 0; i<cant; i++){
            if(jugadores[i]> promedio){
                altos++;
            }
            System.out.println("La cantidad de jugadores con altura mayor a la priomedio es: "+ altos);
        }
        //Paso 3: Crear el vector para 15 double 
        
        //Paso 4: Declarar indice y variables auxiliares a usar
                
        //Paso 6: Ingresar 15 numeros (altura), cargarlos en el vector, ir calculando la suma de alturas
        
        //Paso 7: Calcular el promedio de alturas, informarlo
        
        //Paso 8: Recorrer el vector calculando lo pedido (cant. alturas que están por encima del promedio)
     
        //Paso 9: Informar la cantidad.
    }
    
}
