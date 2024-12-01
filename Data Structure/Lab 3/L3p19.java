import java.util.*;
//pacal triangle
public class L3p19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the lines of triangle: ");
        int n=sc.nextInt();
        Try a=new Try();
        
        for(int i=0;i<n;i++){
            //to print space 
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            //to print number with logic
            for(int j=0;j<=i;j++){
                System.out.print(" " + a.factorial(i)/(a.factorial(i-j)*a.factorial(j)));
                
            }
            System.out.println();
        }
    }
}
class Try{
    public int factorial(int i){
        if(i==0){
            return 1;
        }
        else{
            return i*factorial(i-1);
        }
    }
}

