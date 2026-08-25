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

class Queue
{
    private node first;
    private int iCount;

    // Initializes an empty queue
    Queue()
    {
        this.first = null;
        this.iCount = 0;
    }

    // Displays all elements of the queue from front to rear
    public void Display()
    {
        node temp = first;

        while(temp != null)
        {
            System.out.println("| " + temp.data + " |");
            temp = temp.next;
        }
    }

    // Returns the number of elements currently present in the queue
    public int Count()
    {
        return iCount;
    }

    // Inserts a new element at the rear of the queue
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

    // Removes an element from the front of the queue
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

    // Displays the element at the front of the queue without removing it
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

class QueueUsingLinkedList
{
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