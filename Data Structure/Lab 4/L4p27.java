import java.util.*;
public class L4p27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string :");
        String str=sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            
            int askii=(int)ch ;

            if(askii>=65 && askii<=90){
                askii+=32;
                System.out.print((char)askii);
            }
            else if(askii>=97 && askii<=122){
                askii-=32;
                System.out.print((char)askii);
            }
        }   
    }
}
