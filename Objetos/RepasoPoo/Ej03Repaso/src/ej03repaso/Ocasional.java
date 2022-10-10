/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej03repaso;

/**
 *
 * @author Usuario
 */
public class Ocasional extends Recital {
   public String motivo;
   public String contratante;
   public String fecha;

    public Ocasional(String motivo, String contratante, String fecha, String banda, int dimF) {
        super(banda, dimF);
        this.motivo = motivo;
        this.contratante = contratante;
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getContratante() {
        return contratante;
    }

    public void setContratante(String contratante) {
        this.contratante = contratante;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public void agergarTema(String unTema) {
       
        if (super.getDimL()< super.getDimF()) {
            super.setDimL();
            temas[super.getDimL()]=unTema;
        }
    }

    @Override
    public void actuar() {
       switch(this.motivo){
           case "beneficencia": 
               System.out.println("Recuerden colaborar con "+ this.contratante);
               super.actuar();
           case "show de tv": 
               System.out.println("Saludos amigos televidentes");
               super.actuar();
           case "show privado": 
               System.out.println("Un feliz cumpleanios para "+ this.contratante);
               super.actuar();
           default: 
               super.actuar();
       }
 
    }

    @Override
    public double calcularCosto() {
        double costo = -1;    
        
        switch(this.motivo){
           case "beneficencia": 
               costo= 0;
           case "show de tv": 
             costo =50000;
           case "show privado": 
               costo=150000;
         }
       return costo;
    }
   
   
}
