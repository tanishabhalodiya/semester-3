import java.util.*;
public class Insertion_sort {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int i=0;
        int min=0;

        //enter array for sorting 
        for(i=0;i<arr.length;i++){
            System.out.print("arr["+i+"] : ");
            arr[i]=sc.nextInt();
        }

        //insertion sort
        i=1;
        int j=0;
        int key=0;
        while(i<n){
            key=arr[i];
            j=i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
            i=i+1;
        }

        //after sorting
        System.out.println("After sorting the array is : ");
        for(i=0 ; i<n ; i++ )
        {
            System.out.print("a["+i+"] : "+arr[i]+ "  ");
        }

    }
    
}
