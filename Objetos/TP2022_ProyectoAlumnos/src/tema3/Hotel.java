/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3;

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

    
    
    public void verHabitaciones(){
        int aux;
        for (int i = 0; i < dimF; i++) {
            aux = i+1;
            System.out.println( "{Habitacion " + aux +hotelito[i].toString()+"}") ;
        }
        
    }
    
    
    
}
