class binarySearchTree
{
    class node{
        int data;
        node left,right;
        node(int val){
            data=val;
            left=right=null;
        }
    }
    node root;
    //constructor
    public binarySearchTree(int val){
        root = new node(val); 
    }
    public binarySearchTree(){
        root = null;
    }
    //BST insert,delete,search,traversal methods
    public void insert(int val){
        insert(root,val);
    }
    //check whether the given val is > or < the root.data 
    public node insert(node r,int val){
        if(r==null){
            return new node(val);
        }
        if(val<r.data){
            r.left=insert(r.left,val);
        }else{
            r.right=insert(r.right,val);
        }
        return r;
    }
    //first -> root.left
    //second -> root.data
    //third -> root.right
    public void inOrder(node r){
        if(r!=null){
            inOrder(r.left);
            System.out.print(r.data+" ");
            inOrder(r.right);
        }
    }
    public node search(node r,int val){
        if(r==null || r.data==val){
            return r;
        }
        if(val<r.data){
            return search(r.left,val);
        }
        return search(r.right, val);
    }
    //deletion scenarios
    //leaf node -> make the parent point to null
    //node with one child -> link that one child to its parent
    //node with two child -> replace the node to be deleted with its inorder successor, then delete the inorder successor from its right subtree.
    public node delete(node r,int val){
        
        if(r==null){
            return r;
        }

        if(val<r.data){
           r.left = delete(r.left, val);
        }
        else if(val>r.data){
           r.right = delete(r.right,val);
        }
        else{
            if(r.left==null){
                return r.right;
            }
            else if(r.right==null){
                return r.left;
            }
            else{
                r.data = min(r.right);
                r.right = delete(r.right, r.data);
            }
        }

        return r;
    }
    public void delete(int val){
        root=delete(root,val);
    }
    public int min(node r){
        int minval = r.data;
        while(r.left!=null){
            minval = r.left.data;
            r=r.left;
        }
        return minval;
    }
    public node deleteTree(node r){
        return r.left=r.right=null;
    }
    public static void main(String[] args) {
        binarySearchTree bst = new binarySearchTree(0);
        bst.insert(bst.root,1);
        bst.insert(bst.root,2);
        bst.insert(bst.root,3);
        bst.insert(bst.root,4);
        bst.insert(bst.root,5);
        bst.insert(bst.root,6);
        bst.inOrder(bst.root);
        if(bst.search(bst.root, 7)!=null) System.out.println("\nfound");
        else System.out.println("\nnot found");
        bst.delete(4);
        bst.inOrder(bst.root);
        bst.deleteTree(bst.root);
        System.out.println();
        bst.inOrder(bst.root);
    }
}