package hilera;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author marioh.ramirez
 */
public class newMain{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    { 
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String l = "";
        try //Lee el string que será la hilera
           {
               l = br.readLine();               
           }catch(IOException e){}
        Hilera h = new Hilera(/*l*/);
        h.construirHilera(l);
        h.recorreIzqDer();//Prueba para recorre la hilera h una vez construida
        Hilera invertir = h.invertirHilera();//Prueba para invertir la hilera
        Hilera alfabetica = h.ordernarAlfabeticamente(); //Prueba para poner la hilera en orden alfabetico
        System.out.println("¿Es palindromo? "+h.esPalindromo());//Prueba para saber si la hilera h es palindromo
        System.out.println("Longitud: "+h.longitud());
        System.out.println("Hilera d con subhilera de h: ");
        Hilera d = h.subHilera(2, 2);  //Prueba para construir una subhilera d a partir de h     
        d.recorreIzqDer();
        System.out.println("Hilera invertir: ");
        invertir.recorreIzqDer();
        System.out.println("Alfabeticamente: ");
        alfabetica.recorreIzqDer();
        Hilera s = h.copiaHilera(); //Prueba para crear una hilera s que sea copia de h
        System.out.println("Hilera s con copiaHilera de h");
        s.recorreIzqDer();
        Hilera n = s.concat(d); //Prueba para concatenar la subhilera d con copia s en una hilera n
        System.out.println("Hilera n con concatenar d con s : ");
        n.recorreIzqDer();
        h.borrarHilera(1, 3); //Prueba de borrado parcial de una hilera
        System.out.println("Hilera h con borrar: ");
        h.recorreIzqDer();
        NodoDoble x = s.posicion(d);
        System.out.println("Posición donde de comienza en s: "+x.retornaDato());
        Hilera pruebaAnagrama = new Hilera();
        pruebaAnagrama.construirHilera("nua");
        pruebaAnagrama.recorreIzqDer();
        Hilera pruebaString = new Hilera();
        pruebaString.construirHilera("ua");
        System.out.println("Es anagrama: "+pruebaAnagrama.anagrama(h));
        System.out.println("¿ua substring de nua?"+pruebaAnagrama.esSubstring(pruebaString));
        h.replace("holamariano");
        System.out.println("Hilera con replace: ");
        h.recorreIzqDer();
    }
    
}
