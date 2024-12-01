import java.util.*;
public class L3p13 {
    public static void main(String[] args) {
        System.out.println("Enter size of array: ");
        int n=sc.nextInt();
        
        int a[]=new int[n];

        for(int i=0;i<n;i++){
            System.out.println("enter a["+i+"] : ");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println("a["+i+"] "+a[i]);
        }
    }
}
