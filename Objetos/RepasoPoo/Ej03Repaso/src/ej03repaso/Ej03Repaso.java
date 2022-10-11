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
public class Ej03Repaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Ocasional o= new Ocasional("beneficio", "juan gomez", "20 de nombiembre", "el mato un policia motorizado", 15);
           o.agergarTema("tema 1");
        o.agergarTema("tema 2");
        o.agergarTema("tema 3");
        o.agergarTema("tema 4");
        o.agergarTema("tema 5");
        Fecha f = new Fecha("la plata", "7 de niviembre");
        Fecha f1 = new Fecha("la plata", "17 de niviembre");
        Fecha f2 = new Fecha("la plata","23 de niviembre");
              Fecha f3= new Fecha("la plata","30de niviembre");
           Gira g=new Gira("pedro garcia", 5, "mobre de la banda", 13 );
          g.agregarFecha(f3);
          g.agregarFecha(f1);
          g.agregarFecha(f2);
          g.agregarFecha(f);
           
         g.agergarTema("tema 1");
        g.agergarTema("tema 2");
        g.agergarTema("tema 3");
        g.agergarTema("tema 4");
        g.agergarTema("tema 5");
        
        System.out.println("El costo del evento ocasional es: "+o.calcularCosto());
        o.actuar();
        System.out.println("El costo de la gira es: "+g.calcularCosto());
        g.actuar();
        
    }
    
}
