import java.util.*;
class stack{
    int top=1;
    public static void push(char a[],char x){
        if(top>=a.length){
            System.out.println("Stack overflow");
        }
        else{
            //top=top+1;
            a[top]=x;
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
    public void rank_count(){
        if(ch[i]== '+' ||ch[i]== '-' ||ch[i]=='*'||ch[i]== '/' ||ch[i]=='(' ||ch[i]== ')'){
            rank=-1;
        }
        else{
            rank=1;
        }
    }
}
public class Infix_postfix_p45 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a infix sting to convert into postfix : ");
        String str=sc.nextLine();
        int len=str.length();

        stack sk=new stack();

        char s[]=new char[str.length()];
        char[] ch=new char[str.length()];
        ch=str.toCharArray();

        int top=1;
        s[top]="(";
        String string="";
        int rank=0;
        
    }
}
