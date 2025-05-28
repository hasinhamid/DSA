package Final.BT;

public class Tree {
    static class node{
        int val;
        node left,right;
        public node(int a){
            val=a;
        }
    }
    public Tree(){
        root=null;
    }
    public node root;
    public void b(int[] arr){
        root=built(arr);
    }
    static int idx=0;
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
    public void inOrder(){
        inP(root);
    }
    public void inP(node root){
        if(root==null){
            return;
        }
        inP(root.left);
        System.out.print(root.val);
        inP(root.right);

    }
}
