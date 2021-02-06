package Exercise;

public class Test01_0 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();
        ListNode l3;

        l1.insertLast(3);
        l1.insertLast(4);
        l1.insertLast(9);

        l2.insertLast(4);
        l2.insertLast(6);
        l2.insertLast(5);
        l2.insertLast(1);

        l1.displayList();
        l2.displayList();

        l3 = addTwoNumbers(l1, l2);
        l3.displayList();

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        LinkX current1 = null;
        LinkX current2 = null;
        int temp;
        boolean condition = false;
        current1 = l1.LinkF();
        current2 = l2.LinkF();


        while(current1 != null && current2 != null)
        {
            if(condition)
            {
                temp = current1.iData + current2.iData + 1;
                condition = false;
            }
            else
            {
                temp = current1.iData + current2.iData;
            }

            if(temp >= 10)
            {
                temp = temp % 10;
                condition = true;
            }

            l3.insertLast(temp);

            current1 = current1.next;
            current2 = current2.next;
        }

        if(condition && current1 == null && current2 == null)
        {
            l3.insertLast(1);
        }

        while(current1 != null)
        {
        	if(condition == true)
        	{
        		current1.iData++;
        		condition = false;
        	}
            l3.insertLast(current1.iData);
            current1 = current1.next;
        }

        while(current2 != null)
        {
        	if(condition == true)
        	{
        		current2.iData++;
        		condition = false;
        	}
            l3.insertLast(current2.iData);
            current2 = current2.next;
        }

        return l3;
    }
}

class LinkX{
    public int iData;
    public LinkX next;

    public LinkX(int a)
    {
        iData = a;
    }

    public void displayLink()
    {
        System.out.print(iData + " ");
    }
}

class ListNode{
    private LinkX first;
    private LinkX last;

    public ListNode()
    {
        first = null;
        last = null;
    }

    public boolean isEmpty()
    {
        return (first == null);
    }


    public void insertLast(int a)
    {
        LinkX newLink = new LinkX(a);
        if(isEmpty())
        {
            first = newLink;
        }
        else
        {
            last.next = newLink;
        }
        last = newLink;
    }

    public LinkX LinkF()
    {
        return first;
    }


    public void displayList()
    {
        LinkX current = first;

        while(current != null)
        {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }
}
