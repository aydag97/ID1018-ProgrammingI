import static java.lang.System.out;
//Vektorer
/*
 - new?
 - int[] v = new int[4] skapas en plats för 4 integers.
 - referenser?
 - definiera värden i en vektor: int[] v = {v0,v1,v2,v3};
 - out.println(v) kommer inte funka för att printa ut en vektor, utan man måste göra det elementvis.
 - det enda vektor som kan printas ut på det sättet är en vektor vars element är char. (u = {'a', 'b', '+' ,'-'})
 - referenser är oberoende av vektorer. två ref kan peka mot samma vektor. dvs vektorn har två address.
    int[] u = {1,2,3,4}
    int[] v = u (ej kopiering av vektor utan ref kopiering)
    out.println(v[0]) = out.println(u[0]) = 1
 - garbage collector?
 - for (int n , v)
    out.print(n)

 - vektor kopiering: skapar en referns med samma längd av första vektorn, skriver en for loop för att kopiera alla element från första
 vektorn till kopieringen
    int[] u = {1,2,3,4}
    int [] v = new int[u.length]
    for (int i = 0; i<u.length; i++)
        v[i] = u[i]

 - för att skapa en två dim vektor: 
    int[][] v = neew int[4][3] (en 4x3 matris (4 rader och 3 kolomner))

 - v.length = 4
    v[0].length = 3
 alt.
 - int [][] v = {{5,10,15},
                 {0,0,0},
                 {2,4,6},
                 {3,0,8}}
 - varje rad påpekar mot en vektor vilket inte behöver ha samma längd nödvändigtvis. 
 int [][] u = {{5,10,15},
                 {0,0},
                 {2,4,6,7,9},
                 {3,0,8}}
    för att skriva en sån vektor:
    int [][] a = new int[4][]
    a[0] = new int[3]
    a[1] = new int[2]
    ....
-for loop:
    for(int i = 0;i<v.length; i++) (i radindex)
       { for(int j = 0; j< v[i].length; j++) (j kolomnindex)
            out.println(v[i][j] + " ")
        out.println("")
       }

- for (int[] u : v)
       for(int n :u)
            out.println(n)
       out.println(" ")

 */
class Vector
 {
    public static void main(String[] args) throws Exception
    {
        int[] v = {4,7,2,9};

        // längden av v:
        int l = v.length;
        out.println(l);
        // sista element i vektorn
        out.println(v[l-1]);

        // skriva ut vektorns element

        for (int i = 0; i<l; i++)
            out.println(v[i] + " ");

        out.println("");

 }
}

class Vector1
 {
    public static void main(String[] args) throws Exception
    {
        double[] d = new double[5];

        //fylla i vektorn

        /*for (int j = 0; j<d.length; j++)
            d[j] = 2*j + 0.5;

        for(int i=0; i<d.length; i++)
            out.println(d[i]);      */
         for (int i = 0; i < d.length; i++)
         {
            out.print(d[i] + " ");
         }

 }
}