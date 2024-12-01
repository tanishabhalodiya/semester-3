import java.util.*;
public class L3p16 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number n: ");
    int n=sc.nextInt(); 

    int a[]=new int[n];
    for(int i=0;i<n;i++){
        System.out.println("enter a["+i+"] : ");
        a[i]=sc.nextInt();
    }

    int minI;maxI;
    int min=a[0],max=a[0];

    for(int i=0;i<n;i++){
        if(a[i]<a[0]){
            min=a[i];
            minI=i;
        }
        if(a[i]>a[0]){
            max=a[i];
            maxI=i;
        }
    }
    System.out.println("Position of smallest number is : "+minI);
    System.out.println("Position of largest number is : "+maxI);
   } 
}
