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
public class Symmetric_trees {
    public static boolean symmetric(Node a,Node b){
        if (a == null && b == null){
            return true;
        }
        if((a.data==b.data)){
            return ((symmetric(a.left, b.right)) && (symmetric(a.right, b.left)));
        }
        return false;
    }
    public static void main(String[] args) {
        Node root=null;

        //symmetric tree
        // root = new Node(8);
        // root.left = new Node(5);
        // root.right = new Node(5);
        // root.left.left=new Node(3);
        // root.left.right = new Node(6);
        // root.right.left=new Node(6);
        // root.right.right=new Node(3);

        //not symmetric tree
        root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(7);
        root.left.left=new Node(3);
        root.left.right = new Node(6);
        root.right.left=new Node(6);
        root.right.right=new Node(3);

        boolean flag=symmetric(root,root);

        if(flag){
            System.out.println("Given trees are SYMMETRIC");
        }
        else{
            System.out.println("Given trees are NOT SYMMETRIC");
        }
    }
}
