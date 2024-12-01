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
            System.out.print(temp.data+" ");
            temp=temp.link;
        }
    }
    int count=0;
    //count the nodes in the linked list
    public void count(){
        Node save=first;
        while(save!=null){
            count++;
            save=save.link;
        }
        System.out.println("Number of nodes: "+count);
    }
    int x=0;
    int y=0;
    int gcd=0;
    int temp;
    //add gcd of two correspoding nodes
    public void add_gcd()
    {
        Node new_n=new Node();
        Node save=first;
        Node pred=null;
        while(save!=null){
            pred=save;
            save=save.link;
            //x and y is value of two nodes

            x=pred.data;
            y=save.data;

            //finding minium from two nodes
            temp=Math.min(x,y);
            
            System.out.println("x : "+x);
            System.out.println("y : "+y);
            System.out.println("min : "+temp);

            while(temp>0){
                if(x%temp==0 && y%temp==0){
                    gcd=temp;
                }
                pred.link=new_n;
                new_n.link=save;
                new_n.data=gcd;
        
                temp--;
            }
            System.out.println("gcd : "+gcd);
            System.out.println("--------------------------------");
        }
    }
}
public class P67_gcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Linked_list l=new Linked_list();
        l.insert_at_first(3);
        l.insert_at_first(10);
        l.insert_at_first(6);
        l.insert_at_first(18);
        l.display();
        System.out.println();
        System.out.println("after adding gcd linked list is:");
        l.add_gcd();
        l.display();
    }
}
