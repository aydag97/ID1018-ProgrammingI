//övning 1

import java.util.*;

class Exercise1
{
    public static void main(String[] args)
    {
        //Definierar integers och utför en enkel kalkylator
        int a = 5;
        int b = 60;
        int addition = a + b;
        int substraction = a - b;
        int product = a * b;
        int division = b/a;
        int rest = b % a;
        System.out.println("Addition: " + addition);
        System.out.println("Substraction: " + substraction);
        System.out.println("Product: " + product);
        System.out.println("Division: " + division);
        System.out.println("Rest: " + rest);
        
    }

}


// övning 2

// Kostnad.java
// ett program som utf r en enkel ber kning��
/**********************************************************************
Det h r programmet ber knar kostnaden f r ett antal likadana b cker.����
B de antalet och pris p  b ckerna matas in fr n standardinmatnings-����
enheten. Resultatet skrivs ut till standardutmatningsenheten.
**********************************************************************/
class Kostnad
{
    public static void main (String[] args)
{
        System.out.println("KOSTNAD");
        System.out.println();
        // inmatningsverktyg
        java.util.Scanner in = new java.util.Scanner(System.in);
        in.useLocale(java.util.Locale.US);
        // mata in uppgifter om antalet b cker och deras pris�
        System.out.print("Antalet bocker: ");
        int antal = in.nextInt();
        System.out.print("Pris pa bockerna: ");
        double pris = in.nextDouble();
        // ber kna den totala kostnaden�
        double kostnad = antal * pris;
        // visa resultatet
        System.out.println("Den totala kostnaden: " + kostnad);

        in.close();

}
}
/*----------------------------------------------------------------------
Programmets input och output vid en exekvering
KOSTNAD
Antalet bocker: 25
Pris pa bockerna: 50
Den totala kostnaden: 1250.0
Programmets input och output vid en annan exekvering
KOSTNAD
Antalet bocker: 47
Pris pa bockerna: 230
Den totala kostnaden: 10810.0
----------------------------------------------------------------------*/

class Avgift
{
    public static void main(String[] args)
    {
        Scanner person_no = new Scanner(System.in);
        Scanner person_inkomst = new Scanner(System.in);
        Scanner person_avgift = new Scanner(System.in);

        System.out.println("Ange antalet personer i hushåll: ");
        int antal = person_no.nextInt();

        System.out.println("Ange totala inkomsten per månad: ");
        double inkomst = person_inkomst.nextDouble();

        System.out.println("Ange totala avgifter per månad: ");
        double avgift = person_avgift.nextDouble();

        double substraction = inkomst - avgift;
        double kvar_per_person = substraction/antal;
        double rest = substraction%antal;

        System.out.println("Kvarvarande belopp per person i hushållet: " + kvar_per_person + " kr");
        System.out.println("Kvarvarande belopp efter indelningen: " + rest + " kr");
        
        person_no.close();
        person_avgift.close();
        person_inkomst.close();
    }
}

// PersonligaUppgifter.java
// ett program som hanterar personliga uppgifter
/**********************************************************************
Anv ndaren matar in sina personliga uppgifter. Dessa uppgifter sparas�
sedan i en fil.
**********************************************************************/
class PersonligaUppgifter
{
    public static void main (String[] args)
                           throws Exception    // (1)
{
        System.out.println("PERSONLIGA UPPGIFTER");
        System.out.println();
        // inmatningsverktyg
        java.util.Scanner in = new java.util.Scanner(System.in);
        // mata in personliga uppgifter
        System.out.print("Fodelsear: ");
        int ar = in.nextInt();
           // in.nextLine();    // (2) //varför är det här viktigt?
        System.out.print("Ditt fornamn och efternamn: ");
        String namn = in.nextLine();
        System.out.println();
        // spara uppgifter i en fil
        java.io.PrintWriter fout = new java.io.PrintWriter("persUpp.txt");
        fout.println(namn + ": " + ar);
        fout.flush();
        // ett meddelande
        System.out.println("Oppna filen persUpp.txt!");
}
}