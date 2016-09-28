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
    
    public void insertarHilera(String palabra)
    {
        char letra;
        letra = palabra.charAt(0);
        insertar(letra,null);
        NodoDoble p = primerNodo();
        for(int i=1;i<palabra.length();i++) //Pasa el String a char y construye la hilera representada como Lista Doblemente Ligada
        {
            letra = palabra.charAt(i);
            insertar(letra, p);
            p = p.retornaLd();
        }
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
    
    public void anagrama(){}
    
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
    
    public void borrarHilera()
    {
        primerNodo().asignaLd(null);
        primerNodo().asignaLi(null);
        ultimoNodo().asignaLd(null);
        ultimoNodo().asignaLi(null);
        primerNodo().asignaDato(null);
        borrar(primerNodo());
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
    
    public void replace(String s)            
    {
        borrarHilera();        
        insertarHilera(s);        
    }
    
    public boolean esPalindromo() //Devuelve verdadero si la hilera es un palindromo
    {
        NodoDoble p,q;
        int i, j;
        i = 1;
        j = longitud();
        p = primerNodo();
        q = ultimoNodo();
        while(i<j && p.retornaDato().equals(q.retornaDato()))
        {
            p = p.retornaLd();
            q = q.retornaLi();
            i = i+1;
            j = j-1;
        }
        if(i<j)
        {
            return false;
        }
        return true;
    }
    
    public Hilera invertirHilera() //Devuelve una hilera invertida de la hilera original
    {
        Hilera s;
        NodoDoble p, q;
        p = ultimoNodo();
        s = new Hilera((char)p.retornaDato());
        p = p.retornaLi();
        q = s.primerNodo();
        while(!finDeRecorrido(p))
        {
            s.insertar(p.retornaDato(), q);
            p = p.retornaLi();
            q = q.retornaLd();
        }
        return s;
    }
    
    public Hilera ordernarAlfabeticamente() //Devulve la hilera original ordenada alfábeticamente
    {
        Hilera s;
        char menor;
        NodoDoble p,y;
        p = primerNodo();
        menor = (char)p.retornaDato();
        p = p.retornaLd();
        while(!finDeRecorrido(p)) //Busca el menor dato en la hilera original
        {            
            if((char)p.retornaDato()<menor)
            {
                menor = (char)p.retornaDato();
            }
            p = p.retornaLd();
        }
        s = new Hilera(menor);
        p = primerNodo();
        while(longitud() != s.longitud()) //Ciclo en donde se insertan los datos en orden alfabetico en una nueva hilera
        {
            y = s.buscaDondeInsertar(p.retornaDato());
            s.insertar(p.retornaDato(), y);
            p = p.retornaLd();
            System.out.println(longitud()+" "+s.longitud());
        }
        return s; //Retorna la nueva hilera en orden alfabetico
    }
            
}
