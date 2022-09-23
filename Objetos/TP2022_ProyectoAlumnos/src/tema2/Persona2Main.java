/*
Utilizando la clase Persona. Realice un programa que almacene en un vector a lo sumo
15 personas. La información (nombre, DNI, edad) se debe generar aleatoriamente hasta 
obtener edad 0. Luego de almacenar la información:
 - Informe la cantidad de personas mayores de 65 años.
 - Muestre la representación de la persona con menor DNI.
 */
package tema2;

/**
 *
 * @author marin
 */
import PaqueteLectura.*;

public class Persona2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        int dimF = 15;
        int dimL = 0;
        Persona[] vecPer = new Persona[dimF];
        Persona p = new Persona();
        p.setEdad(GeneradorAleatorio.generarInt(99));
        while (dimL < dimF && p.getEdad() != 0) {
            p.setNombre(GeneradorAleatorio.generarString(20));
            p.setDNI(GeneradorAleatorio.generarInt(99999999));
            vecPer[dimL] = p;
            dimL++;            
            p = new Persona();
            p.setEdad(GeneradorAleatorio.generarInt(99));
        }
        int count = 0;
        Persona pMin= new Persona();
        pMin.setEdad(99);
        for (int i = 0; i < dimL; i++) {
            if (vecPer[i].getEdad() > 65) {
                count++;
            }
            if (vecPer[i].getEdad() < pMin.getEdad()) {
                pMin = vecPer[i];
            }

        }
        System.out.println("La cantidad de personas mayores a 65 años es: "+ count);
        System.out.println(pMin.toString());
        
            }
}