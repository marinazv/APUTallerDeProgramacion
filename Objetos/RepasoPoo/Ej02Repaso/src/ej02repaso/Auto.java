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
public class Auto {
    private String duenio;
    private String ptte;

    public Auto(String duenio, String ptte) {
        this.duenio = duenio;
        this.ptte = ptte;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public String getPtte() {
        return ptte;
    }

    public void setPtte(String ptte) {
        this.ptte = ptte;
    }

    @Override
    public String toString() {
        return "Auto{" + "duenio=" + duenio + ", ptte=" + ptte + '}';
    }
    
   
}
