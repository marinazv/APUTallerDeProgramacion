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
public class Ej01Repaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Investigador i1= new Investigador("Marina", "Quimica", 2);
        Investigador i2= new Investigador("Juan", "fisica", 3);
        Investigador i3= new Investigador("Martin", "matdmatica", 5);
        
        Proyecto p=new Proyecto("Primer proyecto", 4, "Juan Gomez");
        
       p.agregarInvestigador(i1);
       p.agregarInvestigador(i2);
       p.agregarInvestigador(i3);
       
        Subsidio s= new Subsidio(456.7, "materiales");
        Subsidio s2= new Subsidio(678.3, "sueldos");
        
          p.getInvestigadores()[1].agregarSubsidio(s);
          p.getInvestigadores()[1].agregarSubsidio(s2);      
     
       /*for (int i = 0; i < p.getDimL(); i++) {
            p.getInvestigadores()[i].agregarSubsidio(s);
            p.getInvestigadores()[i].agregarSubsidio(s2);
        }
       */
        p.getInvestigadores()[2].OtorgarTodos();
        
       System.out.println(p.toString());
    }
    
}
