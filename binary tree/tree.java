import java.util.*;
public class tree {
    public static void main(String[] args) {


        /*
         *          1
         *      2       3   
         *  4   5           6
         */

        int[] n={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        btree tr= new btree();
        tr.preorderTreeBuilt(n);
        System.out.println(tr.root.val);
        tr.preorderTrevarsal();
        System.out.println();
        tr.inorderTrevarsal();
        System.out.println();
        tr.postorderTrevarsal();
        System.out.println();
        tr.loT();

    }
}

//DFS:
//preorder (root->left->right)
//inorder   (left->root->right)
//postorder (left->right->root)

//BFS:
//level Order(use queue)
class btree{
    static class node{
        int val;
        node right;
        node left;
        public node(int v){
            val=v;
            right=null;
            left=null;
        }
    }
    node root;
    int idx=0;
    //preorder
    public void preorderTreeBuilt(int[] arr){
        root=built(arr);
    }

    public node built(int[]arr){   //preorder making    
        if(idx>=arr.length||arr[idx]==-1){
            idx++;
            return null;
        }
        node nnode= new node(arr[idx++]);        //1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1
        nnode.left=built(arr);
        nnode.right=built(arr);
        return nnode;
    }

    public void preorderTrevarsal(){
        preTrevarse(root);
    }
    public void preTrevarse(node n){
        if(n==null){
            return;
        }
        System.out.print(n.val+" ->");
        preTrevarse(n.left);
        preTrevarse(n.right);
    }

    //postorder

    public void inorderTrevarsal(){
        inT(root);
    }
    public void inT(node n){
        if(n==null){
            return;
        }
        inT(n.left);
        System.out.print(n.val+"->");
        inT(n.right);
    }

    //post order
    public void postorderTrevarsal(){
        poT(root);
    }
    public void poT(node n){
        if(n==null){
            return;
        }
        poT(n.left);
        poT(n.right);
        System.out.print(n.val+"->");
    }

    //BFS
    // level order 

    
    public void loT(){
        Queue<node> que= new LinkedList<>();
        que.add(root);
        que.add(null);
        while (!que.isEmpty()) {
            node ptr= que.remove();
            if(ptr!=null){
                if(ptr.left!=null){
                    que.add(ptr.left);
                }
                if(ptr.right!=null){
                    que.add(ptr.right);
                }
                System.out.print(ptr.val+"->");
            }
            else{
                System.out.println();
                if (!que.isEmpty()) {
                    que.add(null);
                }
                
            }
            
        }
    }
    
     
}
