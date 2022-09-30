/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

import tema2.Persona;

/**
 *
 * @author marin
 */
public class Hotel {
    private int dimF;
    private Habitacion hotelito[];

    public Hotel(int dimF) {
        this.dimF = dimF;
        hotelito =new Habitacion[dimF];
        inicHotelito();
    }
    
    private void inicHotelito(){
        Habitacion h;
        for (int i = 0; i < dimF; i++) {
            h = new Habitacion();
            hotelito[i]=h;
        }
    }

    public int getDimF() {
        return dimF;
    }

    public void setDimF(int dimF) {
        this.dimF = dimF;
    }

    public Habitacion[] getHotelito() {
        return hotelito;
    }

    public void setHotelito(Habitacion[] hotelito) {
        this.hotelito = hotelito;
    }

    public void cargarOcuparHab(int numH, Persona unCliente){
           hotelito[numH-1].cargarCliente(unCliente);
 
    }
    
    public void verHabitaciones(){
        int aux;
        for (int i = 0; i < dimF; i++) {
            aux = i+1;
            System.out.println( "{Habitacion " + aux+ " esta " +hotelito[i].toString()+"}") ;
        }
        
    }
    
    
    
}
