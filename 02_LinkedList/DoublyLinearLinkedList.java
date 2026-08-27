//////////////////////////////////////////////////////////////////
//
//  Class Name       : node
//
//  Description      : This class represents a node of a doubly
//                     linear linked list. It contains data and
//                     references to the next and previous nodes.
//
//  Author           : Shubham Somanath Gadhe
//  Date             : 09/08/2026
//
//////////////////////////////////////////////////////////////////

class node
{
    public int data;
    public node next;
    public node prev;

    //////////////////////////////////////////////////////////////////
    //
    //  Constructor Name : node()
    //
    //  Description      : It is used to initialise a new node
    //                     with the specified data.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 09/08/2026
    //
    //////////////////////////////////////////////////////////////////

    node(int iNo) 
    {
        this.data = iNo;
        this.next = null;
        this.prev = null;
    }    
}

//////////////////////////////////////////////////////////////////
//
//  Class Name       : DoublyLL
//
//  Description      : This class is used to implement a doubly
//                     linear linked list and provides operations
//                     such as insertion, deletion, display and
//                     counting of nodes.
//
//  Author           : Shubham Somanath Gadhe
//  Date             : 09/08/2026
//
//////////////////////////////////////////////////////////////////

class DoublyLL
{
    private node first;
    private int iCount;

    //////////////////////////////////////////////////////////////////
    //
    //  Constructor Name : DoublyLL()
    //
    //  Description      : It is used to initialise an empty
    //                     doubly linear linked list.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 09/08/2026
    //
    //////////////////////////////////////////////////////////////////

    public DoublyLL()
    {
        this.first = null;
        this.iCount = 0;
    }

    //////////////////////////////////////////////////////////////////
    //
    //  Method Name      : Display()
    //
    //  Description      : It is used to display all elements of
    //                     the doubly linked list.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 09/08/2026
    //
    //////////////////////////////////////////////////////////////////

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

    //////////////////////////////////////////////////////////////////
    //
    //  Method Name      : Count()
    //
    //  Description      : It is used to return the total number
    //                     of nodes present in the linked list.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 09/08/2026
    //
    //////////////////////////////////////////////////////////////////

    public int Count()
    {
        return iCount;
    }

    //////////////////////////////////////////////////////////////////
    //
    //  Method Name      : InsertFirst()
    //
    //  Description      : It is used to insert a new node at the
    //                     beginning of the linked list.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 09/08/2026
    //
    //////////////////////////////////////////////////////////////////

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

    //////////////////////////////////////////////////////////////////
    //
    //  Method Name      : InsertLast()
    //
    //  Description      : It is used to insert a new node at the
    //                     end of the linked list.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 09/08/2026
    //
    //////////////////////////////////////////////////////////////////

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

    //////////////////////////////////////////////////////////////////
    //
    //  Method Name      : InsertAtPos()
    //
    //  Description      : It is used to insert a new node at the
    //                     specified position in the linked list.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 09/08/2026
    //
    //////////////////////////////////////////////////////////////////

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

    //////////////////////////////////////////////////////////////////
    //
    //  Method Name      : DeleteFirst()
    //
    //  Description      : It is used to delete the first node
    //                     from the linked list.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 09/08/2026
    //
    //////////////////////////////////////////////////////////////////

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

    //////////////////////////////////////////////////////////////////
    //
    //  Method Name      : DeleteLast()
    //
    //  Description      : It is used to delete the last node
    //                     from the linked list.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 09/08/2026
    //
    //////////////////////////////////////////////////////////////////

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

    //////////////////////////////////////////////////////////////////
    //
    //  Method Name      : DeleteAtPos()
    //
    //  Description      : It is used to delete the node at the
    //                     specified position from the linked list.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 09/08/2026
    //
    //////////////////////////////////////////////////////////////////

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

//////////////////////////////////////////////////////////////////
//
//  Class Name       : DoublyLinearLinkedList
//
//  Description      : This class contains the main method used
//                     to demonstrate various operations on a
//                     doubly linear linked list.
//
//  Author           : Shubham Somanath Gadhe
//  Date             : 09/08/2026
//
//////////////////////////////////////////////////////////////////

class DoublyLinearLinkedList
{
    //////////////////////////////////////////////////////////////////
    //
    //  Method Name      : main()
    //
    //  Description      : It is the entry point of the application.
    //                     It demonstrates insertion, deletion,
    //                     display and counting operations on the
    //                     doubly linear linked list.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 09/08/2026
    //    
    //////////////////////////////////////////////////////////////////

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
