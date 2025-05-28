package Final.BT;

public class BT3 {
    public static void main(String[] args) {
        // Create Tree1
        node tree1 = new node(6);
        tree1.left = new node(5);
        tree1.right = new node(9);
        tree1.left.left = new node(2);
        tree1.left.right = new node(3);

        // Create Tree2
        node tree2 = new node(6);
        tree2.left = new node(1);
        tree2.right = new node(4);
        tree2.left.left = new node(2);
        tree2.left.right = new node(7);

        int k = 3; // divisor

        // Update Tree1 based on Tree2 and divisor k
        node ans=update(tree1, tree2, k);

        // Print updated Tree1 (Pre-order traversal)
        System.out.println("Updated Tree1 (pre-order):");
        preorder(tree1);
    }

    // Recursive method to update tree1 based on tree2 and given k
    public static node update(node l,node r,int k){
        if(l==null && r==null){
            return l;
        }
        if(l.val == r.val){
            if(l.val%k==0){
                l.val=100;
            }
        }
        else{
            l.val+=r.val;
        }
        l.left=update(l.left,r.left,k);
        l.right=update(l.right, r.right, k);

        return l;
    }

    // Pre-order traversal to print tree
    public static void preorder(node root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }
}


// Node class
class node {
    int val;
    node left, right;
    node(int v) {
        val = v;
    }
}


