import java.util.*;
public class L7p39_stack {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.println("enter string which contains only a,b and c with last space: ");
		String str=sc.nextLine();

        Stack<Character> stack=new Stack<>();
        int i=0;
        char ch=str.charAt(i);
        stack.push('c');
          
        while(ch!='c'){
            ch=str.charAt(i);
            if(ch==' '){
                System.out.println("invalid string :");
                break;
            }
            else{
                stack.push(ch);
                i++;
                ch=str.charAt(i);
            }
            
        }

       i++;

        while(ch!=' '){
            
            char temp1=stack.pop();
            char temp2=str.charAt(i);

            // System.out.println("temp1: "+temp1);
            // System.out.println("temp2: "+temp2);

            if(temp1!=temp2){
                System.out.println("invalid string :");
                break;
                
            }
            i++;
            ch=str.charAt(i);
        }

        ch=str.charAt(i);
        
        if(ch==' '){
            System.out.println("Valid string");
        }
        else{
            System.out.println("invalid string :");
        }
        System.out.println(stack);
    
     }
}
