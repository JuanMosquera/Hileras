/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilera;

/**
 *
 * @author marioh.ramirez
 */
public class Hilera extends ListaDoblementeLigada 
{
      
    public Hilera(char letra)
    {
        insertar(letra, null);
    }
    
    public int longitud() //Retorna la longitud de la hilera
    {
        NodoDoble p;
        p = primerNodo();
        int i = 0;
        while(!finDeRecorrido(p))
        {
           i=i+1;
           p = p.retornaLd();
        }
        return i;
    }
    
    public Hilera subHilera(int i, int j)//Devuelve una hilera desde la posición i de la hilera original y toma j caracteres
    {
        int k, n;
        Hilera s;
        NodoDoble p;
        n = longitud();
        if(i<1 || i>n)
        {
            System.out.println("Parámetro inválido");
            return null;
        }
        if(j<1 || j>n-i+1)
        {
            System.out.println("Parámetro inválido");
            return null;
        }
        p = primerNodo();
        k = 1;
        while(k<i)
        {
            p = p.retornaLd();
            k = k+1;
        }
        k = 2;
        char l = (char)p.retornaDato();
        s = new Hilera(l);
        p = p.retornaLd();
        while(k<=j)
        {
            l = (char)p.retornaDato();
            s.insertar(l, s.ultimoNodo());
            p = p.retornaLd();
            k = k+1;
        }
        return s;
    }
    
    public Hilera concat(Hilera t)
    {
        Hilera s;
        NodoDoble p = primerNodo();
        s = copiaHilera();
        p = t.primerNodo();
        while(!t.finDeRecorrido(p))
        {
           s.insertar(p.retornaDato(), s.ultimoNodo());
           p = p.retornaLd();
        }
        return s;
    }
    
    public Hilera copiaHilera()
    {
        Hilera s;
        NodoDoble p;
        p = primerNodo();
        s = new Hilera((char)p.retornaDato());
        p = p.retornaLd();
        while(!finDeRecorrido(p))
        {
            s.insertar(p.retornaDato(), s.ultimoNodo());
            p = p.retornaLd();
        }
        return s;
    }
    
    public void replace(int i, int j, Hilera s)            
    {
        
    }
    
    /*public int posicion(Hilera s)
    {
        
    }*/
}
