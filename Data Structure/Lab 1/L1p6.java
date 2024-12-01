import java.util.*;
public class L1p6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number x: ");
        int x=sc.nextInt();
        System.out.println("Enter the power y: ");
        int y=sc.nextInt();
        int ans=1;
        
        for(int i=1;i<=y;i++){
            ans=ans*x;
        }
    }
}
