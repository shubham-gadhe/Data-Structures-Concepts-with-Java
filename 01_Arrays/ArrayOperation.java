import java.util.*;

class ArrayOperationX
{
    protected int iSize = 0;
    protected int Arr[];

    public ArrayOperationX(int iSize)
    {
        this.iSize = iSize;
        Arr = new int[iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements : ");

        for(int i = 0; i < iSize; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }

    public void Display()
    {
        System.out.println("Elements of array are : ");

        for(int i = 0; i < iSize; i++)
        {
            System.out.println(Arr[i] + "\t");
        }
    }

    public int Summation()
    {
        int iSum = 0;

        for(int i = 0; i < iSize; i++)
        {
            iSum = iSum + Arr[i];
        }

        return iSum;
    }

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

class ArrayOperation
{
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