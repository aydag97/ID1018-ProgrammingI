// HeltalsSekvens.java
// ett program som på olika sätt hanterar en sekvens med heltal��
class HeltalsSekvens
{
    public static void main (String[] args)
{
System.out.println("EN SEKVENS MED HELTAL\n\n");
// inmatningsverktyg
java.util.Scanner in = new java.util.Scanner(System.in);
in.useLocale(java.util.Locale.US);
        // mata in ett antal heltal
        final int[] u = new int[10 + 1];
        System.out.println("ange 10 heltal i en rad:");
        for (int i = 1; i < u.length; i++)
            u[i] = in.nextInt();
        System.out.println();
        // det minsta av heltalen och heltalens medelvärde�
        int min = u[1];
        int sum = u[1];
        
        for (int i = 2; i < u.length; i++)
        {
            if (u[i] < min)
                min = u[i];
            sum += u[i];
}
        double mean = (double) sum / (u.length - 1);
        // visa resultat
        System.out.println("minsta heltalet och heltalens medelv rde");
        System.out.printf("%4d  |  %7.2f\n\n\n", min, mean);
}
}

// HeltalsMatris.java
// ett program som p  olika s tt hanterar en heltalsmatris��
class HeltalsMatris
{
    public static void main (String[] args)
{
System.out.println("EN HELTALSMATRIS\n\n");
// inmatningsverktyg
java.util.Scanner in = new java.util.Scanner(System.in);
in.useLocale(java.util.Locale.US);
        // mata in ett antal heltal
        int[][] v = new int[3 + 1][4 + 1];
        System.out.println("ange 12 heltal, 4 heltal per rad:");
        for (int i = 1; i < v.length; i++)
            for (int j = 1; j < v[i].length; j++)
                v[i][j] = in.nextInt();
        System.out.println();
        // st rsta heltalet och heltalens medelv rde f r varje rad���
        int[] max = new int[v.length];
        double[] mean = new double[v.length];
        int sum = 0;
        for (int i = 1; i < v.length; i++)
        {
            max[i] = v[i][1];
            sum = v[i][1];
            for (int j = 2; j < v[i].length; j++)
            {
                if (v[i][j] > max[i])
                    max[i] = v[i][j];
                sum += v[i][j];
}
            mean[i] = (double) sum / (v[i].length - 1);
}
        // visa resultat
        System.out.println("de st rsta heltalen och medelv rden - radvis");
        for (int i = 1; i < v.length; i++)
            System.out.printf("%4d  |  %7.2f\n", max[i], mean[i]);
System.out.println();
}
}