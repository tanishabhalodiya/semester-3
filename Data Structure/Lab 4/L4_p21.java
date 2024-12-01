import java.util.*;
public class L4_p21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a new number: ");
        int n=sc.nextInt();
        System.out.println("Enter index of new number: ");
        int j=sc.nextInt();
        int a[]={2,4,6,8,10};
        

        int b[]=new int[6];
        
        for(int i=0;i<6;i++){
            if(i<j){
                b[i]=a[i];
            }
            else if(i==j){
                b[i]=n;
            }
            else if(i>j){
                b[i]=a[i-1];
            }
        }
        //printing new array
        for(int i=0;i<6;i++){
            System.out.println("b["+i+"] : "+b[i]);
        }
    }
}
