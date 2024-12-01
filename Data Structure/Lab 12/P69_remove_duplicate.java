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
    //insert node at first position 
    public void insert_at_first(int x)
    {
        Node n1=new Node(x);
        n1.data=x;
        n1.link=first;
        first=n1;
    }

    //display the linked list
    public void display()
    {
        Node temp=first;
        while(temp!=null)
        {
            System.out.print(temp.data+"  ->  ");
            temp=temp.link;
        }
    }
    //remove duplicates from sorted linked list
   public void remove_duplicate(){
    Node save=first;
    Node next=save.link;

    while (next!=null){
        if(save.data==next.data){
            save.link=next.link;
            next=next.link;
        }
        else{
            save=next;
            next=next.link;
        }
    }
}
}
public class P69_remove_duplicate{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Linked_list l=new Linked_list();
        l.insert_at_first(27);
        l.insert_at_first(27);
        l.insert_at_first(13);
        l.insert_at_first(13);
        l.insert_at_first(13);
        l.insert_at_first(6);
        l.insert_at_first(1);
        l.insert_at_first(1);
        l.display();
        System.out.println();
        System.out.println("After remove duplicates nodes from linked list is: ");
        l.remove_duplicate();
        l.display();
    }
}
