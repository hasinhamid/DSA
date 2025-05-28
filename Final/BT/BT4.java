public class BT4{
    public static void main(String[] args) {
        // Create tree from image:
        //        1
        //      /   \
        //     7     9
        //    / \     \
        //   2   6     9
        //      / \    /
        //     5  11  5
        BT root = new BT(1);
        root.left = new BT(7);
        root.right = new BT(9);
        root.left.left = new BT(2);
        root.left.right = new BT(6);
        root.right.right = new BT(9);
        root.left.right.left = new BT(5);
        root.left.right.right = new BT(11);
        root.right.right.left = new BT(5);
        int sum= maxSum(root);
        System.out.println("Maximum path sum: " + sum);
    }
    public static int maxSum(BT root){
        if(root==null){
            return 0;
        }
        return root.elem + Math.max(maxSum(root.left),maxSum(root.right));
    }
}
class BT{
    int elem;
    BT left,right;
    public BT(int a){
        elem=a;
    }

}
