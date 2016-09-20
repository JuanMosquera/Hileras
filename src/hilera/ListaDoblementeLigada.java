/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilera;

/**
 *
 * @author jfwc1
 */

public class ListaDoblementeLigada{
    
    private NodoDoble primero, ultimo;
    
    public ListaDoblementeLigada()
    {
        primero = null;
        ultimo = null;
    }
    
    public NodoDoble primerNodo()
    {
        return primero;
    }
    
    public NodoDoble ultimoNodo()
    {
        return ultimo;
    }
    
    public boolean finDeRecorrido(NodoDoble x)
    {
        return x==null;
    }
    
    public boolean esVacia()
    {
        return primero==null;
    }
    
    public void  recorreIzqDer()
    {
        NodoDoble p;
        p = primerNodo();
        while(!finDeRecorrido(p))
        {
            System.out.println(p.retornaDato());;
            p = p.retornaLd();
        }
    }
    
    public void recorreDerIzq()
    {
        NodoDoble p;
        p = ultimoNodo();
        while(!finDeRecorrido(p))
        {
            System.out.println(p.retornaDato());
            p = p.retornaLi();
        }
    }
    
    public void insertar(Object d, NodoDoble y)
    {
        NodoDoble x;
        x = new NodoDoble(d);
        conectar(x,y);
    }
    
    public void conectar(NodoDoble x, NodoDoble y)
    {
       if(y==null)
       {
           x.asignaLd(primero);
           if(primero!=null)
           {
               primero.asignaLi(x);
           }
           else
           {
               ultimo = x;
           }
           primero = x;
       }
       else if(y.retornaLd()==null)
       {
           y.asignaLd(x);
           x.asignaLi(y);
           ultimo = x;
       }
       else
       {
           x.asignaLd(y.retornaLd());
           x.asignaLi(y);
           x.retornaLd().asignaLi(x);
           y.asignaLd(x);
       }
    }
    
    public void desconectar(NodoDoble x)
    {
        if(x.retornaLi()==null)
        {
            primero = x.retornaLd();
            if(primero == null)
            {
                ultimo = null;
            }
            else
            {
                primero.asignaLi(null);
            }
        }
        else if(x.retornaLd()==null)
        {
            ultimo = x.retornaLi();
            ultimo.asignaLd(null);
        }
        else
        {
            x.retornaLd().asignaLi(x.retornaLi());
            x.retornaLi().asignaLd(x.retornaLd());
        }
    }
    
    public void borrar(NodoDoble x)
    {
        if(x==null)
        {
            System.out.println("Dato a borrar no existe.");
            return;
        }
        desconectar(x);
    }
}

