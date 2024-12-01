import java.util.*;
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
    public void sort(){
		Node save=first;
		Node next;
		Node temp1;
        Node temp2=null;
        int count=0;
		while(save!=null){
			 next=save.link;
			 temp1=save;
			while(next!=null){
				//if data of save > next then it will be swapped in this condition
				if(save.data>next.data){
                    
					//swap both nodes or change the nodes
					Node swap=next.link;
					temp1.link=next.link;
					next.link=save;

                    //in first loop count is null then change FIRST
					if(count==0){
                        first=next;
						
					}
                    //otherwise increment temp2
                    else{
						temp2.link=next;
					}

					//Here our nodes are swapped that's why we have to change name of nodes
					Node swapp=save;
					save=next;
					next=swapp;

					//after swapping increment the nodes
					temp1=next;
					next=next.link;
				}
                else{
					temp1=next;
					next=next.link;
				}
                count++;
			}
			//if there is no any swapping then increment in both nodes
			temp2=save;
			save=save.link;
		}
	}


    // public void sort(){
    //     Node save=first;
    //     Node next;
    //     Node temp;
    //     int count=0;
    //     while(save!=null){
    //         next=save.link;
    //         temp=save;
    //         while(next!=null)
    //         {
    //             if(save.data>next.data)
    //             {
    //                 System.out.println("before save: "+save.data);
    //                 System.out.println("before next : "+next.data);
    //                 //swap both nodes
	// 				Node swap=next.link;
	// 				temp.link=next.link;
	// 				next.link=save;
    //                 // next.link=swap;

    //                 if(count==0){
    //                     first=next;
    //                 }
    //                 //nodes are swappe with name so now change the name of both nodes
    //                 Node swapp=save;
	// 				save=next;
	// 				next=swapp;

    //                 temp=save;
    //                 System.out.println("save : "+save.data);
    //                 System.out.println("next :"+next.data);
    //                 //after swapping increment the nodes
	// 				temp=next;
	// 				next=next.link;
    //             }
    //             else{
    //                 temp=next;
    //                 next=next.link;
    //             }
    //             count++;
    //         }
    //         save=save.link;
    //     }
    // }
}



public class P65_sort {

    public static void main(String[] args) {
        Linked_list l=new Linked_list();
        l.insert_at_first(2);
        l.insert_at_first(5);
        l.insert_at_first(3);
        l.insert_at_first(6);
        l.insert_at_first(1);
        l.insert_at_first(4);
        l.display();
        System.out.println();
        System.out.println("sorted linked list: ");
        l.sort();
        l.display();
    }
}
