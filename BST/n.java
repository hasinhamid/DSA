public class n {
    public static void main(String[] args) {
        int[] arr={2,4,3,5,1,7,9,6,8};
        node root=build(null,arr);
        inO(root);
        System.out.println();
        root=rm(root,8);
        inO(root);
        // bst.PR(3, 7);
    }
    public static node rm(node root, int a){
        if(root==null){
            return null;
        }
        if(a>root.val){
            root.right=rm(root.right, a);
        }
        else if(a<root.val){
            root.left=rm(root.left, a);
        }
        else{
            if(root.left==null && root.right==null){
                return null;
            }
            else if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            int INS= inOSucc(root.right);
            root.val=INS;
            root.right=rm(root.right, INS);
        }
        return root;

    }
    public static int inOSucc(node root){
        while (root.left!=null) {
            root=root.left;
        }
        return root.val;
    }
    public static node build(node root,int [] arr){
        for(int i:arr){
            root=insert(root,i);
        }
        return root;
    }
    public static node insert(node root, int a){
        if(root==null){
            return new node(a);
        }
        if(root.val<a){
            root.right=insert(root.right, a);
        }
        else{
            root.left=insert(root.left, a);
        }
        return root;
    }
    public static void inO(node rt){
        if(rt==null){
            return;
        }
        inO(rt.left);
        System.out.print(rt.val+" ");
        inO(rt.right);
    }
}
class node{
        int val;
        node left,right;
        public node(int v){
            val=v;
            left=null;
            right=null;
        }
}
