// Logik
/*
 - man skapar ett block i en kod genom att ha {} i ett program. variabler definierade i sån block
    är lokala och kan inte användas i hela programmet.
 -IF statements: IF, IF ELSE, IF- ELSE IF- ELSE IF-...-ELSE (koden körs i första if satsen som är true)
    (vi sätter inga ; efetr if satser)
-annat sätt att skriva en if sats visas i andra koden
- annat sätt är att använda switch med case 1,2,3,... (glöm inte ha break i slutet av varje case)
    (visas i logik2)
- while sats: visas i logik 3 (utförs inte nödvändigtvis)
    sätter inga ; efter while, om vi gör, kommer koden testa om och om igen villkoret inför parantesen
    framför while
- do while loop (utförs minst en gång)
- for loop ( en kompakt alternativ för while (skriver alla satser i en rad)) logik 4
- sätter en if sats i en for loop kommer den avbryta for loopet innan for loopet körs hela vägen ut
 */

 class Logik
 {
    public static void main(String[] args) throws Exception
    {
        java.util.Scanner in = new java.util.Scanner(System.in);
        in.useLocale(java.util.Locale.US);
        int n = 0 ; 
        {
            int n1 = in.nextInt();
            int n2 = in.nextInt();
            n = n1+n2;
            System.out.println(n);
        }
        System.out.println(n);
        in.close();
    }
 }

 class logik2
 {
    public static void main(String[] args){
        java.util.Scanner in = new java.util.Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int max = 0 ;
        /*
         if (m>n)
            max = m
        else
            max = n
         */
        max = (m>n) ? m:n ;
        int k = 2+ ((m>n)? m:n);

        int a = 2;
        switch(a)
        {
            case 1: // 'character' "sträng" istället för 1
            System.out.println("one");
            break;

            case 2:
            System.out.println("two");
            break;

            case 3:
            System.out.println("Three");
            break;

            default :
            System.out.println("not 1 2 3");
            break;
        }
        in.close();
    }
 }
 class logik3
 {
    public static void main(String[] args){
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();
        while(n>=0)
        {
            System.out.println(Math.sqrt(n));
            n--;

        }
        System.out.println("END");
        in.close();
    }

}

class logik4
{
   public static void main(String[] args){
       //1
       for (int n = 1; n<=4; n++) // n är lokalt och kan inte användas utanför loopet
       {
        System.out.println(n);
       }
       //eller
       //2
       int k = 1;
       for( ; k<=5; )
       {
        System.out.println(k);
        k++;
       }
       //3
       int i = 0;
       for(; i<4; i++)
       {
        System.out.println(i);
        // printar 0,1,2,3. men inte 4, dock i har värdet 4 och om vi vill använda i sen måste vi 
        //återskapa den. detta gäller för ej lokala variabler.(3)
       }
   }

}