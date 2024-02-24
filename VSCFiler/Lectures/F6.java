// Methods

/* 
 - main är huvud metoden, dvs programmet börjar med det. man kan ropa andra metoder i main. programmet då
 går till anropade metoden och tillbaka till main.

 - initiala parametrar, metods parametrar och alla variabler definierade i en metod är lokala och kan inte 
 användas överallt.
 - void? (betyder att inget returneras. ) (public static int kvadrat() returnerar en integer)
 - method overloading? ( när två metod heter samma men har olika parameterlista)

 - en alt. för att skriva en jämförelse i if:
    public static int max(int n1, int n2)
    {
        return (n1>n2)? n1:n2; // jämför n1 är större än n2, returnera n1 annars returnera n2.
    }
 - största värde mellan 3 olika int?
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
    int m = max(max(a,b) , c);

 - definiera globala variabler? 
    public static final int PI = 3.1415; ( namnet kan inte ändras eller peka till annat och definieras utanför metoder och inom klassen) 
*/

class Metod
{
    public static void main(String[] args)
    {
        int n = 25;
        print(n, '-');
        n = 46;
        print(n, '*');
        n = 13;
        print(n, '-');


    }
    
    public static void print (int x, char c) //int x och char c heter parameter lista.(int= typ, x= namn)
    {
        int kv = kvadrat(x); // här heter x för "argument". fler? kallas argumentlista
        //System.out.println(x + ": " + x*x);
        System.out.println(x + ", " + kv);
        //System.out.println("----------");
        for (int i = 0; i<8; i++)
            System.out.print(c); //?
            
        System.out.println();
    }

    public static int kvadrat (int number)
    {
        int k = number*number;
        return k;
    }

    public static double avg(int[] n)
    {
        int s = 0;
        for (int i = 0; i<n.length; i++)
            s += n[i];

        double a = (double) s/n.length;
        return a;

    }
}