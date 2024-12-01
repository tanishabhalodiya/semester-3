import java.util.*;
//short cut method of postfix converstion
public class L8p46_prefix
{
    static int top=-1;
    static char arr[];
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a infix sting without space: ");

        String string=sc.nextLine();
        String revString="";
        
        //reverse given string
        char s;
        for(int i=0;i<string.length();i++)
        {
            s=string.charAt(i);
            if(s=='(')
            {
                s=')';
            }
            else if(s==')')
            {
                s='(';
            }
            //convert into character and concat with string
            revString=s+revString;
        }
        //System.out.println("reverse string is: "+revString);
        //enter closing bracket and space in reverse string.
        revString=revString+')';
        revString=revString+' ';
        arr=new char[revString.length()];
        String postfix="";
        String prefix="";

        //enter opening bracket in the stack
        push('(');
        System.out.println("Reverse string is: "+revString);
        int rank=0;
        int i=0;
        //char temp=')';
        //check the next character of infix string
        char ch=revString.charAt(i);

        for(i=0;i<revString.length();i++)
        {
            ch=revString.charAt(i);

            if(ch >='a' && ch <='z' )
            {
                postfix=postfix+ch;
                System.out.println(postfix);
            }
            else if(ch=='(')
            {
                push(ch);
            }
            else if(ch==')')
            {
                while(arr[0]!='\0' && peek()!= '(' ){
                    postfix=postfix+(pop());
                    System.out.println(postfix);
                }
                pop();
            }
            else if(revString.charAt(i)=='^' && peek()=='^')
            {
                postfix=postfix+(pop());
                push(ch);
                System.out.println(postfix);
            }
            //coming character is operator
            
            else{
                while((precedence(revString.charAt(i)) < precedence(peek())))
                {
                    postfix=postfix+(pop());
                    //System.out.println("postfix: "+postfix);
                    
                }
                push(ch);
            }
         }
         //remove bracket from stack
         pop();

    
        //remove all the elements from the stack and add it into the postfix
       //System.out.println("postfix 2"+postfix);
        while (arr[0]!='\0')
        {
            revString=revString+pop();
        }

        if(top!=-1 || rank!=1)
        {
            System.out.println("invalid string");
        }

        //to get prefix string we reverse this postfix string
        else
        {
            System.out.println("Valid");
            for(i=0;i<postfix.length();i++)
            {
                prefix=(postfix.charAt(i))+prefix;
                System.out.println("prefix string: "+prefix);
            }
            
        }
    }


    // check precendence 
    public static int precedence(char ch)
    {
        if(ch=='+' || ch=='-')
        {
            return 1;
        }
        else if(ch=='*' || ch=='/')
        {
            return 2;
        }
        else if(ch=='^')
        {
            return 3;
        }
        else
        {
            return -1;
        }
    }

    public static int rank_count(char temp)
    {
        if(temp== '+' ||temp == '-' ||temp =='*'||temp == '/' ||temp =='(' ||temp == ')'){
            return -1;
        }
        else{
            return 1;
        }
    }
    // methods for stack handling
    public static void push(char x)
    {
		top=top+1;
		arr[top]=x;
	}
	public static char pop()
    {
		top=top-1;
		return arr[top+1];
	}
	public static char peek()
    {
		return arr[top];
	}
	public static void display()
    {
		System.out.println("top"+top);
		for(int i=0;i<=top;i++){
			System.out.println("a["+i+"]"+arr[i]);
		}
	}
}
