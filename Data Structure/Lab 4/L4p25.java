import java.util.*;
public class L4p25 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array : ");
    int n=sc.nextInt();

    int a[]=new int[n];
    int i=0,j=0,count=0;
    for(i=0;i<n;i++){
        System.out.println("a["+i+"] : ");
        a[i]=sc.nextInt();
    }

    for(i=0;i<n;i++){
        int temp=0;
        for(j=i+1;j<n;j++){
            
            if(a[i]==a[j]){
                a[j]=0;
            }

            for(int k=j;k<n-1;k++){
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }
    //for all elements of array are same
    if(a[0]==a[1]){
        a[1]=0;
    }
    
    // for(i=0;i<a.length;i++){
    //     if(a[i]==0){
    //         a[i]=a[i+1];
    //         count++;
    //     }
    // }
    System.out.println("array without duplicate elements: ");

    for(i=0;i<a.length;i++){
        System.out.println("a["+i+"] : "+a[i]);
    }
   } 
}

