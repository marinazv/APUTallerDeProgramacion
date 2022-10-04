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
public abstract class Empleado {
    private String nombre;
    private double sueldoBasico;
    private double antiguedad;

    public Empleado(String unNombre, double sueldoBasico, double antiguedad) {
       setNombre(unNombre);
       setSueldoBasico(sueldoBasico);
       setAntiguedad(antiguedad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public double getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(double antiguedad) {
        this.antiguedad = antiguedad;
    }
      
    public abstract double calcularEfectividad();
    
    public abstract double calcularSueldoACobrar();

    @Override
    public String toString() {
        return  "nombre=" + nombre + " Sueldo= "+ this.calcularSueldoACobrar()+" Efectividad= "+this.calcularEfectividad();
    }
    
    
}
