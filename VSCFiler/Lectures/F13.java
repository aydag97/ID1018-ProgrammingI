import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 - Insättningssortering (insertion sort) : element är viktigt och inte positionen
    b(n) = n-1 (jämförelse) (b(n) tillhör theta(n))
    w(n) = (n*(n-1))/2 (w(n) tillhör theta(n^2))
    man använder denna sortmetod när man vet att datamängden är nästan sorterad.(det blir bästa val)
    
    pseudokod:
    
    sort(n, e[1], e[2], e[3], ..., e[n])
    {
        for i = 2,3,...,n
        {
            e = e[i]
            h = i
            while h > 1 and e < <e[h-1]
            {
                e[h] = e[h-1]
                h = h-1
            }
            e[h] = e
        }
    }

 - Input och Output
    DataOutputStream
    BufferedOutputStream
    FileOutputStream
 
 */


class Demo
{
    public static void main(String[] args)
    {
        String fil = "fil.dat";
        try
        {
            FileOutputStream fos = new FileOutputStream(fil);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            int n = 12;
           // fos.write(n);
            //fos.close();
            bos.write(n);
            bos.close();

            FileInputStream fis = new FileInputStream(fil);
            BufferedInputStream bis = new BufferedInputStream(fis);
            int n1 = bis.read();
           // int n1 = fis.read();
            System.out.println(n1);
            //fis.close();
            bis.close();
            
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}