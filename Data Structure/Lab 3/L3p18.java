import java.util.*;
public class L3p18{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array: ");
        
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("enter a["+i+"]: ");
            a[i]=sc.nextInt();
        }
        System.out.print("Enter 1st number: ");
        int f=sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int s=sc.nextInt();
        int fp=0,sp=0,temp;
        for (int i=0;i<n;i++) {
            if(a[i]==f){
                fp=i;
            }
            if(a[i]==s){
                sp=i;
            }
        }
        System.out.println(fp);
        System.out.println(sp);

        for(int i=0;i<n;i++){
            temp=a[fp];
            a[fp]=a[sp];
            a[sp]=temp;
        }
        System.out.println("final array is: ");

        for(int i=0;i<n;i++){
            System.out.println("a["+i+"] : "+a[i]);
        }
        
    }
}