/*
 kopierings konstruktör
 */

public class Punkt 
{
    public static final Punkt ORIGO = new Punkt(); //en fördefinierade referens som pekar mot origo

    private double x; // kallas för instans variabler. normalt definieras dessa som private
    private double y;
    /*Punkt (double xkoord, double ykoord) //returnerar ingenting. kallas för default constructor
    {
        x = xkoord;
        y = ykoord;
    }*/
    public Punkt ()
    {
        this.x = 0.0;
        this.y = 0.0;
    }
    public Punkt (double x, double y)
    {
        this.x = x; //this betyder det som är nu i objektet
        this.y = y;
    }
    public Punkt(Punkt p)
    {
        this.x = p.x;
        this.y = p.y;
    }
    public double getX()
    {
        return this.x;
    }
    public double getY()
    {
        return this.y;
    }
    public void setX(double x)
    {
        this.x = x;
    }
    public void setY(double y)
    {
        this.y = y;
    }
    public String toString()
    {
        String s = "";
        s = "(" + x + "," + y + ")";
        return s;
    }
    public double avstand ()
    {
        double d = Math.sqrt(this.x*this.x + this.y*this.y);
        return d;
    }
    public double avstand (Punkt p)
    {
        double d = Math.sqrt((p.x - this.x)*(p.x - this.x) + (p.y - this.y)*(p.y - this.y));
        return d;
    }
    public static Punkt slumpPunkt()
    {
        double x = Math.random();
        double y = Math.random();
        Punkt p = new Punkt(x, y);
        return p;
    }

}