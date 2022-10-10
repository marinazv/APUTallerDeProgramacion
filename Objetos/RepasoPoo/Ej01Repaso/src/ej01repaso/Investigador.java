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
public class Investigador {
    private String nombre;
    private String especialidad;
    private int categoria;
    private Subsidio[] subsidios;
    private int dimL;

    public Investigador(String nombre, String especialidad, int categoria) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.categoria = categoria;
        this.dimL=0;
        subsidios= new Subsidio[5];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public Subsidio[] getSubsidios() {
        return subsidios;
    }


    public int getDimL() {
        return dimL;
    }

    private void setDimL() {
        this.dimL ++;
    }
        public void agregarSubsidio(Subsidio unSubsidio) {
        if (dimL==0) {
            subsidios[0]=unSubsidio;
        }else if (dimL<5) {
                this.dimL++;
                subsidios[dimL]=unSubsidio;
            }
    }
    
        public double calcularSubsidiosTot(){
        double tot=0;
            for (int i = 0; i < dimL; i++) {
                if (subsidios[i].isOtorgado()) {
                    tot+= subsidios[i].getMonto();
                }
                
            }
        return tot;
        }
        
        public void OtorgarTodos(){
            for (int i = 0; i < dimL; i++) {
                if (!subsidios[i].isOtorgado()) {
                    subsidios[i].setOtorgado();
                }
            }
        }

    @Override
    public String toString() {
        return "Investigador{" + "nombre=" + nombre + ", especialidad=" + especialidad + ", categoria=" + categoria +" Total subsidios recibidos= "+ calcularSubsidiosTot() +'}';
    }
    
}
