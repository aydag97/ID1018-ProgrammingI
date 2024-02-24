//nested class??
// iterator klass?

class List 
{
    private static class Node
    {
        public int value;
        public Node next; //pekare till node i Node

        public Node (int value)
        {
            this.value = value;
            this.next = null; //bild finns i mobilen
        }

    }
    private Node first;

    public List (int[] values)
    {
        if (values.length == 0)
        {
            first = null; //skapar en tom lista
        }
        else
        {
            Node n = new Node(values[0]);
            first = n;
            for (int i = 1; i < values.length; i++)
            {
                n.next = new Node(values[i]); //pekaren till en node pekar mot nästa node
                n = n.next; //flyttar pekaren n till nästa node
            }
        }
    }
    public String toString()
    {
        String s = "{";
        if (first != null);
        {
            Node n = first;
            while (n.next != null) // går till näst sista noden
            {
                s += n.value + ", ";
                n = n.next;
            }
            s += n; //adderar sista noden utan komma tecken osv.
        }
        s+="}";
        return s;
    }
    public int size ()
    {
        int nofElements = 0;
        Node n = first;
        while(n != null)
        {
            nofElements++;
            n = n.next;
        }

        return nofElements;
    }
    public int get (int index)
    {
        if(index <0 || index >= this.size())
        {
            throw new IndexOutOfBoundsException("Wrong Index "+ index);
        }
        Node n = first;
        for(int i = 0; i < index; i++)
        {
            n = n.next;
        }
        return n.value;
    }
    public int indexOf(int value)
    {
        int index = -1;
        Node n = first;
        int i = 0;
        while(index == -1 && n != null) //så länge vi inte hittat index och n är inte null
        {
            if(n.value == value)
            {
                index = i;
            }
            else
            {
                n = n.next;
                i++;
            }
        }

        return index;
    }
    public void add (int value)
    {
        Node node = new Node(value);
        if(first == null)
        {
            first = node;
        }
        else
        {
            Node n = first;
            while( n.next != null)
            {
                n = n.next;
            }
            n.next = node;
        }
    }
    public void insert(int index, int value)
    {
        if(index <0 || index >= this.size())
        {
            throw new IndexOutOfBoundsException("Wrong Index: "+ index);
        }

        Node node = new Node(value);
        if (index == 0)
        {
            node.next = first;
            first = node;
        }
        else
        {
            Node n = first;
            for (int i = 0; i < index-1; i++)
            {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }
    
}
