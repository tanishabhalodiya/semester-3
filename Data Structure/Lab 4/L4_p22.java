import java.util.*;
public class L4_p22 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter index of new number: ");
        int j=sc.nextInt();
        int a[]={2,4,6,8,10};

        int b[]=new int[4];

        for(int i=0;i<4;i++){
            if(i<j){
                b[i]=a[i];
            }
            else if(i>=j){
                b[i]=a[i+1];
            }
            
        }
        //printing new array
        for(int i=0;i<4;i++){
            System.out.println("b["+i+"] : "+b[i]);
        }
    }
}
