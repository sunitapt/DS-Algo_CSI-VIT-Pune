//quick sort complexity 0(nlogn)  avg case
//0(n^2) worst case  running complexity can be avoided using
// randmized version of quiksort 
//in space algo
///Divide and conquer algo 
//Recursive algoritham
//recursion is natural choice for divide and conquer algo
// not stable sorting algo not able to solve other 
//datatypes its not suitable for other datatypes 
//doesnt insure algo exx.pairs(x,y)
//
public class QuikSortCode
{
    static int QuikSort(int arr[],int start,int end)
    {
        int pivot = arr[end];
        int pIndex =start-1;
        for(int i=start;i<end;i++)
        {
            if(arr[i]<=pivot)
            {
                pIndex = pIndex+1;
                int temp = arr[pIndex];
                arr[pIndex] = arr[i];
                arr[i] = temp; 
            }
        }   
        //swap pIndex to pivot which is at end
        int temp = arr[pIndex+1];
        arr[pIndex+1] = arr[end];
        arr[end] = temp;
        return pIndex+1;
    }
    void sort(int arr[],int start ,int end)
    {
        if(start<end)
        {
            int pIndex = QuikSort(arr, start, end);
            sort(arr, start, pIndex-1);
            sort(arr, pIndex+1, end);
        }
    }    
     static void printarray(int arr[])
     {
         for(int x=0;x<arr.length;x++)
         {
             System.out.print(arr[x] +" ");
         }
     }
    public static void main(String[]args)
    {
         int arr[] = { 8,2,1,6,7,5,3,4};
        //int arr[] = { 1,2,3,4,5,6,7,8};
        System.out.println("The original array is");
        printarray(arr);
        System.out.println();
       
        QuikSortCode q = new QuikSortCode();
        // int total = 0;
        // long start = System.nanoTime ();
        q.sort(arr, 0, arr.length-1);
         
        // total += System.nanoTime() - start;
        
        System.out.println("The array now is");
        // System.out.println ("Time is " +(double)total / 10.0);
        printarray(arr); 
        System.out.println();
        
    }
}