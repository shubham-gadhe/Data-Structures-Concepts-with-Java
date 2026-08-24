class node
{
    public int data;
    public node next;
    public node prev;

    // Initializes a new node with the specified data
    node(int iNo)
    {
        this.data = iNo;
        this.next = null;
        this.prev = null;
    }
}

class DoublyCL
{
    private node first;
    private node last;
    private int iCount;

    // Initializes an empty doubly circular linked list
    public DoublyCL()
    {
        this.first = null;
        this.last = null;
        this.iCount = 0;
    }

    // Displays all elements of the circular linked list
    public void Display()
    {
        node temp = first;

        if(first == null && last == null)
        {
            return;
        }

        System.out.print("<=>");

        do
        {
            System.out.print("| " + temp.data + " | <=> ");
            temp = temp.next;
        }while(temp != last.next);

        System.out.println();
    }

    // Returns the total number of nodes in the linked list
    public int Count()
    {
        return iCount;        
    }

    // Inserts a new node at the beginning of the circular linked list
    public void InsertFirst(int iNo)
    {
        node newn = new node(iNo);

        if(first == null && last == null)
        {
            first = newn;
            last = newn;
        }
        else
        {
            newn.next = first;
            first.prev = newn;

            first = newn;
            newn.prev = first;
        }

        iCount++;

        last.next = first;
        first.prev = last;

    }

    // Inserts a new node at the end of the circular linked list
    public void InsertLast(int iNo)
    {
        node newn = new node(iNo);

        if(first == null && last == null)
        {
            first = newn;
            last = newn;
        }
        else
        {
            last.next = newn;
            newn.prev = last;
            last = newn;
        }

        iCount++;

        last.next = first;
        first.prev = last;
        
    }

    // Inserts a new node at the specified position in the linked list
    public void InsertAtPos(int iNo, int iPos)
    {
        node newn = new node(iNo);
        node temp = first;
        int i = 0;
        
        if((iPos < 1) || (iPos > iCount + 1))
        {
            System.out.println("Invalid Position");
            return;
        }

        if(iPos == 1)
        {
            InsertFirst(iNo);
        }
        else if(iPos == iCount + 1)
        {
            InsertLast(iNo);
        }
        else 
        {
            for(i = 1; i < iPos - 1; i++)
            {
                temp = temp.next;
            }

            newn.next = temp.next;
            temp.next.prev = newn;

            temp.next = newn;
            newn.prev = temp;

            iCount++;
        }
    }

    // Deletes the first node from the circular linked list
    public void DeleteFirst()
    {
        if(first == null && last == null)
        {
            return;
        }
        else if(first == last)
        {
            first = null;
            last = null;
        }
        else 
        {
            first = first.next;
            first.prev = first.prev.prev;

            last.next = last.next.next;            
        }

        iCount--;

        last.next = first;
        first.prev = last;
    }

    // Deletes the last node from the circular linked list
    public void DeleteLast()
    {
        if(first == null && last == null)
        {
            return;
        }
        else if(first == last)
        {
            first = null;
            last = null;
        }
        else 
        {
            last = last.prev;
            last.next = last.next.next;
            
            first.prev = first.prev.prev;
        }

        iCount--;

        last.next = first;
        first.prev = last;
        
    }

    // Deletes the node at the specified position from the linked list
    public void DeleteAtPos(int iPos)
    {
        node temp = first;
        int i = 0;
        
        if((iPos < 1) || (iPos > iCount))
        {
            System.out.println("Invalid Position");
            return;
        }

        if(iPos == 1)
        {
            DeleteFirst();
        }
        else if(iPos == iCount)
        {
            DeleteLast();
        }
        else 
        {
            for(i = 1; i < iPos - 1; i++)
            {
                temp = temp.next;
            }

            temp.next = temp.next.next;
            temp.next.prev = temp;

            iCount--;
        }
    }
}

class DoublyCircularLinkedList
{
    // Entry point of the application
    public static void main(String A[])
    {
        DoublyCL dobj = new DoublyCL();
        int iRet = 0;

        System.out.println();

        dobj.InsertFirst(51);
        dobj.InsertFirst(21);
        dobj.InsertFirst(11);

        dobj.Display();
        iRet = dobj.Count();
        System.out.println("Number of Nodes are : " + iRet);

        System.out.println();

        dobj.InsertLast(101);
        dobj.InsertLast(111);
        dobj.InsertLast(121);

        dobj.Display();
        iRet = dobj.Count();
        System.out.println("Number of Nodes are : " + iRet);

        System.out.println();

        dobj.InsertAtPos(105, 4);

        dobj.Display();
        iRet = dobj.Count();
        System.out.println("Number of Nodes are : " + iRet);

        System.out.println();

        dobj.DeleteFirst();

        dobj.Display();
        iRet = dobj.Count();
        System.out.println("Number of Nodes are : " + iRet);

        System.out.println();

        dobj.DeleteLast();

        dobj.Display();
        iRet = dobj.Count();
        System.out.println("Number of Nodes are : " + iRet);

        System.out.println();

        dobj.DeleteAtPos(4);

        dobj.Display();
        iRet = dobj.Count();
        System.out.println("Number of Nodes are : " + iRet);

        System.out.println();
    }
}