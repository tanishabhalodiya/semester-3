import java.util.Scanner;
//remove alternate nodes doubly linked list
class Doubly_linkedlist
{
    class Node{
        int data;
        Node lptr;
        Node rptr;

        public Node(int data){
            this.data=data;
            this.lptr=null;
            this.rptr=null;
        }
    }
    Node first;
    Node last;
    static int count=0;
    //insert a node at first in doubly linked list
    public void insert_at_first(int x){
        Node new_n=new Node(x);
        if(first==null){
            first=last=new_n;
            count++;
            return;

        }
        else{
            new_n.rptr=first;
            first.lptr=new_n;
            first=first.lptr;
            count++;
        }
    }
    //insert a node in the last of linked list
    public void insert_at_last(int x){
        Node new_n=new Node(x);
        if(last==null){
            first=last=new_n;
            count++;
            return;
        }
        else{
            new_n.lptr=last;
            last.rptr=new_n;
            last=last.rptr;
            count++;
        }
    }

    //Delete a node from specified position
    public void delete_alternate(){
        //we are deleting NEXT here
        Node save=first;
        if(first==null){
            System.out.println("linked list is empty");
        }
        while(save!=null && save.rptr!=null){
            Node next=save.rptr;
           save.rptr=next.rptr;
           if(next.rptr!=null){
                next.rptr.lptr=save;
           }
           save=save.rptr;
        }
      
    }
    //display all the nodes from first to last
    public void display1(){
        Node temp=first;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.rptr;
        }
      
    }
    //display all nodes from last to first
    public void display2(){
        Node temp=last;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.lptr;
        }
        System.out.println();
        System.out.println("Count is : "+count);
    }

}
public class P73_delete_alternate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Doubly_linkedlist dl=new Doubly_linkedlist();
        dl.insert_at_first(3);
        dl.insert_at_first(2);
        dl.insert_at_first(1);
        dl.insert_at_first(0);
        dl.insert_at_last(4);
        dl.insert_at_last(5);
        dl.insert_at_last(6);
        System.out.println();
        dl.display1();
        System.out.println();
        System.out.println("After deleting alternate nodes");
        dl.delete_alternate();
        dl.display1();
    }
}
