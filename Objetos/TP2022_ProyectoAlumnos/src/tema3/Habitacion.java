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
public class Habitacion {
   
    private boolean ocupada;
    private double costo;
    private Persona cliente;

    public Habitacion() {
       ocupada = false;
       costo = GeneradorAleatorio.generarDouble(6000)+2000 ;
        
    }

    public boolean getOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    public void aumentarCosto(double unValor){
        costo+=unValor;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void cargarCliente(Persona cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        String aux;
        if (ocupada) {
            aux= "ocupada";
            return (aux + ", costo=" + costo + ", cliente=" + cliente.toString());
        }else{
            aux = "libre";
            return (aux + ", costo=" + costo);
        }
        
    }
    
    
    
    
    
}
