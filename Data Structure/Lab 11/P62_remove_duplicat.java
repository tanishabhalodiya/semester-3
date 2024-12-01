import java.util.*;

//remove duplicate elements from linked list
class Linked_list{
    Node first;
    class Node{
		int data;
		Node link;
		public Node(int data)
        {
			this.data=data;
			this.link=null;
		}
	}
    //insert a node in first position

    public void insert_at_first(int data)
    {
        Node n1=new Node(data);
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
    public void remove_duplicate()
    {
        Node save=first;
       
        while(save!=null)
        {
            Node temp=save.link;
            Node pred=save;
            while(temp!=null)
            {
                if(save.data==temp.data)
                {
                    //pred is node exact before 
                    pred.link=temp.link;
                    temp=temp.link;
                }
                else{
                    pred=temp;
                    temp=temp.link;
                }
            }
            save=save.link;
        }
    }
}
public class P62_remove_duplicat
{
    public static void main(String[] args)
    {
         Linked_list l=new Linked_list();
         l.insert_at_first(1);
         l.insert_at_first(2);
         l.insert_at_first(3);
         l.insert_at_first(1);
         l.insert_at_first(2);
         l.insert_at_first(1);
         l.display();
         l.remove_duplicate();
         System.out.println();
         System.out.println("after deleting duplicate element");
         l.display();
    }
}
