import java.util.*;
public class Solution {
    public int reverse(int x) {
        int n=0;
        int a=x;
        if(x<0){
            x=-x;
        }
        // System.out.println("While start");
        while(x>0){
            int d=x%10;
            n = n*10 + d;
            x=x/10;
            System.out.println(n);
        }
        // System.out.println("While End");
        if((n >= (-2147483648) && n <= (2147483647))){
            if(a<0){
                return -n;
            }
            return n;    
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int x=sc.nextInt();
        Solution s=new Solution();
        int h=s.reverse(x);
        System.out.println(h);
    }
}