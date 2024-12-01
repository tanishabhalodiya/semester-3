import java.util.*;
class Node{
    Node left;
    Node right;
    int data;
    // public int data;

    //constructor of tree
    public Node(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class Binary_tree
{
    Node root;

    //insert the node in tree
    public Node insert(Node root,int key){
        //we will create ROOT node if tree is empty
        if(root==null)
        {
            root=new Node(key);
            return root;
        }
        //if data is less then root
        if(key < root.data)
        {
            root.left=insert(root.left, key);
        }

        //if data is greater then root
        else if(key > root.data)
        {
            root.right=insert(root.right, key);
        }
        return root;
    }
    //search a node in binary search tree
    public Boolean search(Node root,int key){
        if(root==null)
        {
            return false;
        }
        if(root.data == key)
        {
            System.out.println("root.data : "+root.data);
            return true;
        }
        else if(root.data < key)
        {
            return search(root.right, key);
        }
        else
        {
            return search(root.left, key);
        }
    }
    
    //delete node from tree
    public Node delete(Node root , int key){
        if(root==null){
            return root;
        }
        //first we will find the node what we want to delete
        if(root.data > key){
            //our node will be in left sub tree
            root.left = delete(root.left, key);
        }
        else if(root.data < key){
            //our node will be in right sub tree
            root.right= delete(root.right, key);
        }
        //we found node  if(root.data==key)
        //now we delete the node 
        else
        {
            System.out.println("node is found");
            //case = 1
            //if our node is last node(no child=leaf node)
            if(root.left == null && root.right == null)
            {
                System.out.println("delete root : "+root.data);
                return null;
            }
            //case = 2
            //node has only one child left child then we will delete it
            //return next child of right side
            if(root.left==null)
            {
                return root.right;
            }
            //node has only one child right child then we will delete it
            //return next child of left side
            else if(root.right==null)
            {
                return root.left;
            }
            //case = 3
            //node has two child
            //we will replace this with left most node with right sub tree
            Node next=successor(root.right);
            //replace with node
            root.data=next.data;
            root.right = delete(root.right,next.data);
            
        }
        return root;
    }
    public Node successor(Node root){
        //finding smallest node 
        while(root.left != null)
        {
            root=root.left;
        }
        return root;
    }
    //inorder traversal : left root right
    public void inorder(Node root)
    {
        if(root == null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    //preorder traversal : root left right
    public void preorder(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    //postorder traversal : left right root
    public void postorder(Node root)
    {
        if(root == null)
        {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }                        
}
public class Binary_search_tree {
    public static void main(String[] args){
        int array[]={8,3,10,1,6,4,7,14,13,20};
        Node root=null;
        Binary_tree bst=new Binary_tree();
        for(int i=0;i<array.length;i++)
        {
            root=bst.insert(root,array[i]);
        }
        System.out.println("Inorder traversal of binary subtree is : ");
        bst.inorder(root);
        System.out.println();
        // System.out.println("Preorder traversal of binary subtree is : ");
        // bst.preorder(root);
        // System.out.println();
        // System.out.println("Postorder traversal of binary subtree is : ");
        // bst.postorder(root);
        // System.out.println();
        bst.delete(root,3);
        bst.inorder(root);

        // boolean flag = bst.search(root,4);
        // System.out.println("node is : "+flag);
    }
}