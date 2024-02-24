/*
 Algoritmer:

 - uppdaterings algoritmer: tex hitta minsta/största värdet i en talsekvens.(method min)
    (algoritmen är oberoende av antalet element. behöver bara 2 platser för sin jämförelse)
 - pseudokod?
 - komplexitet:
    * Minneskomplexitetsfunktioner: m(n)=2 (m(n) tillhör theta(1))
    * Tidskomplexitetsfunktioner:   t(n)= n-1 (t(n) ungefär lika med n) (t(n) tillhör theta(n))
    * worst case comlpexity w(n)
    * best case complexity b(n)
    * average case complexity(?) a(n)
 - eliminerings algoritm : m(n)= [n/2] (avrundning uppåt) (m(n) tillhör theta(n)) 
    (algoritmen är beroende av antalet element i talsekvensen)
    tidskomplexitet: n = 2^k
                     t(n) = n/2 + n/4 + n/8 + ... + 4 + 2 + 1
                     t(k) = 2^k/2 + 2^k/4 + ...+ 4 + 2 + 1
                     t(k) = 2^(k-1) + 2^(k-2) + 2^(k-3) + ... + 4 + 2 + 1
                     t(k) = 2^(k) - 1/2-1
                     t(k) = 2^k - 1
                     t(n)= n-1
                     t(n) = theta(n)
 - algorithmer finns i canvas (urvalsalgoritm)
 



 */

class Algoritm
{
    public static int min(int[] e)
    {
        int m = 0; //m = index
        for(int i = 1; i<e.length; i++)
        {
            if(e[i]<e[m])
                m = i;
        }
        return m; //eller e[m] vilket ger själva värdet och inte positionen/index

    }
}