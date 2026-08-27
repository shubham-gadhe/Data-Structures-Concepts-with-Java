//////////////////////////////////////////////////////////////////
//
//  Class Name       : node
//
//  Description      : This class represents a node of a queue
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
//  Class Name       : Queue
//
//  Description      : This class is used to implement a queue
//                     using a singly linked list. It provides
//                     operations such as Enqueue, Dequeue,
//                     Peek, Display and Count.
//
//  Author           : Shubham Somanath Gadhe
//  Date             : 15/08/2026
//
//////////////////////////////////////////////////////////////////

class Queue
{
    private node first;
    private int iCount;

    //////////////////////////////////////////////////////////////////
    //
    //  Constructor Name : Queue()
    //
    //  Description      : It is used to initialise an empty queue.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 15/08/2026
    //
    //////////////////////////////////////////////////////////////////

    Queue()
    {
        this.first = null;
        this.iCount = 0;
    }

    //////////////////////////////////////////////////////////////////
    //
    //  Method Name      : Display()
    //
    //  Description      : It is used to display all elements of
    //                     the queue from front to rear.
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
    //                     elements currently present in the queue.
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
    //  Method Name      : Enqueue()
    //
    //  Description      : It is used to insert a new element at
    //                     the rear of the queue.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 15/08/2026
    //
    //////////////////////////////////////////////////////////////////

    public void Enqueue(int iNo)
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
    //  Method Name      : Dequeue()
    //
    //  Description      : It is used to remove an element from
    //                     the front of the queue.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 15/08/2026
    //
    //////////////////////////////////////////////////////////////////

    public void Dequeue()
    {
        if(first == null)
        {
            System.out.println("Queue is Empty");
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
    //  Method Name      : Peek()
    //
    //  Description      : It is used to display the element at
    //                     the front of the queue without removing it.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 15/08/2026
    //
    //////////////////////////////////////////////////////////////////

    public void Peek()
    {
        if(first == null)
        {
            System.out.println("Queue is empty");
        }
        else
        {
            System.out.println("First element of Queue is : " + first.data);
        }
    }
}

//////////////////////////////////////////////////////////////////
//
//  Class Name       : QueueUsingLinkedList
//
//  Description      : This class contains the main method used
//                     to demonstrate queue operations using
//                     a linked list.
//
//  Author           : Shubham Somanath Gadhe
//  Date             : 15/08/2026
//
//////////////////////////////////////////////////////////////////

class QueueUsingLinkedList
{
    //////////////////////////////////////////////////////////////////
    //
    //  Method Name      : main()
    //
    //  Description      : It is the entry point of the application.
    //                     It demonstrates Enqueue, Dequeue, Peek,
    //                     Display and Count operations on the queue.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 15/08/2026
    //    
    //////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        int iRet = 0;

        Queue qobj = new Queue();

        qobj.Enqueue(11);
        qobj.Enqueue(21);
        qobj.Enqueue(51);
        qobj.Enqueue(101);

        qobj.Display();

        iRet = qobj.Count();
        System.out.println("Number of elements in Queue is : " + iRet);

        System.out.println();

        qobj.Dequeue();

        qobj.Display();

        iRet = qobj.Count();
        System.out.println("Number of elements in Queue is : " + iRet);

        System.out.println();

        qobj.Peek();

        qobj.Display();

        iRet = qobj.Count();
        System.out.println("Number of elements in Queue is : " + iRet);

        System.out.println();
    }
}
