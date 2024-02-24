/*
 - javax swing
 - jbutton
 */
import static java.lang.System.*;

class PunktTest
{
    public static void main (String[] args)
    {
        PunktN pn = new PunktN("A", 3, 4);
        out.println(pn.toString());
        out.println();

        out.println(pn.getX());
        out.println(pn.avstand());
        out.println();

        out.println(pn.getName());
        out.println();

        pn.setName("A1");
        out.println(pn);
        out.println();

        PunktN pn1 = new PunktN("B", 1, 2);
        out.println(pn1.compareTo(pn)); //pos värde då pn är mindre än pn1. pn1 är aktuella objekt pch pn argument
        out.println();

        PunktN pn2 = new PunktN("C  5  6");
        out.println(pn2);
        out.println();


    }
}