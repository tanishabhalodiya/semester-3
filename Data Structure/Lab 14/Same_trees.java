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
// class Trees{
//     Node root1;
//     Node root2;

//     public boolean same_tree(Node root1,Node root2){
//         if (root1 == null && root2 == null){
//             return true;
//         }
//         if(root1==null || root2==null){
//             return false;
//         }
//        return ((root1.data==root2.data) && (same_tree(root1.left, root2.left)) && (same_tree(root1.right, root2.right)));
//     }
// }
public class Same_trees{
    public static boolean same_tree(Node root1,Node root2){
        if (root1 == null && root2 == null){
            return true;
        }
        if((root1.data==root2.data)){
            return ((same_tree(root1.left, root2.left)) && (same_tree(root1.right, root2.right)));
        }
        return false;
    }
    public static void main(String[] args) {
        // Trees tree = new Trees();
        Node root1=null;
        Node root2=null;
        
        //same tree
        // root1 = new Node(3);
        // root1.left = new Node(2);
        // root1.right = new Node(4);
        // root1.left.right = new Node(1);

        // root2 = new Node(3);
        // root2.left = new Node(2);
        // root2.right = new Node(4);
        // root2.left.right = new Node(1);

        //not same
        root1 = new Node(3);
        root1.left = new Node(2);
        root1.left.right = new Node(1);
        root1.right = new Node(4);

        root2 = new Node(3);
        root2.left = new Node(2);
        root2.left.left = new Node(1);
        root2.right = new Node(4);

        boolean flag=same_tree(root1,root2);


        if(flag){
            System.out.println("Given trees are SAME");
        }
        else{
            System.out.println("Given trees are NOT SAME");
        }
    }
}
