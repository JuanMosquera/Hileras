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
        Hilera h = new Hilera('n');
        System.out.println(h.primerNodo().retornaDato()+""+h.longitud());
        h.insertar('a', h.primerNodo());
        System.out.println(h.primerNodo().retornaLd().retornaDato()+""+h.primerNodo().retornaDato()+""+h.longitud());
        h.recorreDerIzq();
        h.recorreIzqDer();
        NodoDoble p = h.primerNodo().retornaLd();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        char letra = 0;
        String l = "";
        try
           {
               l = br.readLine();               
           }catch(IOException e){}
        for(int i=0;i<l.length();i++)
        {
            letra = l.charAt(i);
            h.insertar(letra, p);
            p = p.retornaLd();
        }
        
        h.recorreIzqDer();
        System.out.println(h.longitud());
        Hilera d = h.subHilera(3, 4);
        System.out.println("Hilera d: ");
        d.recorreIzqDer();
        Hilera s = h.copiaHilera();
        Hilera n = d.concat(s);
        System.out.println("Hilera s: ");
        s.recorreIzqDer();
        System.out.println("Hilera n : ");
        n.recorreIzqDer();
        h.borrarHilera(3, 4);
        System.out.println("Hilera h con borrar: ");
        h.recorreIzqDer();
        NodoDoble x = s.posicion(d);
        System.out.println(x.retornaDato());
    }
    
}
