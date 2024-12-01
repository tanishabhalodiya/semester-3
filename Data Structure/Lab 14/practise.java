import java.util.*;
public class practise {
    static class Node
    {
    Node left;
    Node right;
    int data;
    public int val;

        //constructor of tree
        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node insert(Node root,int val)
    {
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            root.left = insert(root.left,val);
        }
        else{
            root.right = insert(root.right,val);
        }
        return root;
    }
    //inorder traversal : left root right
    public static void inorder(Node root)
    {
        if(root == null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static Boolean search(Node root,int key){
        // int data=key;
        // System.out.println("key : "+key);
        if(root==null)
        {
            return false;
        }
        if(root.data < key)
        {
            System.out.println("root.data : "+root.data);
            //we will go to right sub tree
            return search(root.right, key);
        }
        else if(root.data == key)
        {
            return true;
        }
        else if(root.data > key)
        {
            //we eill go to left sub tree
            return search(root.left, key);
        }
        return null;
    }
    public static void main(String[] args) {
       int array[]={5,1,3,4,2,7};
       Node root=null;
    //    Binary_tree bst=new Binary_tree();
       for(int i=0;i<array.length;i++)
       {
           root=insert(root , array[i]);
       }
       System.out.println("Inorder traversal of binary subtree is : ");
       inorder(root);
       System.out.println();
      
       if(search(root,4))
       {
        System.out.println("found");
       }
       else
       {
        System.out.println("not found");
       }
    }
}

