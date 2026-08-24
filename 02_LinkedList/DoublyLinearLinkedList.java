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

class DoublyLL
{
    private node first;
    private int iCount;

    // Initializes an empty doubly linear linked list
    public DoublyLL()
    {
        this.first = null;
        this.iCount = 0;
    }

    // Displays all elements of the doubly linked list
    public void Display()
    {
        node temp = first;

        if(first == null)
        {
            return;
        }

        System.out.print("null <=> ");
        while(temp != null)
        {
            System.out.print("| " + temp.data + " | <=> ");
            temp = temp.next;
        }

        System.out.println("null");

    }

    // Returns the total number of nodes in the linked list
    public int Count()
    {
        return iCount;
    }

    // Inserts a new node at the beginning of the linked list
    public void InsertFirst(int iNo)
    {
        node newn = new node(iNo);

        if(first == null)
        {
            first = newn;
        }
        else
        {
            newn.next = first;
            first.prev = newn;

            first = newn;
            newn.prev = first;
        }

        iCount++;
    }

    // Inserts a new node at the end of the linked list
    public void InsertLast(int iNo)
    {
        node newn = new node(iNo);
        node temp = first;

        if(first == null)
        {
            first = newn;
        }
        else
        {
            while(temp.next != null)
            {
                temp = temp.next;
            }

            temp.next = newn;
            newn.prev = temp;            
        }

        iCount++;
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

    // Deletes the first node from the linked list
    public void DeleteFirst()
    {
        if(first == null)
        {
            return;
        }
        else if(first.next == null)
        {
            first = null;
        }
        else 
        {
            first = first.next;
            first.prev = null;
        }

        iCount--;        
    }

    // Deletes the last node from the linked list
    public void DeleteLast()
    {
        node temp = first;

        if(first == null)
        {
            return;
        }
        else if(first.next == null)
        {
            first = null;
        }
        else 
        {
            while(temp.next.next != null)
            {
                temp = temp.next;
            }

            temp.next.prev = null;
            temp.next = null;
        }

        iCount--;         
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

class DoublyLinearLinkedList
{
    // Entry point of the application
    public static void main(String A[])
    {
        DoublyLL dobj = new DoublyLL();
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