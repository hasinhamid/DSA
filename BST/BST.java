public class BST {
    public static void main(String[] args) {
        int[] arr={2,4,3,5,1,7,9,6,8};
        SearchTree bst= new SearchTree(arr);
        bst.print();
        System.out.println();
        bst.rm(4);
        bst.print();
        System.out.println();
        bst.rm(3);
        bst.print();
        System.out.println();
        bst.PR(3, 7);
    }
}
class SearchTree{
    static class node{
        int val;
        node left,right;
        public node(int v){
            val=v;
            left=null;
            right=null;
        }
    }
    node root;
    public SearchTree(int[] arr){
        for(int i:arr){
            insert(i);
        }
    }
    public void insert(int val){
        root=insRec(root,val);
    }
    public node insRec(node rt,int v){
        if(rt==null){
            rt=new node(v);
        }
        if(rt.val>v){
            rt.left=insRec(rt.left, v);
        }
        if(rt.val<v){
            rt.right=insRec(rt.right, v);
        }
        return rt;
    }
    public void rm(int val){
        remove(root, val);
    }
    public node remove(node rt,int val){
        if(rt.val>val){     //rt>val
            rt.left=remove(rt.left, val);  
        }
        else if(rt.val<val){     //rt<val
            rt.right=remove(rt.right, val);
        }
        else{   // rt==vall
            if(rt.left==null && rt.right==null){    //1st case: last node
                return null;
            }
            if(rt.left==null){      //2nd case: 
                return rt.right;
            }
            else if(rt.right==null){     //2nd case:
                return rt.left;
            }
            else{
                node i=inOSucc(rt.right);
                rt.val=i.val;
                rt.right=remove(rt.right, i.val);
            }
        }
        return rt;
    }
    public node inOSucc(node rt){
        while (rt.left!=null) {
            rt=rt.left;
        }
        return rt;
    }
    public void print(){
        inO(root);
    }
    public void inO(node rt){
        if(rt==null){
            return;
        }
        inO(rt.left);
        System.out.print(rt.val+" ");
        inO(rt.right);
    }
    public void PR(int a,int b){
        printRange(root, a, b);
    }
    public void printRange(node root,int start,int finish){
        if(root==null){
            return;
        }
        if(root.val>=start && root.val<=finish ){
            printRange(root.left, start, finish);
            System.out.print(root.val+" ");
            printRange(root.right, start, finish);
        }
        else if(root.val<start){
            printRange(root.right, start, finish);
        }
        else{
            printRange(root.left, start, finish);
        }
    }

}
