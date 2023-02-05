//general
//AVL tree => Adelson-Velsky and Landis tree
//AVL tree are balanced BST
//balance factor(BF) -> {-1,0,1} 
//BF = height(left-child) - height(right-child)
//unbalanced 4 types,
// 1) LL case  2) RR case 3)LR case 4)RL case
//each node in the AVL tree should have a balance factor of either {-1,0,1} => its balanced
//if BF of node in the AVL tree isnt balanced then its said to be a unbalanced tree(and should be balanced using LL,LR,RL,RR rotations)
//
public class avlTree {
    class node{
        int data;
        int height;
        node left,right;
        node(int val){
            data=val;
            left=right=null;
            height=0;
        }
    }
    node root;
    public int getHeight(node NODE){
        if(NODE==null) return -1;
        return NODE.height;
    }
    public avlTree(int val){
        root = new node(val);
    }
    public avlTree(){
        root=null;
    }
    public int max(int a,int b){
        return a>b?a:b;
    }
    public void insert(int val){
       root = insert(root,val);
    }
    public node insert(node NODE,int val){
        if(NODE==null) 
        {
            return new node(val);
        }
        if(val<NODE.data){
            NODE.left = insert(NODE.left, val);
        }
        else if(NODE.data<val){
            NODE.right = insert(NODE.right,val);
        }
        else{
            return NODE;
        }

        NODE.height=1+max(getHeight(NODE.left), getHeight(NODE.right));
        int balanceFactor = getBalanceFactor(NODE);
        //LL CASE
        if(balanceFactor>1 && val<NODE.left.data){
            return rightRotate(NODE);
        }
        //LR CASE
        if(balanceFactor>1 && val>NODE.left.data){
            NODE.left =  leftRotate(NODE.left);
            return rightRotate(NODE);
        }
        //RR CASE
        if(balanceFactor<-1 && val>NODE.right.data){
            return leftRotate(NODE);
        }
        //RL CASE
        if(balanceFactor<-1 && val<NODE.right.data){
            NODE.right = rightRotate(NODE.right);
            return leftRotate(NODE);
        }
        return NODE;
    }
    public node leftRotate(node NODE){
        node y = NODE.right;
        node t3 = y.left;

        y.left = NODE;
        NODE.right = t3;

        NODE.height = 1 + max(getHeight(NODE.left),getHeight(NODE.right));
        y.height = 1 + max(getHeight(y.left),getHeight(y.right));

        return y;
    }
    public node rightRotate(node NODE){
        node y = NODE.left;
        node t3 = y.right;
        
        y.right=NODE;
        NODE.left=t3;
        
        NODE.height = 1 + max(getHeight(NODE.left),getHeight(NODE.right));
        y.height = 1 + max(getHeight(y.left),getHeight(y.right));

        return y;
    }
    public int getBalanceFactor(node NODE)
    {
        if(NODE==null) return 0;
        return getHeight(NODE.left)-getHeight(NODE.right);
    }
    public void inOrder(node NODE){
        if(NODE!=null){
            inOrder(NODE.left);
            System.out.println(NODE.data);
            inOrder(NODE.right);
        }
    }
    public static void main(String[] args) {
        avlTree AVL = new avlTree(50);
        AVL.insert(20);
        AVL.insert(60);
        AVL.insert(10);
        AVL.insert(30);
        AVL.insert(40);
        AVL.inOrder(AVL.root);
    }
}
