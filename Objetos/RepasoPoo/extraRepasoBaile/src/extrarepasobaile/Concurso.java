/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extrarepasobaile;

/**
 *
 * @author marin
 */
public class Concurso {
    private int N;
    private Pareja[] parejas;
    private int dimL;
    
    public Concurso(int N) {
        this.N = N;
        this.dimL=0;
        this.parejas = new Pareja[N];
    }

    public int getN() {
        return N;
    }

    public void setN(int N) {
        this.N = N;
    }

    public Pareja[] getParejas() {
        return parejas;
    }

    public void setParejas(Pareja[] parejas) {
        this.parejas = parejas;
    }

    public int getDimL() {
        return dimL;
    }

    public void setDimL() {
        this.dimL ++;
    }
    
    public void agregarPareja(Pareja par){
            this.parejas[dimL]= par;
            this.setDimL();       
    }
    
    public Pareja diferenciaEdadMax(){
        Pareja pMax=null;
        
        for (int i = 0; i < dimL; i++) {
            if (parejas[i].diferenciaEdad()> pMax.diferenciaEdad()) {
               pMax= parejas[i];
            }
        }
        return pMax;
    }
}
