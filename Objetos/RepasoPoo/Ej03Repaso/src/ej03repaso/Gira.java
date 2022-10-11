/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej03repaso;

/**
 *
 * @author Usuario
 */
public class Gira extends Recital{
    public String nombre;
    public Fecha[] fechas;    
    public int actual;
    public int dim;
    public int dimL;
    
    public Gira(String nombre, int dim, String banda, int dimF) {
        super(banda, dimF);
        this.nombre = nombre;
        this.dim=dim;
        this.dimL=0;
        this.fechas = new Fecha[dim];
        this.actual=0;
    }

    public int getDimL() {
        return dimL;
    }

    public void setDimL() {
        this.dimL ++;
    }

    public int getDim() {
        return dim;
    }

    public void setDim() {
        this.dim ++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Fecha[] getFecha() {
        return fechas;
    }

    public void setFecha(Fecha[] fecha) {
        this.fechas = fecha;
    }

    public int getActual() {
        return actual;
    }

    public void setActual() {
        this.actual++;
    }

    
    @Override
    public void agergarTema(String unTema) {
        if (super.getDimL()< super.getDimF()) {
            super.setDimL();
            temas[super.getDimL()]=unTema;
        }
    }

   public void agregarFecha(Fecha unaFecha){
      setDimL();
       fechas[this.dimL]= unaFecha;
   }
    @Override
    public void actuar(){
        System.out.println("Buenas Noches "+fechas[actual].getCiudad());
        super.actuar();
        setActual();
    }

    @Override
    public double calcularCosto() {
        return 30000*fechas.length;
    }
    
}
