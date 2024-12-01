import java.util.*;
class Recognize{
    String str="abcba ";
    int i;
    int top=0;
    char[] ch=str.toCharArray();
    int n=ch.length;
    int s[]=new int[n];
    
    
    char s[top]='c';
    
    public void palindrome(char s,int top,int i){
        i=0;
        while(ch[i]!='c'){
            if(ch[i]==' '){
                System.out.println("Invalid string");
            }
            else{
            push(s,top,ch[i]);
             }
            i++;
        }
        i++;
        while(ch[i] != ' '){
            int temp=pop(s,top);
            if(ch[i]==temp){
                System.out.println("Valid and palindrome String");
            }
            else{
                System.out.println("Invalid string");
            }
            i++;
        }
    }
    public void push(char s,int top,char x){
        if(top>=4){
            System.out.println("Stack overflow");
        }
        else{
            top=top+1;
            ch[top]=x;
        }
    }

    public int pop(char s,int top){
        if(top<=-1){
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            top=top-1;
           return temp;
        }
    }
}
public class L7p39{
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Recognize rc=new Recognize();  
    }

}