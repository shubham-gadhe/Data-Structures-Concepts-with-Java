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

class SinglyLL
{
    private node first; 
    private int iCount;

    // Initializes an empty singly linear linked list
    public SinglyLL()
    {
        this.first = null;
        this.iCount = 0;
    }

    // Displays all elements of the linked list
    public void Display()
    {
        node temp = first;

        while(temp != null)
        {
            System.out.print("| " + temp.data + " | -> ");
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
            first = newn;
        }

        iCount++;

    }

    // Inserts a new node at the end of the linked list
    public void InsertLasts(int iNo)
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
            InsertLasts(iNo);
        }
        else 
        {
            for(i = 1; i < iPos; i++)
            {
                temp = temp.next;
            }

            newn.next = temp.next;
            temp.next = newn;

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
            
            iCount--;
        }        
    }    
}

class SinglyLinearLinkedList
{
    // Entry point of the application
    public static void main(String A[])
    {
        int iRet = 0;

        SinglyLL sobj = new SinglyLL();

        System.out.println();
        
        sobj.InsertFirst(51);
        sobj.InsertFirst(21);
        sobj.InsertFirst(11);

        sobj.Display();
        iRet = sobj.Count();
        System.out.println("Number of nodes are : " + iRet);

        System.out.println();

        sobj.InsertLasts(101);
        sobj.InsertLasts(111);
        sobj.InsertLasts(121);

        sobj.Display();
        iRet = sobj.Count();
        System.out.println("Number of nodes are : " + iRet);

        System.out.println();

        sobj.InsertAtPos(105, 4);

        sobj.Display();
        iRet = sobj.Count();
        System.out.println("Number of nodes are : " + iRet);

        System.out.println();

        sobj.DeleteFirst();

        sobj.Display();
        iRet = sobj.Count();
        System.out.println("Number of nodes are : " + iRet);

        System.out.println();

        sobj.DeleteLast();

        sobj.Display();
        iRet = sobj.Count();
        System.out.println("Number of nodes are : " + iRet);

        System.out.println();

        sobj.DeleteAtPos(4);

        sobj.Display();
        iRet = sobj.Count();
        System.out.println("Number of nodes are : " + iRet);

        System.out.println();     
    }
}