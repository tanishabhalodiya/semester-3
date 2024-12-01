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
    Node n1=new Node(0);
    
    
    public void insert_at_first(int x){
        
        n1.data=x;
        n1.link=first;
        first=n1;

    }


    public void display(){
        Node temp=first;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.link;
        }
    }



}
public class P59_same {
    Linked_list l1=new Linked_list();
    Linked_list l2=new Linked_list();
    Node first;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node n1=new Node();
        Linked_list l1=new Linked_list();
        Linked_list l2=new Linked_list();
        l1.insert_at_first(3);
        l1.insert_at_first(2);
        l1.insert_at_first(1);
        System.out.println("first linked list is : ");
        // l1.display();
        l2.insert_at_first(3);
        l2.insert_at_first(2);
        l2.insert_at_first(1);
        // l2.display();
        
        
     }
     compare();
    void compare(){
        Linked_list.Node temp1=l1.first;
        Linked_list.Node temp2=l2.first;

        while(temp1!=null && temp2!=null){
            if(temp1.data != temp2.data){
                System.out.println("Linked list are not same");
            }
            temp1=temp1.link;
            temp2=temp2.link;
        }
        if(temp1==null && temp2==null){
            System.out.println("both linked list are same");
        }
    }
}
