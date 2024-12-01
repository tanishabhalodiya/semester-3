import java.util.*;
public class Counting_sort{
    public static void count_sort(int a[]){
        int i=1;
        int k=0;
        int n=a.length;
        int b[]=new int[n];
        for(i=0;i<a.length;i++){
            k=Math.max(a[i],k);
        }
        int c[]=new int[20];
        //array C stores the accurenece values of array A elements
        for(i=0;i<20;i++){
            c[i]=0;
        }
        for(i=0;i<n;i++){
            // System.out.println("a["+i+"]: "+a[i]);
            c[a[i]]=c[a[i]]+1;
        }
        for(i=1;i<=19;i++){
            c[i]=c[i]+c[i-1];
        }
        for(i=n-1;i>=0;i--){
            // b[c[a[i]]]=a[i];
            // c[a[i]]=c[a[i]]-1;
            b[c[a[i]] - 1] = a[i];  
            c[a[i]]=c[a[i]]-1;  
        }
        System.out.println("Sorted array is : ");
        for(i=0;i<n;i++){
            System.out.print("b["+i+"] : "+b[i]);
        }

    }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n=sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]:");
            a[i] = sc.nextInt();
        }
        count_sort(a);
    }
}