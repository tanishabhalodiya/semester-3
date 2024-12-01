
import java.util.*;

class Student_Detail{
    int enrollment_No;
    String name;
    int semester;
    double cpi;

    public void read(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter enrollment number of student: ");
        enrollment_No=sc.nextInt();
        sc.nextLine();
        System.out.println("enter name of student: ");
        name=sc.nextLine();
        System.out.println("enter semester of student: ");
        semester=sc.nextInt();
        System.out.println("enter cpi of student: ");
        cpi=sc.nextDouble();
    }
    public void print(){
        System.out.println("..................Printing the details of students...................");
        System.out.println("Enrollment number of student is : "+enrollment_No);
        System.out.println("name of student is : "+name);
        System.out.println("semester of student is : "+semester);
        System.out.println("cpi of student is : "+cpi);
    }
}
public class L6p35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        Student_Detail stu[]=new Student_Detail[5];

        for(int i=0;i<5;i++){
            stu[i]=new Student_Detail();
            stu[i].read();
        }
        for(int i=0;i<5;i++){
            
            stu[i].print();
        }

    }
}
