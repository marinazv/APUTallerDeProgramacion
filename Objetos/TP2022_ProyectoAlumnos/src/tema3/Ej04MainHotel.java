/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;
import PaqueteLectura.GeneradorAleatorio;
import tema2.Persona;
/**
 *
 * @author marin
 */
public class Ej04MainHotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       GeneradorAleatorio.iniciar();
       int N=7; // Cantidad de Habitaciones.-
       
       Hotel h= new Hotel(N);
       Persona p= new Persona("Marina", 4236547, 35);
        Persona p2= new Persona("juan", 47543547, 39);
         Persona p3= new Persona("Pedro", 13414347, 50);
         h.cargarOcuparHab(1, p3);
         h.cargarOcuparHab(2, p2);
         h.cargarOcuparHab(3, p);
         
         h.verHabitaciones();
         
         for (int i = 0; i < N; i++) {
           h.getHotelito()[i].aumentarCosto(234.6);
        }
         
         h.verHabitaciones();
    }
    
}
