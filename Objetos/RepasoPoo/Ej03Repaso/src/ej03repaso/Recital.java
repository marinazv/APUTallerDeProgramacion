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
public abstract class Recital {

    public String banda;
    public String[] temas;
    public int dimF;
    public int dimL;
    public Recital(String banda,int dimF ) {
        this.banda = banda;
        this.dimL=0;
        this.temas =new String[dimF];
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public String[] getTemas() {
        return temas;
    }

    public int getDimF() {
        return dimF;
    }

    public void setDimF() {
        this.dimF ++;
    }

    public int getDimL() {
        return dimL;
    }

    public void setDimL() {
        this.dimL++;
    }
    
    public void actuar(){
     for (int i = 0; i < temas.length; i++) {
            System.out.println("Y ahora tocaremos..."+ getTemas()[i]);
        }
    }
    public abstract void agergarTema(String unTema);
    public abstract double calcularCosto();
    
}
