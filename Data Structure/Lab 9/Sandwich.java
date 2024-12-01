import java.util.*;
public class Sandwich{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array number of students and sandwich:");
        int n = sc.nextInt();

        Stack<Integer> sandwich = new Stack<>();
        Deque<Integer> students = new ArrayDeque<>();
        System.out.print("Enter sandwich array :");
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            sandwich.push(s);
        }
        System.out.println("Sandwich : "+sandwich);

        System.out.print("Enter Student type:");
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            students.addLast(s);
        }
        // students.removeFirst();
        System.out.println("students : "+students);
        boolean flag = true;

        int count = 0;
        int temp=0;
        while (flag) {
        if (sandwich.peek() == students.peek()) {
            sandwich.pop();
            students.removeFirst();
            count++;
        } 
        else {
            students.addLast(students.removeFirst());
            temp++;
        }
        if(count==n || temp>n){
            flag=false;
        }
    }
        System.out.println("number of student which are not served sandwich : " + (n-count));
    }
}
