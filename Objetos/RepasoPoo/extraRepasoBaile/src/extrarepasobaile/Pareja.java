/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extrarepasobaile;

/**
 *
 * @author marin
 */
public class Pareja {
    private Participante[] par;
    private String disciplina;

    public Pareja(Participante p1, Participante p2, String disciplina) {
        setPar(p1,p2);
        this.disciplina = disciplina;
    }

    public Participante[] getPar() {
        return par;
    }

    public void setPar(Participante p1, Participante p2) {
        this.par[0]= p1;
        this.par[1]=p2;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
    public int diferenciaEdad(){
    return Math.abs(par[0].getEdad() - par[1].getEdad());
    }
    
}
