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

class Stack
{
    private node first;
    private int iCount;

    // Initializes an empty stack
    Stack()
    {
        this.first = null;
        this.iCount = 0;
    }

    // Displays all elements of the stack from top to bottom
    public void Display()
    {
        node temp = first;
         
        while(temp != null)
        {
            System.out.println("| " + temp.data + " |");
            temp = temp.next;
        }
    }

    // Returns the number of elements currently present in the stack
    public int Count()
    {
        return iCount;
    }

    // Inserts a new element at the top of the stack
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

    // Removes an element from the top of the stack
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

    // Displays the top element of the stack without removing it
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

class StackUsingLinkedList
{
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