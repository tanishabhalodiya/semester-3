// import java.util.*;
class Linked_list
{
    class Node
    {
        int data;
        Node link;
    }
    Node first;
   

    //insert node at first position 
    public void insert_at_first(int x)
    {
        Node n1=new Node();
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
            System.out.print(temp.data+" ");
            temp=temp.link;
        }
    }
    Node pred;
    Node temp;
    Node save;
    public void reverse()
    {
        pred=null;
        Node save=first;
        temp=null;
        if (save==null) {
            System.out.println("already reverse");
        }
        while(save!=null)
        {
            temp=save.link;
            save.link=pred;
            pred=save;
            save=temp;  
        }
        first=pred;
    }
}
public class P64_reverseLinkedList
{
    public static void main(String[] args)
    {
        // Scanner sc=new Scanner(System.in);
        Linked_list l=new Linked_list();
        l.insert_at_first(5);
        l.insert_at_first(4);
        l.insert_at_first(3);
        l.insert_at_first(2);
        l.insert_at_first(1);
        l.display();
        System.out.println();
        System.out.println("Reverse linked list: ");
        l.reverse();
        l.display();
    }
}


