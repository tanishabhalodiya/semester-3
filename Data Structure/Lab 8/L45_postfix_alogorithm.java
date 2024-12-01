import java.util.*;
//without inbuilt stack and with algorithm 
public class L45_postfix_alogorithm{
    static int top=-1;
    static char arr[];
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a infix sting to convert into postfix with space: ");
        
        String str=sc.nextLine();
        
        arr=new char[str.length()];
        String postfix="";
        //enter opening bracket in the stack
        // push('(');
        int rank=0;
        int i=0;
        //check the next character of infix string
        char ch=str.charAt(i);
        
        
        while(ch !=' ')
        {
           //bracket is neccesary otherwise invalid string
           //array empty check krva mate
            if(arr[0]=='\0'){
                System.out.println("enter valid string");
                return;
            }

            //peek returns the top element of stack
            while(stackPrecedence(peek())>inputPrecedence(ch)){
                
                char temp=pop();
                //take out of stack and concat with postfix
                postfix= postfix+""+temp;
                rank=rank+rank_count(temp);
               //rank must be greater than 1
                if(rank<1){
                    System.out.println("invalid expression");
                    return;
                }

            }
            //pushing in stack
            if(stackPrecedence(peek())!=inputPrecedence(ch)){
                push(ch);
            }
            else{
                pop();
            }
            i++;
            ch=str.charAt(i);
            
        }

        if(top!=-1 || rank!=1){
            System.out.println("invalid string");
        }
        else{
            System.out.println("Valid");
            System.out.println("postfix string: "+postfix);
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
    
        public static int inputPrecedence(char ch){
            //char ch=str.charAt();
            if(ch =='+' || ch =='-'){
                return 1;
            }
            else if(ch =='*' || ch =='/'){
                return 3;
            }
            else if(ch =='^'){
                return 6;
            }
            else if(ch =='('){
                return 9;
            }
            else if(ch ==')'){
                return 0;
            }
            else{
                return 7;
            }
        }

        public static int stackPrecedence(char top){
           // char ch=str.charAt();
            if(top=='+' || top=='-'){
                return 2;
            }
            else if(top =='*' || top =='/'){
                return 4;
            }
            else if(top =='^'){
                return 5;
            }
            else if(top =='('){
                return 0;
            }
            else{
                return 8;
            }    
    }

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


