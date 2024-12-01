import java.util.*;
public class L1p12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int r,sum=0,n;
        
        for(int i=1;i<=1000;i++){
    
            n=i;
            while (n>0) {
                
                r=i%10;
                sum=sum+(r*r*r); 
                n=(n/10);
                if(sum==i){
                    System.out.println(i);
                }
                
            }
            sum=0; 
         }
    }
}
