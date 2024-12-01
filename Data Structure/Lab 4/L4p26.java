import java.util.*;
public class L4p26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a1[]={1,5,3,9,7};
        int a2[]={10,2,8,6,4};
        int a3[]=new int[10];
        
        for(int i=0;i<10;i++){
            if(i<5){
                a3[i]=a1[i];
            }
            else if(i>4 && i<10){
                a3[i]=a2[i-5];
            }
        }

        int min=a3[0];

        for(int i=0;i<10;i++){
            for(int j=i+1;j<10;j++){
                if(a3[i]>a3[j]){
                    int temp=a3[i];
                    a3[i]=a3[j];
                    a3[j]=temp;
                }
            }
        }

        for(int i=0;i<10;i++){
            System.out.println("a3["+i+"] : "+a3[i]);
        }

    }


}

