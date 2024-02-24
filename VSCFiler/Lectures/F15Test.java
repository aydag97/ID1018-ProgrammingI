import java.util.*;
import static java.lang.System.*;
class SetTest
{
    public static void main(String[] args)
    {
        Set s0 = new Set();
        int[] a = {1,2,3,4};
        Set s = new Set(a);
        out.println(s0);
        out.println(s);
        out.println();

        Set s1 = new Set(s);
        out.println(s1);
        out.println();

        out.println(s.countElements());
        out.println();

        int [] elements = s.getElements();
        out.println(Arrays.toString(elements));
        out.println();
        out.println(s.contains(3)); //returnerar true. då 3 finns i s.
        out.println();

        s.add(5);
        //s.add(3); //throws IllegalArgumentException
        out.println(s);
        out.println();

        out.println();
        //s.remove(33);
        s.remove(3);
        out.println(s);
        out.println();

        int [] a2 = {2,9,4,7};
        Set s2 = new Set(a2);
        Set intersection = s.intersection(s2);
        out.println(intersection); 
    }
}