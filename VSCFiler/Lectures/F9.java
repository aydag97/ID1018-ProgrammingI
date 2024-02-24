/*
 Objects
 -class String
    man skapar en sträng på följande sätt: String s = "hello"
 - "new" konstruerar en objekt av en viss typ (rad 12)
 - deprecated?
 - instansmetoder : icke statisk metod, används i samband med en instans/objekt
 - statisk metod: när vi använder klassens namn.metodens namn (tex String.valueOf)
 - icke-statisk metod : när vi använder instansmetoder (tex s.charAt(2))
 - strängar är inmutable (de kan inte ändras så fort de skapas)
 - StringBuilder skapar mutable strängar som kan ändras

 */

class Objekt
{
    public static void main (String[] args)
    {
        String s = new String("abcd"); //"abcd" kallas för en objekt (av klassen String)/en instans
        String s1 = "hello";                    // annat sätt att skapa sträng
        String s2 = new String();               // skapar en tom sträng
        char[] a = {'a','b','c','d'};
        String s3 = new String(a);              // skapar en sträng av en char sekvens
        String s4 = new String(a,1,2); //börjar från index 1 och returnerar 2 char.
        String s5 = new String("+-*/");

        char c = s.charAt(2);            // returnerar char som finns i index 2
        int n = 12;
        String s6 = String.valueOf(n);          // returnerar n som en sträng(och inte int)
        int l1 = s1.length();                   // returnerar en integer som är längden av s1
        int i1 = s1.indexOf('o');           // returnerar integer som är index av efterfrågade char i strängen
        int i2 = s1.indexOf("he");         // returnerar 0 (index av "he")
        int i3 = s1.indexOf("HE");         // returnerar -1 då det inte finns sträng "HE" i s1
        int i4 = s1.lastIndexOf('l');       // returnerar den sista char index i en sträng
        String s7 = s1.substring(2); //returnerar strängen s1 från och med index 2
        String s8 = s1.substring(1, 3); //returnerar strängen s1 fr.o.m. index 1 till index 3
        String s9 = s1.substring(2,11); // error! s1 har t.o.m. index 4
        boolean b = s.equals(s1);               // returnerar true om s = s1, false annars
        String s10 = new String("Hello");
        boolean b1 = s1.equalsIgnoreCase(s10);  //returnerar true i detta fall
        int i5 = s1.compareTo(s10);             // returnerar 0 om s1 = s10, negativ om s1<s10, positiv om s1>s10
        int i6 = s1.compareToIgnoreCase(s2);    // returnerar 0 i detta fall, vilket betyder s1 är samma str som s10
        String s11 = new String("    abcde  ");
        String s12 = s11.trim();                // tar bort mellanslag i s11
        String s13 = new String("1, 2, 3, 4");
        String[] v = s13.split("[,]");    // splittrar s13 efter ,. men det finns fortfarande mellanslag
        for(int i = 0; i<v.length; i++)
        {
            v[i] = v[i].trim();                 //tar bort mellanslag i v mellan siffror
        }
        String s14 = new String("abcd");
        String s15 = new String("abcd");
        // s15 != s14 om vi sätter den i if sats. de inneåller samma sträng men det ä två olika referenser
        // så i if(s14 == s15) returneras false
    }
}