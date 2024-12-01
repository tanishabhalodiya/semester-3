import java.util.*;
public class L1p7 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        System.out.println("The factors of n :");
        for (int i = 1; i <=n; i++) {
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
}