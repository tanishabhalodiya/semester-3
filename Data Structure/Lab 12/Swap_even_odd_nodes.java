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
    int count=0;
    public void count(){
        Node temp=first;
        while(temp!=null){
            count++;
            temp=temp.link;
        }
        System.out.println();
        System.out.println("number of nodes : "+count);
    }
    public void swap_odd_even(){
       
        Node save=first;
        Node next=save.link;
        int c=0;
        Node temp;
        while(next!=null){
            System.out.println("save : "+save.data);
            System.out.println("next : "+next.data);
            temp=save;

            Node swap=next.link;
            next.link=save.link;
            save.link=swap;
            
            Node swapp=next;
            next=save;
            save=swapp;
           
            if(temp!=null){
                temp.link=next.link;
            }
            save=save.link;
            next=next.link;
            if(c==0){
                first=next;
            }
            c++;
        }
    }
}
public class Swap_even_odd_nodes{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Linked_list l=new Linked_list();
        
        l.insert_at_first(6);
        l.insert_at_first(5);
        l.insert_at_first(4);
        l.insert_at_first(3);
        l.insert_at_first(2);
        l.insert_at_first(1);

        l.display();
        l.count();
        l.swap_odd_even();
        System.out.println();
        System.out.println("after swapping odd nodes and even nodes the linked list is: ");
        l.display();
    }
}