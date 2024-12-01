
import java.util.*;

public class L6p33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number a: ");
        int a=sc.nextInt();
        System.out.println("Enter second number b: ");
        int b=sc.nextInt();
        
        swapNumber(a,b);

    }
    public static void swapNumber(int a,int b){
        int temp=0;
        temp=a;
        a=b;
        b=temp;
        System.out.println("Swaped a is: "+a);
        System.out.println("Swaped b is: "+b);
    }
}
