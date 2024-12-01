import java.util.*;
class Node{
    int data;
    Node link;

}
class LinkedList{
    Node first;
    public void insert_at_first(int x){
        Node n1=new Node();
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
    public void insert_at_last(int x){
        Node n1=new Node();
        Node temp=first;
        while(temp.link!=null){
            temp=temp.link;
        }
        temp.link=n1;
        n1.data=x;
    }
    public void delete_at_first(){
        if(first==null){
            System.out.println("Stack Underflow");
        }
        else{
            Node save=first;
            first=first.link;
            save=null;
        }
    }
    public void delete_at_last(){
        if(first==null){
            System.out.println("Stack underflow");
        }
       Node pre=null;
        Node save=first;
        while(save.link!=null){
           pre=save;
            save=save.link;
            
        }
        pre.link=null;
    }
    public void delete_at_index(int x){
        if(first==null){
            System.out.println("Stack underflow");
        }
        
        Node pre=null;
        Node save=first;
        while(save!=null && save.data!=x){
            pre=save;
            save=save.link;
        }
        if(save==null){
            System.out.println("Number not found");
        }
        pre.link=save.link;
    }
    public void insert_at_order(int x){
        Node n1=new Node();
        if(first==null){
             n1.data=x;
             first=n1;
             return;
        }
        //insert at first position
        else if(x<=first.data){
            n1.link=first;
            n1.data=x;
            first=n1;
            return;
        }
        else{
        Node save=first;
        while((save.link!=null) && (x>=(save.link.data))){
            save=save.link;
        }
        n1.data=x;
        n1.link=save.link;
        save.link=n1;
    }
    }

    int count=0;
    public int count_nodes(){
        
        if(first==null){
            count=0;
        }
        Node save=first;
        while(save.link!=null){
            save=save.link;
            count++;
        }
        return count;
    }

    public int copy_linked_list(){

    }
}

public class L10p57{
    public static void main(String[] args) {
        Node n1=new Node();
        Scanner sc=new Scanner(System.in);
        LinkedList l=new LinkedList();
       
        System.out.println("Enter 1 for insert node at the front of the linked list,2 for insert node at the end of the linked list,3for delete first node,4 for delete last node,5 for delete node from specified position,6 for display the linked list and 7 for leave this code ");
        int n=0;
        int x;
        
        while(n!=7){
            System.out.println("Enter 1 for insert node at the front of the linked list,2 for insert node at the end of the linked list,3for delete first node,4 for delete last node,5 for delete node from specified position,6 for display the linked list ,7 for count nodes and 8 for leave this code ");

            n=sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Enter x :");
                x=sc.nextInt();
                l.insert_at_first(x);
                break;
            case 2:
                System.out.println("Enter x :");
                x=sc.nextInt();
                l.insert_at_last(x);
                break;
            case 3:
                l.delete_at_first();
                break;
            case 4:
                l.delete_at_last();
                break;
            case 5:
                System.out.println("Enter index x for deletaion :");
                x=sc.nextInt();
                l.delete_at_index(x);
                
                break;
            case 6:
                System.out.println("Enter x :");
                x=sc.nextInt();
                l.insert_at_order(x);
                break;
            case 7:
                System.out.println("Number of nodes in linear linked list is : ");
                l.count_nodes();
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("Linked List is: ");
                l.display();
                break;
        }
    }
}
}
    

