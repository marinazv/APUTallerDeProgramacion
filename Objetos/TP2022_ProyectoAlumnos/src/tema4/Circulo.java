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
public class Circulo extends Figura {

    private double radio;

    public Circulo(double radio, String unCR, String unCL) {
        super(unCR, unCL);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {

        return Math.PI * (radio * radio);
    }

    @Override
    public double calcularPerimetro() {
        return Math.PI * 2 * radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + super.toString() + '}';
    }


}
