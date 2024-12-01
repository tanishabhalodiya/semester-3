import java.util.*;
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
    public void delete(int index){
        Node save=first;
        // Node pred=null;
        int i;
        if(first==null){
            System.out.println("linked list is empty");
        }
        if(index==1){
            first=first.rptr;
            return;
        }
        else if(index==count){
            last.lptr.rptr=null;
        }
        else if(index>count){
            System.out.println("enter valid index ");
        }
        else{
            for(i=1;save!=null && i<index;i++){
                save=save.rptr;
            }
            save.lptr.rptr=save.rptr;
            save.rptr.lptr=save.lptr.rptr;
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
public class P72_doubly_linked_list {
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
        System.out.println("Doubly linked list from first to last: ");
        dl.display1();
        System.out.println();
        System.out.println("doubly linked list from last to first: ");
        dl.display2();
        System.out.println();
        System.out.println("Enter number of position for delete element: ");
        int index=sc.nextInt();
        dl.delete(index);
        dl.display1();
    }
}
