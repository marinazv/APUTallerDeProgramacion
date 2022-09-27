/*
- Se realizará un casting para un programa de TV. El casting durará a lo sumo 5 días y en 
cada día se entrevistarán a 8 personas en distinto turno.
a) Simular el proceso de inscripción de personas al casting. A cada persona se le pide
nombre, DNI y edad y se la debe asignar en un día y turno de la siguiente manera: las
personas primero completan el primer día en turnos sucesivos, luego el segundo día y así 
siguiendo. La inscripción finaliza al llegar una persona con nombre “ZZZ” o al cubrirse los 
40 cupos de casting.
Una vez finalizada la inscripción: 
b) Informar para cada día y turno el nombre de la persona a entrevistar.

 */
package tema2;

/**
 *
 * @author Usuario
 */
import PaqueteLectura.Lector;

public class Ej04Casting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia = 5;
        int turno = 8;

        Persona[][] casting = new Persona[5][8];

        //preguntar si es necesario inicializar en null 
        for (int i = 0; i < dia; i++) {
            for (int j = 0; j < turno; j++) {
                casting[i][j] = null;
            }
        }

        Persona p = new Persona();
        System.out.println("Ingrese el nombre del participante: ");
        p.setNombre(Lector.leerString());

        int i = 0;
        int j = 0;

        while (!p.getNombre().equals("zzz") && i < dia) {
            System.out.println("Ingrese edad: ");
            p.setEdad(Lector.leerInt());
            System.out.println("Ingrese dni:");
            p.setDNI(Lector.leerInt());
            casting[i][j] = p;
            j++;
            p = new Persona();
            System.out.println("Ingrese el nombre del participante: ");
            p.setNombre(Lector.leerString());
            if (!p.getNombre().equals("zzz")) {
                if (j + 1 == turno) {
                    j = 0;
                    i++;
                } else {
                    j++;
                }
            }
        }
        
        for (int k = 0; k < dia; k++) {
            for (int l = 0; l < turno; l++) {
                if(casting[k][l]!=null){
                    System.out.println("Dia "+ (k+1)+" Turno "+(l+1)+": "+casting[k][l].getNombre());
                }
            }
        }
        

    }

}
