//points to remember
//child -> direct successor
//parent -> direct predecessor
//root -> a node with no parent
//sibling -> children of same parent
//leaf -> nodes with no child 
//non leaf nodes ->internal nodes
//each node has exactly one edge -> N nodes => N-1 edges
//ancestor -> any predecessor node on path from root to that node
//descendant -> any successor node on path from that node to a leaf node
//subtree -> containing a node of tree and all of its descendants
//level -> root-level0 -> each level has atmost 2^i nodes
//depth -> no of edges in path from root to that node
//height -> no of edges in longest path from the node to leaf => height = max level of the tree
//max no of nodes in a binary tree of height h => 2^(h+1)-1
//min no of nodes in a binary tree of height h => (h+1) nodes
//max height of a binary tree with n nodes is n-1


//types of binary tree
//1)full/proper/strict binary tree 
//      -> binary tree with 0 or 2 child - nodes
//      ->no of leaf nodes = no of internal nodes-1
//2)compelete binary tree 
//      ->all level except the last are completely filled and all nodes are as left as possible
//      -> height=[log nodes]
//3)perfect binary tree
//      ->all levels are compeletely filled in the perfect binary tree
//      ->all perfect binary tree are compelete binary tree
//4)degenerate binary tree
//      ->all internal nodes should have only one child
//5)balanced binary tree
//      ->absoulte difference between height of left and right sub tree for each node is maximum 1

//types of tree traversal
//          A
//         / \
//        B   C
//
//preorder -> root left right ->ABC
//inorder  -> left root right  ->BAC
//postorder -> left right root ->BCA
public class binaryTree {
    class node{
        int data;
        node left,right;
        node(int val){
            data=val;
            left=null;
            right=null;
        }
    }
    node root;
    binaryTree(int val){
        root=new node(val);
    }
    public void insertLeft(node r,int val){
        node newnode = new node(val);
        r.left=newnode;
    }
    public void insertRight(node r,int val){
        node newnode = new node(val);
        r.right=newnode;
    }
    public static void preOrder(node r){
        if(r!=null){
            System.out.println(r.data);
            preOrder(r.left);
            preOrder(r.right);
        }
    }
    public static void inOrder(node r){
        if(r!=null){
            inOrder(r.left);
            System.out.println(r.data);
            inOrder(r.right);
        }
    }
    public static void postOrder(node r){
        if(r!=null){
            postOrder(r.left);
            postOrder(r.right);
            System.out.println(r.data);
        }
    }
    public static void main(String[] args) {
        binaryTree tree = new binaryTree(10);
        tree.insertLeft(tree.root, 2);
        tree.insertRight(tree.root, 15);
        preOrder(tree.root);
        System.out.println();
        inOrder(tree.root);
        System.out.println();
        postOrder(tree.root);
    }
}
