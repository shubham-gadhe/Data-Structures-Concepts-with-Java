//////////////////////////////////////////////////////////////////
//
//  Class Name       : node
//
//  Description      : This class represents a node of a stack
//                     implemented using a linked list. It contains
//                     data and a reference to the next node.
//
//  Author           : Shubham Somanath Gadhe
//  Date             : 15/08/2026
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
    //  Date             : 15/08/2026
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
//  Class Name       : Stack
//
//  Description      : This class is used to implement a stack
//                     using a singly linked list. It provides
//                     operations such as Push, Pop, Peep,
//                     Display and Count.
//
//  Author           : Shubham Somanath Gadhe
//  Date             : 15/08/2026
//
//////////////////////////////////////////////////////////////////

class Stack
{
    private node first;
    private int iCount;

    //////////////////////////////////////////////////////////////////
    //
    //  Constructor Name : Stack()
    //
    //  Description      : It is used to initialise an empty stack.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 15/08/2026
    //
    //////////////////////////////////////////////////////////////////

    Stack()
    {
        this.first = null;
        this.iCount = 0;
    }

    //////////////////////////////////////////////////////////////////
    //
    //  Method Name      : Display()
    //
    //  Description      : It is used to display all elements of
    //                     the stack from top to bottom.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 15/08/2026
    //
    //////////////////////////////////////////////////////////////////

    public void Display()
    {
        node temp = first;
         
        while(temp != null)
        {
            System.out.println("| " + temp.data + " |");
            temp = temp.next;
        }
    }

    //////////////////////////////////////////////////////////////////
    //
    //  Method Name      : Count()
    //
    //  Description      : It is used to return the number of
    //                     elements currently present in the stack.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 15/08/2026
    //
    //////////////////////////////////////////////////////////////////

    public int Count()
    {
        return iCount;
    }

    //////////////////////////////////////////////////////////////////
    //
    //  Method Name      : Push()
    //
    //  Description      : It is used to insert a new element at
    //                     the top of the stack.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 15/08/2026
    //
    //////////////////////////////////////////////////////////////////

    public void Push(int iNo)
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
    //  Method Name      : Pop()
    //
    //  Description      : It is used to remove an element from
    //                     the top of the stack.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 15/08/2026
    //
    //////////////////////////////////////////////////////////////////

    public void Pop()
    {
        if(first == null)
        {
            System.out.println("Stack is empty");
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
    //  Method Name      : Peep()
    //
    //  Description      : It is used to display the top element
    //                     of the stack without removing it.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 15/08/2026
    //
    //////////////////////////////////////////////////////////////////

    public void Peep()
    {
        if(first == null)
        {
            System.out.println("Stack is empty");
            return;
        }
        
        System.out.println("Top element is : " + first.data);
    }
}

//////////////////////////////////////////////////////////////////
//
//  Class Name       : StackUsingLinkedList
//
//  Description      : This class contains the main method used
//                     to demonstrate stack operations using
//                     a linked list.
//
//  Author           : Shubham Somanath Gadhe
//  Date             : 15/08/2026
//
//////////////////////////////////////////////////////////////////

class StackUsingLinkedList
{
    //////////////////////////////////////////////////////////////////
    //
    //  Method Name      : main()
    //
    //  Description      : It is the entry point of the application.
    //                     It demonstrates Push, Pop, Peep, Display
    //                     and Count operations on the stack.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 15/08/2026
    //
    //////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        int iRet = 0;

        Stack sobj = new Stack();

        System.out.println();

        sobj.Push(11);
        sobj.Push(21);
        sobj.Push(51);
        sobj.Push(101);

        sobj.Display();
        iRet = sobj.Count();
        System.out.println("Number of elements in Stack is : " + iRet);

        System.out.println();

        sobj.Pop();

        sobj.Display();
        iRet = sobj.Count();
        System.out.println("Number of elements in Stack is : " + iRet);

        System.out.println();

        sobj.Peep();

        sobj.Display();
        iRet = sobj.Count();
        System.out.println("Number of elements in Stack is : " + iRet);

        System.out.println();
    }
}
