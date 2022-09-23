/*
  Escriba un programa que defina una matriz de enteros de tamaño 5x5. Inicialice 
la matriz con números aleatorios entre 0 y 30. 
Luego realice las siguientes operaciones: 
- Mostrar el contenido de la matriz en consola. 
- Calcular e informar la suma de los elementos de la fila 1
- Generar un vector de 5 posiciones donde cada posición j contiene la suma 
de los elementos de la columna j de la matriz. Luego, imprima el vector.
- Lea un valor entero e indique si se encuentra o no en la matriz. En caso de 
encontrarse indique su ubicación (fila y columna) en caso contrario 
imprima “No se encontró el elemento”.
 */
package tema1;

import PaqueteLectura.GeneradorAleatorio;

public class Ej03Matrices {

    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        int dim=5;
        int [][] tabla= new int[dim][dim];
        for(int i=0; i<dim; i++){
           for(int j=0;j<dim;j++){
               tabla[i][j]= GeneradorAleatorio.generarInt(31);
           }
        }
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                System.out.print("-"+tabla[i][j]+"-");

            }
            System.out.println("");
        }
        int sum=0;
        for(int j=0;j<dim;j++){
            sum= sum+ tabla[1][j];
        }
        System.out.println("La sumatorioa total de los elementos de la fila 1 es: "+ sum);
        
        int [] vecJ= new int[dim];
        for(int i=0; i< dim; i++){
            for(int j=0; j<dim; j++){
                
            }
        }
	    //Paso 2. iniciar el generador aleatorio     
	 
        //Paso 3. definir la matriz de enteros de 5x5 e iniciarla con nros. aleatorios 
    
        //Paso 4. mostrar el contenido de la matriz en consola
    
        //Paso 5. calcular e informar la suma de los elementos de la fila 1
    
        //Paso 6. generar un vector de 5 posiciones donde cada posición j contiene la suma de los elementos de la columna j de la matriz. 
        //        Luego, imprima el vector.

        //Paso 7. lea un valor entero e indique si se encuentra o no en la matriz. En caso de encontrarse indique su ubicación (fila y columna)
        //   y en caso contrario imprima "No se encontró el elemento".

    }
}
