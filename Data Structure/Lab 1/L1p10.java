import java.util.*;
public class L1p10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of days: ");   
        int d=sc.nextInt();
        int temp=d;
        int yy=0,ww=0;
        while(d>=7){
            ww++;
            d-=7;
            if(ww>=52){
                yy++;
                ww-=52;
            }
        }
        System.out.println(temp+" days means " +yy+ " year " +ww+ " weeks and " +d+ " days");
    }
}
