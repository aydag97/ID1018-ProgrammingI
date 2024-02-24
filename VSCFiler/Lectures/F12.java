/*
 exception
 - skriver en try catch statement för att hantera exceptions
 - om inga error hittas i try block så programmet körs vidare som vanligt
 - om finns error i try block, så programmet stannar och går till catch block och körs vidare.
 - läs igenom class Exception i API
 - man kan ha flera catch statement. men om vi vill hamer specifika exception ska vi skriva in dem först
    och allt annat sen.

 */

import static java.lang.System.*;
import java.util.*;

class FelHantering
{
    public static void main(String[] args) 
    { 
        char[] a = {'a', 'b', 'c', 'd', 'e'};
        out.println(a);
    try
    {    
        //Arrays.fill(a,'x'); //fyller i hela a med x
        Vektorer.fill(a, 1,30,'x'); //fyller i a med x från index 1 till 3
        //Arrays.fill(a, 1, 40, 'x'); // Error! 
        Vektorer.fill(a,10,3,'x'); //Fel!
    }
    /* 
    catch( ArrayIndexOutOfBoundsException e)
    {
        out.println("Error");
    }
    catch(IllegalArgumentException e)
    {
        //out.println(e.toString());
        //out.println(e);
        //e.printStackTrace(); //printar ut förklaringen till felet(inbyggd error hantering)
        //out.println("Fel");
        out.println(e.getMessage());
    }*/
    /*catch(ArrayIndexOutOfBoundsException | IllegalArgumentException e)
    {
        out.println(e);
    }*/
    /*catch(RuntimeException e)
    {
        out.println(e);
    }*/
    catch(Exception e)
    {
        out.println(e);
    }
    out.println("\nend");


    }
}

class Vektorer
{
    public static void fill (char[] a, int fromIndex, int toIndex, char c) throws ArrayIndexOutOfBoundsException,
    IllegalArgumentException
    {
        if(fromIndex < 0 || toIndex>a.length)
        {
            /*ArrayIndexOutOfBoundsException e = new ArrayIndexOutOfBoundsException("index out of range");
            throw e;*/
            throw new ArrayIndexOutOfBoundsException("index out of range");
        }
        if(fromIndex>toIndex)
        {
            throw new IllegalArgumentException("Wrong index");
        }
        for(int i = fromIndex; i<toIndex; i++)
        {
            a[i] = c;

        }
    }
}

class HelloWorld {
    public static void main( String args[] ) {
        String first = "Hello"; 
        String second = "World";

        //String third = first + second;
       // System.out.println(third);

        // yet another way to concatenate strings
        first += second;
        System.out.println(first);        
    }
}