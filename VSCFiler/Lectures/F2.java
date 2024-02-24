// Lagra Data

/***********************************************************************************
-skapar ett variabel, sparas i ett minne med ett namn på variablet. först n = 12 och k = n*n= 144
om vi ändrar på n dvs n = 25 då k tar in gamla n värde och n har sitt nya värde.

-kan göra en variabelkopiering: int j = n

-man kan skapa variabel först och ge värdet senare i koden. (u)

-två variabler kan skapas i samma rad (p,q)
 ***********************************************************************************/

class Demo
{
    public static void main (String[] args)
    {
        int n = 12;
        int k = n*n;
        n = 25;
        int j = n;
        int u;
        u = 55;
        int p = 2 , q = 3;

        System.out.println(n);
        System.out.println(k);
        System.out.println(j);
        System.out.println(p);
        System.out.println(q);
        System.out.println(u);
    }
}


/***********************************************************************************
 int kan spara numeriska inom ett visst intervall, inte mer eller mindre. Intervallet visas i koden
 nedan (Demo2)

 summan av två stora hel tal inom intervallet(tex max value + max value)kan ligga utanför intervallet 
 (svaret blir ett negativt tal)

 - final int bestämmer ett konstant och kan inte ändras i hela programmet
 ***********************************************************************************/

class Demo2
{
    public static void main (String[] args)
    {
        
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        final int number_of_students = 400;
        //number_of_students = 50;
        System.out.println(number_of_students);

     
    }
}

/**********************************************************************************
 finns 8 primitiva data typer i java
 1. "int" sparar 4 byte
 
 2. "long" :sparar större tal än int (8 byte). (EX: long n = 21480000000L, om vi inte skriver L och siffran 
     är större än max värdet i int intervall, då får vi error för när det gäller long, 
     java försöker omvandla värdet till int först och sen till long)
    -men det finns ett intervall även i "long" (klassen heter Long.MAX_VALUE och Long.MIN_VALUE)

3. "short": sparar mindre tal (sparar 2 byte)
    -men det finns ett intervall även i "short" (klassen heter Short.MAX_VALUE och Short.MIN_VALUE)

4. "byte" : sparar 1 byte

5. "double" : lagrar större decimala tal (8 byte)

6. "float" : lagrar mindre decimala tal (4 byte) (EX:float n = 10.5F, vi måste skriva F
     java försöker omvandla värdet till double först och sen till float)
     - 1.25 = 125*(10)^(-2) = 125E(-2)

     -omvandling från float till long: float sparar 4 byte och long 8 byte men float sparar större tal
     än long (long tillhör float). (EX: float n = 123456789F; \n long k = (long) n;)
    
     - andra omvandlingar exempel:
     int n = 12;
     long n1 = n; (stämmer)
     double n2 = n; (stämmer)

     int n = 12;
     short n1 = n; (stämmer ej, då short är mindre än int)
     short n2 = (short) n; (stämmer)

7. "boolean" : lagrar true eller false

8. "char": sparar text (char c = 65; = A. om ma lagrar en siffra i char variabel så omvandlas den till
    unit code (65= A))

    - vilket ställe ligger varje tecken?
    svar: EX: plats för tecknet *: System.out.println((int)'*')


    frö att ha en tecken mitt i en sträng använd \ innan tecknet
 **********************************************************************************/