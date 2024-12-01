import java.util.*;
public class L1p11 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter last number : ");
       int n=sc.nextInt();
       int sum=0;
       for(int i=1;i<=n;i++){
        System.out.print("( ");
        for(int j=1;j<=i;j++){
            sum=sum+j;
            System.out.print(j);
            System.out.print(" + ");
        }
        System.out.print(")");
        System.out.print(" + ");
       } 
       System.out.println("sum is : "+sum);
    }
}
