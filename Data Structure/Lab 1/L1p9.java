import java.util.*;
public class L1p9 {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter seconds: ");
        int t=sc.nextInt();
        int mm=0,hh=0;
        while(t>=60){
            mm++;
            t-=60;
            if(mm>=60){
                hh++;
                mm-=60;
            }
        }
        System.out.println("minutes of this time is :"+hh+" : "+mm+" : "+t);
    } 
}
