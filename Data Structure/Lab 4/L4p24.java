import java.util.*;
public class L4p24 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int a[]={2,4,6,8,10};
      
      System.out.println("Enter number you want to delete: ");
      int n=sc.nextInt();
      int b[]=new int[4];
      int i=0;
      while(a[i]!=n){
        b[i]=a[i];
        i++;
      }
      
      while(i<a.length-1){
        b[i]=a[i+1];
        i++;
      }
      for(i=0;i<4;i++){
        System.out.println("b["+i+"] : "+b[i]);
       } 
    }
}
