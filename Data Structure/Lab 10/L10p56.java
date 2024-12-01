class Node{
    int data;
    Node link;

}
class LinkedList{
    Node first;
    public void insertAtFirst(int data){
        Node n1=new Node();
        n1.data=data;
        n1.link=first;
        first=n1;

    }
    public void insertAtLast(int data){
        Node n1=new Node();
        Node temp=first;
        while(temp.link!=null){
            temp=temp.link;
        }
        temp.link=n1;
        n1.data=data;
    }
    public void display(){
        Node temp=first;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.link;
        }
    }
   
}
public class L10p56{
    public static void main(String[] args) {
        Node n1=new Node();
        LinkedList l=new LinkedList();
        System.out.println("Linked List is: ");
        l.insertAtFirst(20);
        l.insertAtFirst(15);
        l.insertAtFirst(10);
        l.insertAtLast(30);
        l.display();
    }
}
