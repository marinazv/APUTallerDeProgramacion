/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej02repaso;

/**
 *
 * @author Usuario
 */
public class Estacionamiento {
    private String nombre;
    private String dir;
    private String apertura;
    private String cierre;
    private Auto[][] autos;
    private int n;
    private int m;

    public Estacionamiento(String nombre, String dir) {
        this.nombre = nombre;
        this.dir = dir;
        this.n=5;
        this.m=10;
        this.autos= new Auto[n][m];
        this.apertura= "8.00 Am";
        this.cierre= "21.00 Pm";
        
    }

    public Estacionamiento(String nombre, String dir, String apertura, String cierre, int n, int m) {
        this.nombre = nombre;
        this.dir = dir;
        this.apertura = apertura;
        this.cierre = cierre;
        this.n = n;
        this.m = m;
        this.autos= new Auto[n][m];
       
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getApertura() {
        return apertura;
    }

    public void setApertura(String apertura) {
        this.apertura = apertura;
    }

    public String getCierre() {
        return cierre;
    }

    public void setCierre(String cierre) {
        this.cierre = cierre;
    }

    public Auto[][] getAutos() {
        return autos;
    }

    public void agregarAutoEn(Auto unAuto, int x, int y) {
        autos[x][y]= unAuto;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }
     
    public Boolean esta(String unaPatente){
        boolean esta= false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (autos[i][j].getPtte().equals(unaPatente)) {
                    esta= true;
                }
            }
        }
        return esta;
    }
    public String buscarPatente(String unaPatte){
        String aux= "Auto Inexistente";
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (autos[i][j].getPtte().equals(unaPatte)) {
                    return "El vehiculo con patente "+unaPatte+ " se encuentra en el piso "+ (i+1)+", plaza "+(j+1);                    
                }
            }
        }
        
        return aux;
    }
    
    public int cantPlazas(int y){
        int count=0;
        for (int i = 0; i < n; i++) {
            if (autos[i][y] != null) {
                count++;
            }            
        }
             
        return count;
    }
    private String plazasString(){
        String aux="";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (autos[i][j]== null) {
                    aux+= " Piso"+(i+1)+" Plaza "+(j+1)+": libre";
                }else{
                    aux+= " Piso"+(i+1)+" Plaza "+(j+1)+": ocupada"+autos[i][j].toString();
                }
 
            }
        }
        return aux;
    }
    @Override
    public String toString() {
        
        return "Estacionamiento{" + plazasString()+'}';
    }
    
 
    
    
    
}
