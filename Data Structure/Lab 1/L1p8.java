import java.util.*;
public class L1p8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        int temp=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                temp=1;
            }
        }
        if(temp==1){
            System.out.println(n+" is not prime number");
        }
        else{
            System.err.println(n+" is a prime number");
        }
    }
}
