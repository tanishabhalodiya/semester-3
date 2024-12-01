import java.util.*;
//selection sort
public class Selection_sort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i=0;
        int min=0;
        for(i=0;i<arr.length;i++){
            System.out.print("arr["+i+"] : ");
            arr[i]=sc.nextInt();
        }

        //selection sorting method....
        for (i = 0; i < n-1; i++)
        {
            // Find the minimum element in array
            min = i;
            for (int j = i+1; j < n; j++){
                if (arr[j] < arr[min])
                    min = j;
            }

            // Swap first and minimum element with each other
            int swap = arr[min];
            arr[min] = arr[i];
            arr[i] = swap;
        }
    
        //after sorting
        System.out.println("After sorting the array is : ");
        for(i=0;i<n;i++){
            System.out.print("a["+i+"] : "+arr[i]+ "  ");
        }
    }

}
