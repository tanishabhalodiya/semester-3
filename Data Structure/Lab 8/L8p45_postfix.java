import java.util.*;
//short cut method of postfix converstion
public class L8p45_postfix 
{
    static int top=-1;
    static char arr[];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a infix sting to convert into postfix with space: ");

        String str=sc.nextLine();
        arr=new char[str.length()];
        String postfix="";

        //enter opening bracket in the stack
        push('(');
        int rank=0;
        int i=0;

        //char temp=')';
        //check the next character of infix string
        char ch=str.charAt(i);

        for(i=0;i<str.length();i++){
            ch=str.charAt(i);

            if(ch >='a' && ch <='z' ){
                postfix=postfix+ch;
                System.out.println(postfix);
            }
            else if(ch=='('){
                push(ch);
            }
            else if(ch==')'){
                while(arr[0]!='\0' && peek()!= '(' ){
                    postfix=postfix+(pop());
                    System.out.println(postfix);
                }
                pop();
            }
            else if(str.charAt(i)=='^' && peek()=='^'){
                push(ch);
            }

            //coming character is operator
            else{
                while((precedence(str.charAt(i)) < precedence(peek())) || (precedence(str.charAt(i)) == precedence(peek()))){
            
                    postfix=postfix+(pop());
                    System.out.println("postfix: "+postfix);
                }
                push(ch);
            }
         }

         //remove bracket from stack
         pop();

        //remove all the elements from the stack and add it into the postfix
        while (arr[0]!='\0'){
            postfix=postfix+pop();
        }
        
        if(top!=-1 || rank!=1){
            System.out.println("invalid string");
        }
        else{
            System.out.println("Valid");
            System.out.println("postfix string: "+postfix);
        }
        
    }


    // check precendence 
    public static int precedence(char ch){
        if(ch=='+' || ch=='-'){
            return 1;
        }
        else if(ch=='*' || ch=='/'){
            return 2;
        }
        else if(ch=='^'){
            return 3;
        }
        else{
            return -1;
        }
    }

    public static int rank_count(char temp){
        
        if(temp== '+' ||temp == '-' ||temp =='*'||temp == '/' ||temp =='(' ||temp == ')'){
            return -1;
        }
        else{
            return 1;
        }
    }
    // methods for stack handling
    public static void push(char x){
		top=top+1;
		arr[top]=x;
	}
	public static char pop(){
		top=top-1;
		return arr[top+1];
	}
	public static char peek(){
		return arr[top];
	}
	public static void display(){
		System.out.println("top"+top);
		for(int i=0;i<=top;i++){
			System.out.println("a["+i+"]"+arr[i]);
		}
	}
}
