import java.util.*;
public class L4p23 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int a[]={2,4,6,8,10};
      int i=0;
    
      
      System.out.println("Enter new number: ");
      int n=sc.nextInt();
      int b[]=new int[6];
     
      while(a[i] < n){
        b[i]=a[i];
        i++;
      }
      b[i]=n;
      while(i<a.length){
        b[i+1]=a[i];
        i++;
      }
      for(i=0;i<6;i++){
        System.out.println("b["+i+"] : "+b[i]);
       } 
    }
}
