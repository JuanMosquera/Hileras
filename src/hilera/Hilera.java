package hilera;
/**
 *
 * @author marioh.ramirez
 */
public class Hilera extends ListaDoblementeLigada 
{
      
    public Hilera(char letra)//Constructor de la clase Hilera
    {
        insertar(letra, null);//Inserta un char como primer nodo
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
    
    public Hilera concat(Hilera t)//Concatena la hilera que llame al método co´n la hilera t que se envia como parametro
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
    
    public Hilera copiaHilera()//Copia la hilera que invoque el método en otra hilera
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
    
    public void borrarHilera(int i, int j)//Borra parcial o totalmente una hilera
    {
        int k, n;
        n = longitud();
        if(i<1 || i>n)
        {
            System.out.println("Parámetro inválido");
            return;
        }
        if(j<1 || j>n-i+1)
        {
            System.out.println("Parámetro inválido");
            return;
        }
        NodoDoble p;
        p = primerNodo();
        k = 1;
        while(k<i)
        {
            p = p.retornaLd();
            k = k+1;
        }
        k = 0;
        while(k<j)
        {
            desconectar(p);
            p = p.retornaLd();
            k=k+1;
        }
    }
    
    public NodoDoble posicion(Hilera s)//Devuelve el nodo en el cuál comience la hilera que se ingresa como parámetro, dentro de otra hilera
    {
        NodoDoble p, pp, q;
        p = primerNodo();
        pp = p;
        q = s.primerNodo();
        while(!finDeRecorrido(p) && !s.finDeRecorrido(q))
        {
            if(p.retornaDato()==q.retornaDato())
            {
                p = p.retornaLd();
                q = q.retornaLd();
                if(s.finDeRecorrido(q))
                {
                    return pp;
                }
            }
            else
            {
                pp = pp.retornaLd();
                p = pp;
                q = s.primerNodo();
            }
        }
        return null;
    }
}
