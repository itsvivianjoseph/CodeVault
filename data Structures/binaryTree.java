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

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class binaryTree {
    
    // node def
    class node{
        int data;
        node left,right;
        node(int val){
            data=val;
            left=null;
            right=null;
        }
    }
    
    class Pair{
        node root;
        int num;
        Pair(node Node,int val){
            root = Node;
            num = val;
        }
    }

    // root initialized
    node root;
    
    // constructor
    binaryTree(int val){
        root=new node(val);
    }

    //left insertion
    public void insertLeft(node r,int val){
        node newnode = new node(val);
        r.left=newnode;
    }

    //right insertion
    public void insertRight(node r,int val){
        node newnode = new node(val);
        r.right=newnode;
    }

    //preorder traversal - recursion
    static void preOrder(node r){
        if(r!=null){
            System.out.println(r.data);
            preOrder(r.left);
            preOrder(r.right);
        }
    }

    // preorder traversal - iterative
    static List<Integer> preOrderIterative(node r){
        List<Integer> preorder = new ArrayList<>();
        if(r==null) return preorder;
        Stack<node> st = new Stack<>();
        st.push(r);
        while(!st.empty()){
            r = st.pop();
            preorder.add(r.data);
            if(r.right!=null) st.push(r.right);
            if(r.left!=null) st.push(r.left);
        }
        return preorder;
    }

    // inorder traversal - recursive
    public static void inOrder(node r){
        if(r!=null){
            inOrder(r.left);
            System.out.println(r.data);
            inOrder(r.right);
        }
    }
    
    // inorder traversal - iterative
    // tc - O(N)
    // sc - O(N)
    static List<Integer> inOrderTraversal(node r) {
    List<Integer> inOrder = new ArrayList<>();
    Stack<node> st = new Stack<>();
    node currentNode = r;
    
    while (currentNode != null || !st.isEmpty()) {
        if (currentNode != null) {
            st.push(currentNode);
            currentNode = currentNode.left;
        } else {
            currentNode = st.pop();
            inOrder.add(currentNode.data);
            currentNode = currentNode.right;
        }
    }
    return inOrder;
    }
    
    //postorder traversal = recursive
    public static void postOrder(node r){
        if(r!=null){
            postOrder(r.left);
            postOrder(r.right);
            System.out.println(r.data);
        }
    }
    
    //postorder traversal- iterative
    static List<Integer> postOrderIterative(node r){
        Stack<node> st1 = new Stack<>();
        Stack<node> st2 = new Stack<>();
        List<Integer> postorder = new ArrayList<>();

        if(r==null) return postorder;

        st1.push(r);

        while(!st1.isEmpty()){
            r = st1.pop();
            st2.add(r);
            if(r.left!=null) st1.push(r.left);
            if(r.right!=null) st1.push(r.right);
        }

        while(!st2.isEmpty()){
            postorder.add(st2.pop().data);
        }

        return postorder;
    }

    // all preorder ,inorder , postorder in one traversal
    // tc - O(3N)     
    // sc - O(4N)
    public void preInPostOrder(node r){
        Stack<Pair> st = new Stack<>();
        st.push(new Pair(r, 1));
        List<Integer> preorder = new ArrayList<>();
        List<Integer> inorder = new ArrayList<>();
        List<Integer> postorder = new ArrayList<>();
        
        if(r==null) return;

        while(!st.isEmpty()){
            Pair it = st.pop();

            if(it.num==1){
                preorder.add(it.root.data);
                it.num++;
                st.push(it);
                if(it.root.left!=null) st.push(new Pair(it.root.left, 1));
            }

            else if(it.num==2){
                inorder.add(it.root.data);
                it.num++;
                st.push(it);
                if(it.root.right!=null) st.push(new Pair(it.root.right, 1));
            }

            else{
                postorder.add(it.root.data);
            }
        }
        System.out.println("preorder");
        for (Integer integer : preorder) {
            System.out.print(" "+integer);
        }
        System.out.println();
        System.out.println("\ninorder");
        for (Integer integer : inorder) {
            System.out.print(" "+integer);
        }
        System.out.println();
        System.out.println("\npostorder");
        for (Integer integer : postorder) {
            System.out.print(" "+integer);
        }
    }     

    //level order traversal
    // tc - O(N)
    // sc - O(N)
    static List<List<Integer>> levelOrder(node tree) {
        Queue<node> q = new LinkedList<>();
        List<List<Integer>> wrapList = new LinkedList<>();

        if(tree==null) return wrapList;

        q.offer(tree);        

        while(!q.isEmpty()){
            int levelNumber = q.size();
            List<Integer> subList = new LinkedList<>();

            for(int i=0;i<levelNumber;i++){
                node currentNode = q.poll();
                subList.add(currentNode.data);

                if(currentNode.left!=null) q.offer(currentNode.left);
                if(currentNode.right!=null) q.offer(currentNode.right);
            }
            wrapList.add(subList);
        }
        return wrapList;
    }

    public static void main(String[] args) {
        binaryTree tree = new binaryTree(10);
        
        tree.insertLeft(tree.root, 2);
        tree.insertRight(tree.root, 15);
        tree.insertLeft(tree.root.left, 21);
        tree.insertRight(tree.root.left, 150);

        preOrder(tree.root);
        System.out.println();
        inOrder(tree.root);
        System.out.println();
        postOrder(tree.root);
        
        System.out.println("\nLevel Order traversal");
        List<List<Integer>> res = levelOrder(tree.root);
        for (List<Integer> list : res) {
            for (int i = 0; i < list.size(); i++) System.out.print(" " + list.get(i));
            System.out.println();
        }
        
        System.out.println("PreOrder traversal");
        List<Integer> preorder = preOrderIterative(tree.root);
        for (Integer integer : preorder) {
            System.out.print(" " + integer);
        }
        
        System.out.println("\nInorder Order traversal");
        List<Integer> inorder = inOrderTraversal(tree.root);
        for (Integer integer : inorder) {
            System.out.print(" " + integer);
        }
        
        System.out.println("\nPostorder Order traversal");
        List<Integer> postorder = postOrderIterative(tree.root);
        for (Integer integer : postorder) {
            System.out.print(" " + integer);
        }

        System.out.println("\nPreOrder InOrder PostOrder in one traversal");
        tree.preInPostOrder(tree.root);
    }

}