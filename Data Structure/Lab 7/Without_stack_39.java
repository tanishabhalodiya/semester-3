import java.util.*;
class Recognize{
	public static void push(char s[],int top,char x){
        if(top>=s.length){
            System.out.println("Stack overflow");
        }
        else{
            //top=top+1;
            s[top]=x;
        }
    }

    public static char pop(char[] s,int top){
        if(top<=-1){
            System.out.println("Stack underflow");
            return 'n';
        }
        else{
            top=top-1;
           return s[top+1];

        }
    }
}
public class Without_stack_39{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string with space compulsory:");
		String str=sc.nextLine();

        // Stack<Character> stack=new Stack<>();
        
        char s[]=new char[str.length()];
        char[] ch=new char[str.length()];
        ch=str.toCharArray();    

        int top=0;
        s[top]='c';
        top=1;
		Recognize rc=new Recognize();
        int i=0;

        while(ch[i]!='c'){
            if(ch[i]==' '){
                System.out.println("invalid string 1:");
                break;
            }
            else{
                char x=ch[i];
                rc.push(s,top,x);
                // stack.push(x);
                top++;
            }
            i++;
        }
        top--;
        
        i++;
        while(s[top]!='c'){
        
            char temp=rc.pop(s,top);
            
            top--;
            if(ch[i]!=temp){
                System.out.println("invalid string:");
                break;
            }
            i++; 
        }
        if(ch[i]==' '){
            System.out.println("valid string :");
        }
        else{
            System.out.println("invalid string 3:");
    }
	}
}