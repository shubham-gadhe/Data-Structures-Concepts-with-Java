import java.util.*;

//////////////////////////////////////////////////////////////////
//
//  Class Name       : ArrayOperationX
//
//  Description      : This class is used to perform various
//                     operations on an integer array such as
//                     accepting, displaying, searching and
//                     calculating summation, maximum, minimum
//                     and frequency.
//
//  Author           : Shubham Somanath Gadhe
//  Date             : 23/08/2026
//
//////////////////////////////////////////////////////////////////

class ArrayOperationX
{
    protected int iSize = 0;
    protected int Arr[];

    //////////////////////////////////////////////////////////////////
    //
    //  Constructor Name : ArrayOperationX()
    //
    //  Description      : It is used to initialize the array with
    //                     the specified size.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 23/08/2026
    //
    //////////////////////////////////////////////////////////////////

    public ArrayOperationX(int iSize)
    {
        this.iSize = iSize;
        Arr = new int[iSize];
    }

    //////////////////////////////////////////////////////////////////
    //
    //  Method Name      : Accept()
    //
    //  Description      : It is used to accept array elements
    //                     from the user.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 23/08/2026
    //
    //////////////////////////////////////////////////////////////////

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements : ");

        for(int i = 0; i < iSize; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }

    //////////////////////////////////////////////////////////////////
    //
    //  Method Name      : Display()
    //
    //  Description      : It is used to display all the elements
    //                     of the array.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 23/08/2026
    //
    //////////////////////////////////////////////////////////////////

    public void Display()
    {
        System.out.println("Elements of array are : ");

        for(int i = 0; i < iSize; i++)
        {
            System.out.println(Arr[i] + "\t");
        }
    }

    //////////////////////////////////////////////////////////////////
    //
    //  Method Name      : Summation()
    //
    //  Description      : It is used to calculate and return the
    //                     summation of all array elements.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 23/08/2026
    //
    //////////////////////////////////////////////////////////////////

    public int Summation()
    {
        int iSum = 0;

        for(int i = 0; i < iSize; i++)
        {
            iSum = iSum + Arr[i];
        }

        return iSum;
    }

    //////////////////////////////////////////////////////////////////
    //
    //  Method Name      : Maximum()
    //
    //  Description      : It is used to find and return the
    //                     maximum element from the array.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 23/08/2026
    //
    //////////////////////////////////////////////////////////////////

    public int Maximum()
    {
        int iMax = 0;

        for(int i = 0; i < iSize; i++)
        {
            if(Arr[i] > iMax)
            {
                iMax = Arr[i];
            }
        }

        return iMax;
    }

    //////////////////////////////////////////////////////////////////
    //
    //  Method Name      : Minimum()
    //
    //  Description      : It is used to find and return the
    //                     minimum element from the array.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 23/08/2026
    //
    //////////////////////////////////////////////////////////////////

    public int Minimum()
    {
        int iMin = 0;

        iMin = Arr[0];

        for(int i = 0; i < iSize; i++)
        {
            if(Arr[i] < iMin)
            {
                iMin = Arr[i];
            }
        }

        return iMin;
    }

    //////////////////////////////////////////////////////////////////
    //
    //  Method Name      : Search()
    //
    //  Description      : It is used to search for the specified
    //                     element in the array.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 23/08/2026
    //
    //////////////////////////////////////////////////////////////////

    public boolean Search(int iNo)
    {
        for(int i = 0; i < iSize; i++)
        {
            if(Arr[i] == iNo)
            {
                return true;
            }
        }

        return false;
    }

    //////////////////////////////////////////////////////////////////
    //
    //  Method Name      : Frequency()
    //
    //  Description      : It is used to count and return the
    //                     frequency of the specified element.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 23/08/2026
    //
    //////////////////////////////////////////////////////////////////

    public int Frequency(int iNo)
    {
        int iCount = 0;

        for(int i = 0; i < iSize; i++)
        {
            if(Arr[i] == iNo)
            {
                iCount++;
            }
        }

        return iCount;
    }
}

//////////////////////////////////////////////////////////////////
//
//  Class Name       : ArrayOperation
//
//  Description      : This class contains the main method used
//                     to execute various array operations.
//
//  Author           : Shubham Somanath Gadhe
//  Date             : 23/08/2026
//
//////////////////////////////////////////////////////////////////

class ArrayOperation
{
    //////////////////////////////////////////////////////////////////
    //
    //  Method Name      : main()
    //
    //  Description      : It is the entry point of the application.
    //                     It accepts the array size and performs
    //                     various operations using ArrayOperationX.
    //
    //  Author           : Shubham Somanath Gadhe
    //  Date             : 23/08/2026
    //
    //////////////////////////////////////////////////////////////////

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iLength = 0, iRet = 0, iValue = 0;
        boolean bRet = false;

        System.out.println("Enter the number of elements : ");
        iLength = sobj.nextInt();

        ArrayOperationX aobj = new ArrayOperationX(iLength);

        aobj.Accept();
        aobj.Display();
        
        iRet = aobj.Summation();
        System.out.println("Summation is : " + iRet);

        iRet = aobj.Maximum();
        System.out.println("Maximum element is : " + iRet);

        iRet = aobj.Minimum();
        System.out.println("Minimum element is : " + iRet);

        System.out.println("Enter the element to search : ");
        iValue = sobj.nextInt();

        bRet = aobj.Search(iValue);       
        
        if(bRet == true)
        {
            System.out.println("Element is present");
        }
        else
        {
            System.out.println("Element is not present");
        }

        System.out.println("Enter the element to count frequency : ");
        iValue = sobj.nextInt();

        iRet = aobj.Frequency(iValue);
        System.out.println("Frequency of element is : " + iRet);        
    }
}
