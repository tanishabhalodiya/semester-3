import java.util.*;
class Linked_list{
    class Node{
        int data;
        Node link;

        public Node(int data){
            this.data=data;
            this.link=null;
        }
    }
    Node first;
    public void insertAtFirst(int data){
        Node n1=new Node(data);
        n1.data=data;
        n1.link=first;
        first=n1;

    }
    public void display(){
        Node temp=first;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.link;
        }
    }
   
    public void nth_display(int n){
        Node save=first;
        Node next=first;
        int count=1;
        int result;
        while(save!=null){
            save=save.link;
            // next=save;
            if(count>n){
                next=next.link;
            }
            count++;
        }
        result= next.data;
        System.out.println(result);
    }
}
public class nthNode_from_last {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Linked_list ll=new Linked_list();
        ll.insertAtFirst(11);
        ll.insertAtFirst(25);
        ll.insertAtFirst(30);
        ll.insertAtFirst(42);
        ll.insertAtFirst(50);
        ll.insertAtFirst(61);
        ll.display();
        System.out.println();
        System.out.println("Enter value of n for get nth node: ");
        int n=sc.nextInt();
        System.out.println("nth node from last of linked list");
        ll.nth_display(n);

    }   
}
