class Node{
    int data;
    Node link;
}
class Linked_list{
    Node first;
    
    public void Insert_at_first(int data){
        Node n=new Node();
        n.data=data;
        n.link=first;
        first=n;
    }

    public void display(){
        Node n=new Node();
        Node temp=first;
        while(temp==null){
            System.out.println(temp.data);
            temp.link=first;
        }
    }
    public void Insert_at_last(int data){
        Node n=new Node();
        Node temp=first;
        while(temp.link != null){
            temp=temp.link;
        }
        temp.link=n;
        n.data=data;
    }
}
public class LinkedList_56 {
    public static void main(String[] args) {
        Node n=new Node();
        Linked_list l=new Linked_list();
        l.Insert_at_first(5);
        l.Insert_at_first(3);
        l.Insert_at_first(4);
        l.display();
    }
}
