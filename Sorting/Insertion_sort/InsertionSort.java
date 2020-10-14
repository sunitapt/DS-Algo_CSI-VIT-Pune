public class InsertionSort{
     
     static void InsertionSortCode()
     {
        int [] arr = {2,7,4,1,5,3};
         int n = arr.length;
          for(int i=1;i<n-1;i++)
            {
                //int value = arr[i];
                //int hole = i;
                while(i >0 && arr[i-1]>arr[i])
                {
                    int temp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temp;
                    i--;
                }
                //arr[i] = i;
            }
             for(int k=0;k<n;k++)
             {
                 System.out.print(arr[k]+" ");
             }
         }
     

      public static void main(String[] args)
      {
          InsertionSortCode();    
      }
}
//Running time of algoritham is 0(n^2)
//slow sorting algoritham 
//best case 0(n)
// avg case 0(n^2)