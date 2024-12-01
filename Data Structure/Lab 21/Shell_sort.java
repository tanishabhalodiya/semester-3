import java.util.*;
public class Shell_sort {
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) 
        {
            System.out.print("arr[" + i + "]:");
            arr[i] = sc.nextInt();
        }
        shell_sort(arr, n);
        print(arr);

    }
    public static void shell_sort(int[] arr,int n){
        int j=0;
        int gap=0;
        for(gap=n/2;gap>=1;gap=gap/2)
        {
            for(j=gap;j<n;j++)
            {
                for(int i=j-gap;i>=0;i=i-gap)
                {
                    if(arr[i+gap]>arr[i])
                    {
                        break;
                    }
                    else
                    {
                        int swap=arr[i+gap];
                        arr[i+gap]=arr[i];
                        arr[i]=swap;
                    }
                }
            }
        }
    }
    public static void print(int[] arr) 
    {
        System.out.println();
        System.out.println("sorted array is : ");
        for (int k = 0; k < arr.length ; k++) 
        {
            System.out.print("arr [" + k + "] : " + arr[k]+" ");
        }
    }
}

