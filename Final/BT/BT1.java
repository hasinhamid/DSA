package Final.BT;

public class BT1 {
    public static void main(String[] args) {
        node root=new node(5);
        root.left=new node(7);
        root.left.left=new node(3);
        root.right=new node(9);
        root.right.right=new node(6);
        root.right.left=new node(2);
        root.right.right.left=new node(5);
        int sum= s(root);
        System.out.println(sum);
    }
    public static int s(node root){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 0;
        }
        if(root.left!=null && root.right!=null){
            return s(root.left)+s(root.right);
        }
        if(root.right==null){
            if(root.left.left==null){
                return root.val;
            }
        }
        return s(root.right);
        
    }


}
class node{
    int val;
    node right,left;
    public node(int a){
        val=a;
    }
}

