import java.util.*;
public class L3p20 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a size of array: ");
        int n=sc.nextInt();
        sc.nextLine();

        System.out.println("Enter some names: ");
        
        String name[]=new String[n];
        int res=0;
        String temp;
        for(int i=0;i<n;i++){
            System.out.print(" name["+i+"] : ");
            name[i]=sc.nextLine();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                res=name[i].compareTo(name[j]);
                if(res > 0){
                temp=name[i];
                name[i]=name[j];
                name[j]=temp;
                }
            }
        }
        System.out.println("The sorted names with alphabetical order is as below:");
           
        for(int i=0;i<n;i++){
            System.out.println("name["+i+"] : "+name[i]);
        }
    }
}
