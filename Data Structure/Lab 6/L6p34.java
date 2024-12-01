import java.util.*;
class Employee_Detail{
    int employee_ID;
    String name;
    String designation;
    double salary;;

}

public class L6p34 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Employee_Detail emp=new Employee_Detail();
        System.out.println("Enter ID of employee: ");
        emp.employee_ID=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name of employee: ");
        emp.name=sc.nextLine();
        System.out.println("Enter designation of employee: ");
        emp.designation=sc.nextLine();
        System.out.println("Enter salary of employee: ");
        emp.salary=sc.nextDouble();

        System.out.println("employee ID : "+emp.employee_ID);
        System.out.println("employee name : "+emp.name);
        System.out.println("employee designation : "+emp.designation);
        System.out.println("employee salary : "+emp.salary);
    }
}
