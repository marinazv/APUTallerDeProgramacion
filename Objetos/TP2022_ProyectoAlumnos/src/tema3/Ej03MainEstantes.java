/*
- Defina una clase para representar estantes. Un estante almacena a lo sumo 20 libros. 
Implemente un constructor que permita iniciar el estante sin libros. Provea métodos para: 
(i) devolver la cantidad de libros que almacenados (ii) devolver si el estante está lleno 
(iii) agregar un libro al estante (iv) devolver el libro con un título particular que se recibe.
B- Realice un programa que instancie un estante. Cargue varios libros. A partir del estante, 
busque e informe el autor del libro “Mujercitas”.
C- Piense: ¿Qué modificaría en la clase definida para ahora permitir estantes que 
almacenen como máximo N libros? ¿Cómo instanciaría el estante?
 */
package tema3;

/**
 *
 * @author marin
 */
public class Ej03MainEstantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Libro libro1= new  Libro( "Java: A Beginner's Guide",   
                                 "Mcgraw-Hill", 2014,   
                                 new Autor("Herbert Schildt", "vbyrvbybvr", "algun lugar"), "978-0071809252", 21.72);
        Libro libro2= new Libro("Learning Java by Building Android Games",  
                              "CreateSpace Independent Publishing", 
                              new Autor( "John Horton","jbsvbsbvh","otro lugar"), "978-1512108347");
        Libro libro3= new Libro("Mujercitas",  
                              "CreateSpace Independent Publishing", 
                              new Autor( "autor de mujercitas","jbsvbsbvh","otro lugar"), "978-1512108347");
        
        Estante e= new Estante(20);
        e.cargarLibro(libro1);
        e.cargarLibro(libro2);
        e.cargarLibro(libro1);
        e.cargarLibro(libro2);
        e.cargarLibro(libro1);
        e.cargarLibro(libro2);
        e.cargarLibro(libro1);
        e.cargarLibro(libro2);
        e.cargarLibro(libro1);
        e.cargarLibro(libro2);
        e.cargarLibro(libro3);
        
        if (e.buscarLibro("Mujercitas") != null) {
            System.out.println("El autor del libro con titulo 'Mujercitas' es: "+ e.buscarLibro("Mujercitas").getPrimerAutor().getNombre());
        } else {
        System.out.println("No se encontro el libro en el estante");
        }
    }
    
}
