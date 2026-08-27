//////////////////////////////////////////////////////////////////
//
//  Class Name       : node
//
//  Description      : This class represents a node of a doubly
//                     circular linked list. It contains data and
//                     references to the next and previous nodes.
//
//  Author           : Shubham Somanath Gadhe
//  Date             : 10/08/2026
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
    //  Date             : 10/08/2026
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
//  Class Name       : DoublyCL
//
//  Description      : This class is used to implement a doubly
//                     circular linked list and provides operations
//                     such as insertion, deletion, display and
//                     counting of nodes.
//
//  Author           : Shubham Somanath Gadhe
//  Date             : 10/08/2026
//
//////////////////////////////////////////////////////////////////

class DoublyCL
{
    private node first;
    private node last;
    private int iCount;

    //////////////////////////////////////////////////////////////////
    //
    //  Constructor Name : DoublyCL()
    //
    //  Description      : It is used to initialise an empty
    //                     doubly circular linked list.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 10/08/2026
    //
    //////////////////////////////////////////////////////////////////

    public DoublyCL()
    {
        this.first = null;
        this.last = null;
        this.iCount = 0;
    }

    //////////////////////////////////////////////////////////////////
    //
    //  Method Name      : Display()
    //
    //  Description      : It is used to display all elements of
    //                     the circular linked list.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 10/08/2026
    //
    //////////////////////////////////////////////////////////////////

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

    //////////////////////////////////////////////////////////////////
    //
    //  Method Name      : Count()
    //
    //  Description      : It is used to return the total number
    //                     of nodes present in the linked list.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 10/08/2026
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
    //                     beginning of the circular linked list.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 10/08/2026
    //
    //////////////////////////////////////////////////////////////////

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

    //////////////////////////////////////////////////////////////////
    //
    //  Method Name      : InsertLast()
    //
    //  Description      : It is used to insert a new node at the
    //                     end of the circular linked list.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 10/08/2026
    //
    //////////////////////////////////////////////////////////////////

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

    //////////////////////////////////////////////////////////////////
    //
    //  Method Name      : InsertAtPos()
    //
    //  Description      : It is used to insert a new node at the
    //                     specified position in the linked list.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 10/08/2026
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
    //                     from the circular linked list.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 10/08/2026
    //
    //////////////////////////////////////////////////////////////////

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

    //////////////////////////////////////////////////////////////////
    //
    //  Method Name      : DeleteLast()
    //
    //  Description      : It is used to delete the last node
    //                     from the circular linked list.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 10/08/2026
    //
    //////////////////////////////////////////////////////////////////

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

    //////////////////////////////////////////////////////////////////
    //
    //  Method Name      : DeleteAtPos()
    //
    //  Description      : It is used to delete the node at the
    //                     specified position from the linked list.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 10/08/2026
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
//  Class Name       : DoublyCircularLinkedList
//
//  Description      : This class contains the main method used
//                     to demonstrate various operations on a
//                     doubly circular linked list.
//
//  Author           : Shubham Somanath Gadhe
//  Date             : 10/08/2026
//
//////////////////////////////////////////////////////////////////

class DoublyCircularLinkedList
{
    //////////////////////////////////////////////////////////////////
    //
    //  Method Name      : main()
    //
    //  Description      : It is the entry point of the application.
    //                     It demonstrates insertion, deletion,
    //                     display and counting operations on the
    //                     doubly circular linked list.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 10/08/2026
    //
    //////////////////////////////////////////////////////////////////

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
