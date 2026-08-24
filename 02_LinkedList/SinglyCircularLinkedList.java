class node
{
    public int data;
    public node next;

    // Initializes a new node with the specified data
    node(int iNo)
    {
        this.data = iNo;
        this.next = null;
    }    
}

class SinglyCL
{
    private node first;
    private node last;
    private int iCount;

    // Initializes an empty singly circular linked list
    public SinglyCL()
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

        do 
        {
            System.out.print("| " + temp.data + " | -> ");
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
            first = newn;
        }

        iCount++;

        last.next = first;
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
            last = newn;            
        }

        iCount++;

        last.next = first;
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
            temp.next = newn;

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
            last.next = last.next.next;
        }

        iCount--;

        last.next = first;
    }

    // Deletes the last node from the circular linked list
    public void DeleteLast()
    {
        node temp = first;

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
            while(temp.next != last)
            {
                temp = temp.next;
            }

            temp.next = null;
            last = temp;            
        }

        iCount--;

        last.next = first;        
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

            iCount--;
        }        
    }
}

class SinglyCircularLinkedList
{
    // Entry point of the application
    public static void main(String A[])
    {
        SinglyCL sobj = new SinglyCL();
        int iRet = 0;

        System.out.println();

        sobj.InsertFirst(51);
        sobj.InsertFirst(21);
        sobj.InsertFirst(11);

        sobj.Display();
        iRet = sobj.Count();
        System.out.println("Number of Nodes are : " + iRet);

        System.out.println();

        sobj.InsertLast(101);
        sobj.InsertLast(111);
        sobj.InsertLast(121);

        sobj.Display();
        iRet = sobj.Count();
        System.out.println("Number of Nodes are : " + iRet);

        System.out.println();

        sobj.InsertAtPos(105, 4);

        sobj.Display();
        iRet = sobj.Count();
        System.out.println("Number of Nodes are : " + iRet);

        System.out.println();

        sobj.DeleteFirst();

        sobj.Display();
        iRet = sobj.Count();
        System.out.println("Number of Nodes are : " + iRet);

        System.out.println();
        
        sobj.DeleteLast();

        sobj.Display();
        iRet = sobj.Count();
        System.out.println("Number of Nodes are : " + iRet);

        System.out.println();

        sobj.DeleteAtPos(4);

        sobj.Display();
        iRet = sobj.Count();
        System.out.println("Number of Nodes are : " + iRet);

        System.out.println();
    }
}