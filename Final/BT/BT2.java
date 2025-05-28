package Final.BT;

public class BT2 {
    public static void main(String[] args) {
        node root=new node(1);
        root.left=new node(2);
        root.left.left=new node(4);
        root.left.right=new node(5);
        root.right=new node(3);
        node root1=new node(1);
        root1.left=new node(2);
        root1.left.left=new node(4);
        root1.left.right=new node(5);
        root1.right=new node(3);
        boolean t=s(root1,root);
        
        System.out.println(t);
    }
    public static boolean s(node r1,node r2){
        if(r1==null && r2==null){
            return true;
        }
        if(r1!=null && r2!=null){
            if(r1.val==r2.val){
                return s(r1.left, r2.left) && s(r1.right,r2.right);
            }
            else{
                return false;
            }
        }
        return false;
    }
}
class node{
    int val;
    node right,left;
    public node(int a){
        val=a;
    }
}