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
public class Circulo {
    private double radio;
    private String colorR;
    private String colorL;

    public Circulo(double radio, String colorR, String colorL) {
        this.radio = radio;
        this.colorR = colorR;
        this.colorL = colorL;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColorR() {
        return colorR;
    }

    public void setColorR(String colorR) {
        this.colorR = colorR;
    }

    public String getColorL() {
        return colorL;
    }

    public void setColorL(String colorL) {
        this.colorL = colorL;
    }
    
    public double calcularArea(){
    
        return Math.PI*(radio*radio);
    }
    
    public double calcularPerimetro(){
        return Math.PI*2*radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", colorR=" + colorR + ", colorL=" + colorL + '}';
    }
    
    
}
