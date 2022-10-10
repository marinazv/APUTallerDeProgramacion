/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej02repaso;

/**
 *
 * @author Usuario
 */
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.*;
public class Ej02Repaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        Estacionamiento e= new Estacionamiento("estacionamiento1", "bla bla numero456", "9 am", "18 pm", 3,3);
        
       Auto a= new Auto("marina zurita", "zds 475");
       Auto a2= new Auto("juan gomez", "gdj 734");
       Auto a3= new Auto("pedro garcia", "fsf 453");
       Auto a4= new Auto("ana saez", "fds 280");
       Auto a5= new Auto("martin blabla", "abc 345");
       Auto a6= new Auto("maria garcia", "dsf 345");
       
       e.agregarAutoEn(a, GeneradorAleatorio.generarInt(3), GeneradorAleatorio.generarInt(3));
       e.agregarAutoEn(a2, GeneradorAleatorio.generarInt(3), GeneradorAleatorio.generarInt(3));
       e.agregarAutoEn(a3, GeneradorAleatorio.generarInt(3), GeneradorAleatorio.generarInt(3));
       e.agregarAutoEn(a4, GeneradorAleatorio.generarInt(3), GeneradorAleatorio.generarInt(3));
       e.agregarAutoEn(a5, GeneradorAleatorio.generarInt(3), GeneradorAleatorio.generarInt(3));
       e.agregarAutoEn(a6, GeneradorAleatorio.generarInt(3), GeneradorAleatorio.generarInt(3));
       
        System.out.println(e.toString());
        System.out.println("La cantidad de plazaas es: " + e.cantPlazas(1));
        System.out.println("Ingrese la patente que desa buscar: ");
        String patente= Lector.leerString();
        
       System.out.println(e.buscarPatente(patente));
    }
    
}
