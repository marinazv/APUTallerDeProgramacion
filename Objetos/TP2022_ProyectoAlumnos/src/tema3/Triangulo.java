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
public class Triangulo {
    private double a;
    private double b;
    private double c;
    private String color;

   

    public Triangulo(double a, double b, double c, String color) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.color = color;
    }
     public Triangulo() {
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public double calcularPerimetro(){
        return (this.a+this.b+this.c);
    }
    
    public double calcularArea(){
        double s= calcularPerimetro()/2;
        return Math.sqrt(s*(s-this.a)*(s-this.b)*(s-this.c));
    }

    @Override
    public String toString() {
        return "Triangulo{" + "lado a=" + a + ", lado b=" + b + ",lado  c=" + c + ", color=" + color + '}';
    }
    
}


