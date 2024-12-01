import java.util.*;
class Linked_List{
	Node first;
	class Node{
		int data;
		Node link;
		public Node(int data){
			this.data=data;
			this.link=null;
		}
	}
	//ins_At_First method of LinkedList named push
	public void push(int data){
		Node n1=new Node(data);
		n1.link=first;
		first=n1;
	}

	
	//deleteAtFirst like as pop
	public void pop(){
		if(first==null){
			System.out.println("stack Underflow:");
		}
		else{
			Node save=first;
			first=first.link;
			save=null;
		}
	}

	//travel method or display 
	public void display(){
		Node temp=first;
		int i=0;
		while(temp!=null){
			System.out.print(" n["+i+"]= "+temp.data);
			temp=temp.link;
			i++;
		}
		System.out.println();
	}
}
public class P60_stack_using_list{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//int a[]=new int[5];
		Linked_List obj=new Linked_List();
		obj.push(44);
		obj.push(33);
		obj.push(22);
		obj.push(11);
		obj.display();
		obj.pop();
		obj.display();
		
		
	}
}