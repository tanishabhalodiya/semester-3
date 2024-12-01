import java.util.*;
public class L1p5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();    
        
        Factorial f=new Factorial();
        int ans=f.fact(n);
    
        System.out.println("fatorial of given number is: "+ans);    
    }
}
class Factorial{
    public int fact(int n){
        if(n!=0){
            return n*fact(n-1);
        }
        else{
            return 1;
        }
    }
}
