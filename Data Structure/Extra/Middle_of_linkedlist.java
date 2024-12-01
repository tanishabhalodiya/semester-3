import java.util.*;
//find middle node of linked list with only one while loop and two pointer nodes
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
   
    public void find_middle()
    {
        //save jupms one time
        //next jumps two times
        Node save=first;
        Node next=first;
        int result;
        while(save!=null && next!=null){
            next=next.link.link;
            save=save.link;
        }
        result=save.data;
        System.out.println(result);
    }
}
public class Middle_of_linkedlist {
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
        System.out.println("middle element of linked list: ");
        ll.find_middle();
    }
}
