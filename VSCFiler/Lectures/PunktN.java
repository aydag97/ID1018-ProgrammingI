// metoder som vi arver kan omdesignas.
public class PunktN extends Punkt
{
    //private double x;
    //private double y; //x och y behövs ej pga att klassen PunktN "extends Punkt".
    private String name;

    public PunktN (String name, double x, double y)
    {
       // this.x = x;
        // this.y = y;
        super(x, y); // måste definieras först och inte i andra hand.
        this.name = name;
    }

    public PunktN (String nameandcoord)
    {
        String[] ord = nameandcoord.split("\\s");
        this.name = ord[0];
        double x = Double.parseDouble(ord[1]); //x och y är nu lokala variabler och har inget att göra med x och y i superklassen
        double y = Double.parseDouble(ord[2]);
        this.setX(x); //x i rad 20
        this.setY(y); //y i rad 21
    }

    public String toString()
    {
        String s = "";

        s = name + " " + super.toString();

        return s;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    
    public int compareTo (PunktN p)
    {
        return this.name.compareTo(p.name); //returnerar negativ värde om this.name är mindre, 0 om lika, pos om p mindre
    }
}
