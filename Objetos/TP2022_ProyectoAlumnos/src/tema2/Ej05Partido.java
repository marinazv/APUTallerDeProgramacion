/*
Implemente un programa que cargue un vector con a lo sumo 20 partidos disputados en 
el campeonato. La información de cada partido se lee desde teclado hasta ingresar uno con 
nombre de visitante “ZZZ” o alcanzar los 20 partidos. Luego de la carga:
- Para cada partido, armar e informar una representación String del estilo:
{EQUIPO-LOCAL golesLocal VS EQUIPO-VISITANTE golesVisitante }
- Calcular e informar la cantidad de partidos que ganó River.
- Calcular e informar el total de goles que realizó Boca jugando de local
 */
package tema2;

/**
 *
 * @author Usuario
 */
import PaqueteLectura.Lector;

public class Ej05Partido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int cantP = 20;
        int dimL = 0;
        
        Partido[] partidos = new Partido[cantP];

        Partido p = new Partido();
        System.out.println("Ingrese nombre del equipo visitante: ");
        p.setVisitante(Lector.leerString());

        while (dimL < cantP && !p.getVisitante().equals("ZZZ")) {
            System.out.println("Ingrese nombre del equipo Local: ");
            p.setLocal(Lector.leerString());
            System.out.println("Ingrese cantidad de goles del equipo local:");
            p.setGolesLocal(Lector.leerInt());
            System.out.println("Ingrese cantidad de goles del eqwuipo visitante:");
            p.setGolesVisitante(Lector.leerInt());
            partidos[dimL]=p;
            dimL++;
            p = new Partido();
            System.out.println("Ingrese nombre del equipo visitante: ");
            p.setVisitante(Lector.leerString());
        }
        int ganados = 0;
        int golesTot = 0;
        for (int i = 0; i < dimL; i++) {
            Partido pt = partidos[i];
            //(pt.getLocal().equals("River") || pt.getVisitante().equals("River"))
            if ( pt.getGanador().equals("River")) {
                ganados++;
            }

            System.out.println(partidos[i].toString());
            if (pt.getLocal().equals("Boca")) {
                golesTot += pt.getGolesLocal();
            } 
        }
        System.out.println("La cantidad de partidos que gano River es: " + ganados);
        System.out.println("La cantidad de goles que hizo boca de local es: " + golesTot);

    }

}
