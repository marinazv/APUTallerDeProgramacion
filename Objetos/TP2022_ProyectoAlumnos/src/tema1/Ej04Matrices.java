/*
- Un edificio de oficinas está conformado por 8 pisos (1..8) y 4 oficinas por piso
(1..4). Realice un programa que permita informar la cantidad de personas que 
concurrieron a cada oficina de cada piso. Para esto, simule la llegada de personas al 
edificio de la siguiente manera: a cada persona se le pide el nro. de piso y nro. de 
oficina a la cual quiere concurrir. La llegada de personas finaliza al indicar un nro. 
de piso 9. Al finalizar la llegada de personas, informe lo pedido.
 */
package tema1;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author marin
 */

public class Ej04Matrices {
    public static void main(String[] args) {
    
      GeneradorAleatorio.iniciar();
      int [][]ofi= new int[8][4];
      
      int piso= GeneradorAleatorio.generarInt(9);
      int oficina= GeneradorAleatorio.generarInt(4);     
      while(piso != 8){
          //System.out.println(piso + " , "+ oficina);
        ofi[piso][oficina]= ofi[piso][oficina]+ 1;
         piso= GeneradorAleatorio.generarInt(9);         
         oficina= GeneradorAleatorio.generarInt(4);          
      }
      
      for(int i=0; i<8;i++){
          for(int j= 0; j<4;j++){
              int o= j+1;
              int p=i+1;
              System.out.println("En la oficina "+ o + " del piso "+ p + " hay "+ ofi[i][j]+ " personas");
          }
      }
    }
}
