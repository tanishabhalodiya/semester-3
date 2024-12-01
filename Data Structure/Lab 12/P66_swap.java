import java.util.*;
//swap kth node from beginning with kth node from end
class Linked_list{
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

    //swap number kth from begining with ends
    int k;
    public void swap(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter k for swapping number");
        k=sc.nextInt();
        if(k>count){
            System.out.println("Value of k is not valid");
        }
        Node a=first;
        Node temp=null;

        for(int i=1;i<k;i++){
            temp=a;
            a=a.link;
        }
        System.out.println("k : "+k);
        Node b=first;
        int n=count-k+1;
        System.out.println("n: "+n);

        for(int i=1;i<n;i++){
            temp=b;
            b=b.link;
            // System.out.println("b : "+b.data);
        }
        System.out.println("a : "+a.data);
        System.out.println("b : "+b.data);
        //s is temparory variable for swapping

        int s=0;
        s=a.data;
        a.data=b.data;
        b.data=s;
        System.out.println("after swap a and b values are : ");
        System.out.println("a : "+a.data);
        System.out.println("b : "+b.data);
        }
    }

public class P66_swap {
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
        System.out.println();
        l.count();
        
        // System.out.println("value of k is : "+k);
        l.swap();
        System.out.println("swapped linked list: ");
        l.display();
    }
}
