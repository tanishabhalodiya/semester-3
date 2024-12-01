import java.util.*;
public class L3p15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number n: ");
        int n=sc.nextInt();  
        
        double sum=0;
        double avg=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        avg=(sum/n);
        System.out.println("the average is: "+avg);
    }
}
