//////////////////////////////////////////////////////////////////
//
//  Class Name       : node
//
//  Description      : This class represents a node of a singly
//                     linear linked list. It contains data and
//                     a reference to the next node.
//
//  Author           : Shubham Somanath Gadhe
//  Date             : 09/08/2026
//
//////////////////////////////////////////////////////////////////

class node
{
    public int data;
    public node next;

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
    }
}

//////////////////////////////////////////////////////////////////
//
//  Class Name       : SinglyLL
//
//  Description      : This class is used to implement a singly
//                     linear linked list and provides operations
//                     such as insertion, deletion, display and
//                     counting of nodes.
//
//  Author           : Shubham Somanath Gadhe
//  Date             : 09/08/2026
//
//////////////////////////////////////////////////////////////////

class SinglyLL
{
    private node first; 
    private int iCount;

    //////////////////////////////////////////////////////////////////
    //
    //  Constructor Name : SinglyLL()
    //
    //  Description      : It is used to initialise an empty
    //                     singly linear linked list.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 09/08/2026
    //
    //////////////////////////////////////////////////////////////////

    public SinglyLL()
    {
        this.first = null;
        this.iCount = 0;
    }

    //////////////////////////////////////////////////////////////////
    //
    //  Method Name      : Display()
    //
    //  Description      : It is used to display all elements of
    //                     the singly linear linked list.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 09/08/2026
    //
    //////////////////////////////////////////////////////////////////

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
            first = newn;
        }

        iCount++;

    }

    //////////////////////////////////////////////////////////////////
    //
    //  Method Name      : InsertLasts()
    //
    //  Description      : It is used to insert a new node at the
    //                     end of the linked list.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 09/08/2026
    //
    //////////////////////////////////////////////////////////////////

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
            
            iCount--;
        }        
    }    
}

//////////////////////////////////////////////////////////////////
//
//  Class Name       : SinglyLinearLinkedList
//
//  Description      : This class contains the main method used
//                     to demonstrate various operations on a
//                     singly linear linked list.
//
//  Author           : Shubham Somanath Gadhe
//  Date             : 09/08/2026
//
//////////////////////////////////////////////////////////////////

class SinglyLinearLinkedList
{
    //////////////////////////////////////////////////////////////////
    //
    //  Method Name      : main()
    //
    //  Description      : It is the entry point of the application.
    //                     It demonstrates insertion, deletion,
    //                     display and counting operations on the
    //                     singly linear linked list.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 09/08/2026
    //
    //////////////////////////////////////////////////////////////////

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
