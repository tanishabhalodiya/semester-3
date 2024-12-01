import java.util.*;
class Circular_linkedlist
{
    class Node{
        int data;
        Node link;

        public Node(int data){
            this.data=data;
            this.link=null;
        }
    }
    Node first;
    Node last;


    //inesert the node at first position of circular linked list
    public void Cir_insert_at_first(int x)
    {
        Node new_n=new Node(x);
        new_n.data=x;
        if(first==null)
        {
            new_n.link=new_n;
            first=new_n;
            last=new_n;
        }
        else
        {
            new_n.link=first;
            last.link=new_n;
            first=new_n;
        }
    }
    
    //indert a node at last of circular linked list
    public void Cir_insert_at_last(int x)
    {
        Node new_n=new Node(x);
        new_n.data=x;
        if(last==null)
        {
            new_n.link=new_n;
            last=new_n;
            first=new_n;
        }
        else
        {
            new_n.link=first;
            last.link=new_n;
            last=new_n;
        }
    }

    //display the circular linked list
    public void display(){
        Node temp=first;
        do {
            System.out.print(temp.data+" ");
            temp=temp.link;
        } while (temp!=first);
    }

    //delete a specified node from circular linked list
    public void delete(int x){
        Node save=first;
        Node pred=save;
        if(first==null){
            System.out.println("Linked list is empty");
        }
        // save=save.link;
        while(save.data!=x && save!=last){
            pred=save;
            save=save.link;
        }
            if(save.data != x){
                System.out.println("Node not found");
            }
            else if(x==first.data){
                first=first.link;
                last.link=first;
            }
            else if(x==last.data){
               pred.link=save.link;
               last=pred;
            }
            else{
                pred.link=save.link;
                save=null;
            }
    }
}
public class P71_circular_linkedlist
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Circular_linkedlist cl=new Circular_linkedlist();
        cl.Cir_insert_at_first(1);
        cl.Cir_insert_at_last(2);
        cl.Cir_insert_at_first(0);
        cl.Cir_insert_at_last(3);
        cl.display();
        cl.delete(3);
        System.out.println();
        cl.display();
    }
}
