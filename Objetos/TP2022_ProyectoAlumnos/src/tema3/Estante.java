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
public class Estante {
    private int dimF;
    private int dimL;
    private Libro est [];

    public Estante(int unaDim) {
        dimF=unaDim;
        dimL=0;
        est = new Libro[dimF];
        inicializarEstante();
    }
    
    private void inicializarEstante(){
        for (int i = 0; i < dimF; i++) {
            est[i]=null;
        }
    }
    
    private void setDimL(){
        dimL++;
    }
    
    public boolean estaLleno(){
        if ((dimL + 1) == dimF) {
            return true;
        }else {
            return false;
        }
         
    }
    public void cargarLibro(Libro unLibro){
        if (!estaLleno()) {
            setDimL();
            est[dimL]= unLibro;
        }
    }
    
    public int cantLibros(){
        return dimL;
    }
    
    public Libro buscarLibro(String unTitulo){
        for (int i = 0; i <= dimL; i++) {
            if (est[i].getTitulo().equals(unTitulo)) {
                return est[i];
            }
        }
        return null;
    }
    
    
}
