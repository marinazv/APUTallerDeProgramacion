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
        this.dimF=dimF;
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
        System.out.println(this.dimL);
     for (int i = 0; i < this.dimL; i++) {
            System.out.println("Y ahora tocaremos..."+ getTemas()[i]);
        }
    }
    public void agergarTema(String unTema){
      
        if (getDimL()< getDimF()) {            
            temas[getDimL()]=unTema;
            setDimL();
        }
    }
    public abstract double calcularCosto();
    
}
