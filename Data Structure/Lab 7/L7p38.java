import java.util.*;

class Operation{
    int top=-1;
    int arr[]=new int[5];
   
    public void push(int x){
        if(top>=4){
            System.out.println("Stack overflow");
        }
        else{
            top=top+1;
            arr[top]=x;
        }
    }

    public int pop(){
        if(top<=-1){
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            top=top-1;
           return arr[top];
        }
    }

    public void display(){
        if(top<=-1){
            System.out.println("Stack underflow");
            return;
        }
        else{
            for(int j=top;j>=0;j--){
                System.out.println("arr["+j+"]: "+arr[j]);
            }
        }
    }

    public int peep(int i){
        if((top-i+1) <= -1){
            System.out.println("element "+i+"th not available");
            return 0;
        }
        else{
            return arr[top-i+1];
        }
    }
    public void change(int i,int x){
        if((top-i+1) <= -1){
            System.out.println("element "+i+"th is not available ");
        }
        else{
           arr[top-i+1]=x;
        }
    }

}

public class L7p38 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Operation op=new Operation();

        int n=0;
        
        while(n!=6){
        System.out.println("Enter 1 for push, 2 for pop, 3 for display , 4 for peep, 5 for change and 6 for exiting the code: ");
        n=sc.nextInt();
    
        switch (n) {
            case 1:
            System.out.println("Enter x: ");
            int x=sc.nextInt();
            op.push(x);
            break;

            case 2:op.pop();
            break;

            case 3:op.display();
            break;

            case 4:System.out.println("Enter i :");
            int i=sc.nextInt();
            op.peep(i);
            break;

            case 5:System.out.println("Enter i:");
            i=sc.nextInt();
            System.out.println("enter x: ");
            x=sc.nextInt();
            op.change(x,i);
            break;

            case 6:break;
        }
    }
}
}
