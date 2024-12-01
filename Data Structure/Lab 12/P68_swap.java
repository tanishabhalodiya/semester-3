import java.util.*;
class Linked_list
{
    class Node{
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
            System.out.print(temp.data+" -> ");
            temp=temp.link;
        }
    }
    
   
    // swap two corresponding nodes
    public void swap()
    {
        Node pred=first; 
        Node save=first.link;
        Node temp=pred;
        int count=0;
       
        while(pred.link!=null){
            Node swap_node=save.link;
            save.link=pred;
            pred.link=swap_node;

            if(count==0){
                first=save;
                count++;
            }
            
            temp=pred;

            if(pred.link!=null){
                pred=pred.link;
                save=pred.link;
                temp.link=save;
            }
        }
    }

    //second method of swapping
    // public void swap(){
    //     int count=0;
    //     //START is empty node and FIRST node is behind this START node
    //     Node start=new Node();
    //     //START --> FIRST -->
    //     start.link=first;
    //     //temp points to START node
    //     Node temp=start;
    //     while(temp.link != null)
    //     {
    //         //take two consecutive nodes
    //         Node save1=temp.link;
    //         Node save2=temp.link.link;

    //         //swap this two nodes save1 and save2
    //         save1.link=save2.link;
    //         save2.link=save1;

    
    //         temp.link=save2;
    //         temp=save1;
    //         if(count==0){
    //             first=start.link;
    //             count++;
    //         }
    //     }
    // }
}

public class P68_swap{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Linked_list l=new Linked_list();
        l.insert_at_first(8);
        l.insert_at_first(7);
        l.insert_at_first(6);
        l.insert_at_first(5);
        l.insert_at_first(4);
        l.insert_at_first(3);
        l.insert_at_first(2);
        l.insert_at_first(1);
        l.display();
        System.out.println();
        System.out.println("after swapping correspoinding nodes the linked list is:");
        l.swap();
        l.display();
    }
}
