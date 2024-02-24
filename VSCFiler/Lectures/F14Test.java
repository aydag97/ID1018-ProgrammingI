/*
 - varför definierar man private variabler? 
    * så att användaren inte manipulerar variabler i en klass (tex klassen scanner, om variabler var
        public skulle man kunna ändra på dem vilket är inte bra)
    * man döljer det man inte vill visa användaren och visar de som är nyttiga för användaren istället.
 */


import static java.lang.System.*;

class PunktTest
{
    public static void main(String[] args)
    {
        //Punkt p = new Punkt(); //här skapas en punkt med värdet (0,0)
        Punkt p = new Punkt(3, 4);
        out.println(p);
        out.println(p.getX());
        p.setX(33);
       /*  p.x = 3;
        p.y = 4;
        out.println(p.x);
        out.println(p.y);*/
        
        out.println();

        Punkt p1 = new Punkt(5, 6);
        out.println(p1);
        out.println(p1.getY());

        out.println();
        
        double d = p.avstand();
        out.println(d);
        out.println();
        
        double d1 = p1.avstand();
        out.println(d1);
        out.println();

        double dm = p.avstand(p1); //ps x och y blir this och p1 är argumentet vilket motsvrr p i metoden avstand
        out.println(dm);

        Punkt p2 = Punkt.slumpPunkt();
        out.println(p2);
        out.println();

        out.println(Punkt.ORIGO);
        out.println(Punkt.ORIGO.avstand(p2));
        out.println();

    }
}