/*
 - man kan inte ha ett upprepande element i en mängd.(kan inte finnas ett element flera gnger)
 - en referens till en vektor som instansvariabel (canvas)
 */

class Set
{
    private int[] e;

    public Set() //default konstruktör som skapar en array med längd 0
    {
        this.e = new int[0];
    }

    public Set (int[] e)
    {
        this.e = new int[e.length];
        for( int i = 0; i < e.length ; i++)
        {
            this.e[i] = e[i];
        }
    }

    public Set (Set s)  //copy constructor? skapade en array och kopierade allt från e till s. s är en ref.
                        // till en ny array
    {
        this.e = new int[s.e.length];
        for( int i = 0; i < e.length ; i++)
        {
            this.e[i] = e[i];
        }
    }
    public String toString()
    {
        String s = "[";

        if(e.length > 0)
        {
            for(int i = 0; i < e.length-1 ; i++)
            {
                s += e[i] + ", ";
            }
            s += e[e.length - 1];
        }
        
        s += "]";

        return s;
    }
    public int countElements ()
    {
        return e.length;
    }

    public int[] getElements ()
    {
        int[] a = new int[e.length];
        for(int i = 0 ; i < e.length; i++)
        {
            a[i] = e[i];
        }
        return a; //här har vi kopierat hela arrayen vilket är bättre för att user kan inte förstöra arrayn
        // return e; //här returnerar vi originala arrayn som kan modifieras av user. 
    }
    public boolean contains(int el)
    {
        boolean exist = false;
        int i = 0;
        while (!exist && i < e.length)
        {
            if( e[i] == el)
            {
                exist = true;
            }
            else
            {
                i++;
            }
        }
        return exist;
    }

    public void add (int el)
    {
        if(this.contains(el))
        {
            throw new IllegalArgumentException(el + " is in the set!");
        }
        int[] a = new int[e.length + 1];
        for(int i = 0; i < e.length; i++)
        {
            a[i] = e[i];
        }
        a[a.length-1] = el;
        e = a; //byter referens av arrayen. a är den nya arrayn som innehåller en plats mer än e.
    }
    public void remove(int el)
    {
        if(!this.contains(el))
        {
            throw new IllegalArgumentException(el + " is not in the set!");
        }
        int [] a = new int[e.length - 1];
        /*int counter = 0;
        for(int i = 0; i < e.length; i++)
        {
            a[counter] = e[i];
            counter++;
        }*/

        int elPos = -1;
        int i = 0;
        while (elPos == -1)
        {
            if(e[i] == el)
            {
                elPos = i;
            }
            else
            {
                i++;
            }
        }

        for(int j = 0; j < elPos; j++)
        {
            a[j] = e[j];
        }
        for(int j = elPos+1; j < e.length; j++)
        {
            a[j-1] = e[j];
        }
        e = a;
    }
    public Set intersection (Set s)
    {
        Set intersect = new Set();
        for(int i = 0; i < e.length; i++)
        {
            if(s.contains(e[i]))
            {
                intersect.add(e[i]);
            }
        }
        return intersect;
    }
}