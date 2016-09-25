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
        Hilera h = new Hilera('a');//Construye la hilera h
        NodoDoble p = h.primerNodo(); 
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        char letra = 0;
        String l = "";
        try //Lee el string que será la hilera
           {
               l = br.readLine();               
           }catch(IOException e){}
        for(int i=0;i<l.length();i++) //Pasa el String a char y construye la hilera representada como Lista Doblemente Ligada
        {
            letra = l.charAt(i);
            h.insertar(letra, p);
            p = p.retornaLd();
        }
        
        h.recorreIzqDer();//Prueba para recorre la hilera h una vez construida
        Hilera invertir = h.invertirHilera();//Prueba para invertir la hilera
        Hilera alfabetica = h.ordernarAlfabeticamente(); //Prueba para poner la hilera en orden alfabetico
        System.out.println(h.esPalindromo());//Prueba para saber si la hilera h es palindromo
        System.out.println(h.longitud());
        Hilera d = h.subHilera(3, 4);  //Prueba para construir una subhilera d a partir de h     
        System.out.println("Hilera invertir: ");
        invertir.recorreIzqDer();
        System.out.println("Alfabeticamente: ");
        alfabetica.recorreIzqDer();
        System.out.println("Hilera d: ");
        d.recorreIzqDer();
        Hilera s = h.copiaHilera(); //Prueba para crear una hilera s que sea copia de h
        Hilera n = d.concat(s); //Prueba para concatenar la subhilera d con copia s en una hilera n
        System.out.println("Hilera s: ");
        s.recorreIzqDer();
        System.out.println("Hilera n : ");
        n.recorreIzqDer();
        h.borrarHilera(3, 4); //Prueba de borrado parcial de una hilera
        System.out.println("Hilera h con borrar: ");
        h.recorreIzqDer();
        NodoDoble x = s.posicion(d);
        System.out.println(x.retornaDato());
        
    }
    
}
