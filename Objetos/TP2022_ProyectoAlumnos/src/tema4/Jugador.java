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
public class Jugador extends Empleado{

    private int partidos;
    private int goles;

    public Jugador(int partidos, int goles, String unNombre, double sueldoBasico, double antiguedad) {
        super(unNombre, sueldoBasico, antiguedad);
        this.partidos = partidos;
        this.goles = goles;
    }

    public int getPartidos() {
        return partidos;
    }

    public void setPartidos(int partidos) {
        this.partidos = partidos;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }
    
    
    @Override
    public double calcularEfectividad() {
        return getGoles()/getPartidos();
    }

    @Override
    public double calcularSueldoACobrar() {
       double aTot= 0.10*getAntiguedad();
        if (calcularEfectividad()>0.5) {
            return getSueldoBasico()*(2+aTot);
        }else{
            return getSueldoBasico()*(1+aTot);
        }
    }

    @Override
    public String toString() {
        return "Jugador{" + super.toString() + '}';
    }
    
    
}
