/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

/**
 *
 * @author marin
 */
public class Entrenador extends Empleado {
    private int ganados;

    public Entrenador(int ganados, String unNombre, double sueldoBasico, double antiguedad) {
        super(unNombre, sueldoBasico, antiguedad);
        this.ganados = ganados;
    }

    public int getGanados() {
        return ganados;
    }

    public void setGandos(int gandos) {
        this.ganados = gandos;
    }
    
    
    @Override
    public double calcularEfectividad() {
        return getGanados()/getAntiguedad() ;
    }

    @Override
    public double calcularSueldoACobrar() {
         double aTot= 0.10*getAntiguedad()+1;
         double basicoAux=getSueldoBasico()*aTot;
         
         if (getGanados() >1 && getGanados()<4) {
            return basicoAux+ 5000;
        }
         else if (getGanados()>5 && getGanados()<10) {
            return basicoAux+30000;
        } else if(getGanados()>10){
            return basicoAux+ 50000;
        } else{
            return basicoAux;
        }
    }

    @Override
    public String toString() {
        return "Entrenador{" + super.toString() + '}';
    }
    
    
    
}
