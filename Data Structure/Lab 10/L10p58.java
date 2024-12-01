import java.util.*;
class Circularly_linked_list{
    class Node{
        int data;
        Node link;
    }
    Node first;
    Node last;
    
    public void insert(int x){
        Node n=new Node();

        if(first==null){
            n.data=x;
            n.link=first;
            last=n;
            first=n;
            return;
        }
        else{
            n.data=x;
            last.link=n;
            last=n;
            last.link=first;
            //System.out.println(last.data);
        }
    }
    public void display(){
        Node temp=first;
        int count=0;
        do{
            System.out.print(temp.data+" ");
            temp=temp.link;
            count++;
        }
        while(temp!=first);
        System.out.println("Number of Node is:"+count);
    }

}
public class L10p58 {
    public static void main(String[] args) {
        Circularly_linked_list l=new Circularly_linked_list();
        Scanner sc=new Scanner(System.in);
        l.insert(1);
        l.insert(2);
        l.insert(3);
        l.insert(4);
        l.insert(5);
        l.display();
        
    }
}
