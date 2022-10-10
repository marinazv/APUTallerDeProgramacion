/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej01repaso;

/**
 *
 * @author marin
 */
public class Proyecto {
    private String nombre;
    private int cod;
    private String director;
    private Investigador[] investigadores;
    private int dimL;

    public Proyecto(String nombre, int cod, String director) {
        this.nombre = nombre;
        this.cod = cod;
        this.director = director;
        this.dimL=0;
        investigadores= new Investigador[50];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Investigador[] getInvestigadores() {
        return investigadores;
    }

    public void agregarInvestigador(Investigador unInvestigador) {
        if (dimL<50) {
            setDimL();
            investigadores[dimL]= unInvestigador;
        }
    }

    public int getDimL() {
        return dimL;
    }

    private void setDimL() {
        this.dimL++;
    }
    
    public double dineroTotalOtorgado(){
        double tot =0;
        for (int i = 0; i < dimL; i++) {                            
            tot += investigadores[i].calcularSubsidiosTot();
        }
        return tot;
    }
    
      public void otorgarTodos(String unNombre){
         int i=0;
         while(i<dimL && !investigadores[i].getNombre().equals(unNombre)){} 
            i++;
            if (investigadores[i].getNombre().equals(unNombre)) {
              investigadores[i].OtorgarTodos();
          }
      }
      private String toStringInvestigadores(){
          String aux = "Investigadores= ";
          for (int i = 0; i < dimL; i++) {
              if (investigadores[i]!=null) {
                   aux+= investigadores[i].toString();
              }
             
          }
          return aux;
      }
    @Override
    public String toString() {
        return "Proyecto{" + "nombre=" + nombre + ", cod=" + cod + ", director=" + director +toStringInvestigadores()+ '}';
    }
      
      
}
