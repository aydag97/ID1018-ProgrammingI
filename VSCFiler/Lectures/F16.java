import static java.lang.System.out;

class ListTest
{
    public static void main(String[] args)
    {
        int[] a = {1, 2, 3, 4};
        List list = new List(a);
        out.println(list);
        out.println();
        out.println(list.size());
        out.println();
        out.println(list.get(2));
        out.println();
        out.println(list.indexOf(3));
        out.println();

        list.add(5);
        out.println(list);
        out.println();

        list.insert(3,33);
        out.println(list);

        

    }
}