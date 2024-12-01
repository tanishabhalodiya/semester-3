import java.util.*;
public class L3p17 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number n: ");
     int n=sc.nextInt(); 

    int a[]=new int[n];
    for(int i=0;i<n;i++){
        System.out.println("enter a["+i+"] : ");
        a[i]=sc.nextInt();
    }

    int c=1;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(a[i]==a[j]){
                c=2;
            }
        }
    }
    if(c==2){
        
    }
    }
}
