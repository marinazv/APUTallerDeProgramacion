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
public class Triangulo extends Figura {
    
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(double ladoA, double ladoB, double ladoC, String unCR, String unCL) {
        super(unCR, unCL);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }


       

    @Override
    public double calcularArea() {
        double s= calcularPerimetro()/2;
        return Math.sqrt(s*(s-this.ladoA)*(s-this.ladoB)*(s-this.ladoC));
    }

    @Override
    public double calcularPerimetro() {
        return (this.ladoA+this.ladoB+ this.ladoC);
    }

    @Override
    public String toString() {
        return "Triangulo{" + "ladoA=" + ladoA + ", ladoB=" + ladoB + ", ladoC=" + ladoC + super.toString()+'}';
    }
    
    
}
