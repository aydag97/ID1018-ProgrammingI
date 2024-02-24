/*
 1. java.util.Scanner är en inmatnings bibliotek i java. inmatningsdatan kan läsas mha olika metoder i 
 denna klass(Scanner); nämligen nextLine (för att läsa text), nextInt (för att läsa integer), nextDouble
 (för att läsa double), next(läser in bara första ordet i inmatningen)

 2. Scanner kan inte ta emot enskilda tecken

 3. för att kunna mata in tecken, används biblioteket java.io.InputStreamReader. metoden "read" i denna
 klass tar emot tecken och returnerar dess Unicode (returnerar int).

 4. man kan mata in flera tecken men metoden "read" läser in bara första tecknet, de andra kommer
 läggas till en kö och väntar på nästa inmatningstillfället, där det första tecknet igen läsas in.

 5. genom att ropa metoden read (in.read();) kan  man rensa inmatningskön från skräptecknen som hindrar
 programmet att vänta för inmatningen från användaren.

 6. metoden useDelimiter i Scanner, skiljer efter ett tecken. (in.useDelimiter("[|]"))
 */
import java.util.*;
import static java.lang.System.out;

 class Name
 {
    public static void main(String[] args)
    {   
        Scanner userName = new Scanner(System.in);
        out.println("Ange ditt förnamn, efternamn, ålder, ort:");
        
        userName.useDelimiter("[|]");
        //nånting inte fungerar med split?! funkar ej med | och . (varför behövs , i slutet av inmatning?)
        String foreName = userName.next();
        String sureName = userName.next();
        String age = userName.next();
        String city = userName.next();
        userName.nextLine();
        
        out.println("Ditt efternamn: " + sureName);
        out.println("Ditt Förnamn: " + foreName);
        out.println("Din ålder: " + age);
        out.println("Din stad: " + city);
        
        
        userName.close(); //varför behöver man stänga?
    }
 }

class Test
{
    public static void main(String[] args)
    {
        Scanner str = new Scanner("Hello,this,is|my/test/!/");
        str.useDelimiter(",");
        while(str.hasNext())
        {
            out.println(str.next());
        }
        str.close();
    }
}
// konstigt med vissa tecken | . 