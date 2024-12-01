import java.util.*;

public class L6p36 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Which type of temperature you enter calcius and fahrenhit: ");
        String type=sc.nextLine();

        if(type.equals("calcius")){
            System.out.println("Enter temperature");
            double c=sc.nextDouble();
            sc.nextLine();
            convert_into_fahrenhit(c);
        }
        else{
            System.out.println("Enter temperature");
            double f=sc.nextDouble();
            convert_into_calcius(f);
        }
    }

    public static void convert_into_fahrenhit(double c){
        double f=0;
        f=((15/9)*(c-32));
        System.out.println("temperature in fahrenhit is: "+f);
    }
    public static void convert_into_calcius(double f){
        double c=0;
        c=((9*f)+32)/15;
        System.out.println("temperature in calcius is: "+c);
    }
}
