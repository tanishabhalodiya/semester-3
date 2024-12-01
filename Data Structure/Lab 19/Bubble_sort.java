import java.util.*;
public class Bubble_sort {
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
         
        //bubble sort method..........
        for( i=0 ; i < n-1 ; i++)
        {
            for(int j=0 ; j < n-1-i ; j++)  
            {
                //find minimum from near element
                if(arr[j]>arr[j+1])
                {
                    int swap=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=swap;
                }
            }
        }

        //after sorting
        System.out.println("After sorting the array is : ");
        for(i=0 ; i<n ; i++ )
        {
            System.out.print("a["+i+"] : "+arr[i]+ "  ");
        }
    }
}
