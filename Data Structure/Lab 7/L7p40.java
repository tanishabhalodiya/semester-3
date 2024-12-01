import java.util.*;
class Recognize{
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
}
public class L7p40 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
		System.out.println("enter string of only 'a' and 'b'");
		String str=sc.nextLine();

        char[] ch=new char[str.length()];
        char a[]=new char[str.length()];
        char b[]=new char[str.length()];

       

        int i=0;
        ch=str.toCharArray();
        int top=0;
        Recognize rc=new Recognize();
        

        int n=str.length();

        for(i=0;i<n;i++){
            
            if(ch[i]=='a'){
                rc.push(a,ch);
                
            }
            else if(ch[i]=='b'){
                rc.push(b,ch);
            }
            else if(ch[i]!='a' || ch[i]!='b'){
                System.out.println("Enter valid string only");
            }
        }

        if(a[].size()==b[].size()){
            System.out.println("the string is following the a^i b^i");
        }
        else{
            System.out.println("the string is not following the a^i b^i");
        }
        }
}
