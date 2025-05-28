public class BT5 {
    // Recursive OddSwap function
    public static void OddSwap(Node root) {
        OddSwapHelper(root, 1);
    }

    private static void OddSwapHelper(Node node, int level) {
        if (node == null) return;
        if (level % 2 == 1 && node.left != null && node.right != null) {
            if (node.right.data > node.left.data) {
                // Swap the left and right child nodes
                Node temp = node.left;
                node.left = node.right;
                node.right = temp;
            }
        }
        OddSwapHelper(node.left, level + 1);
        OddSwapHelper(node.right, level + 1);
    }

    // Print tree in level order for verification
    public static void printLevelOrder(Node root) {
        int h = height(root);
        for (int i = 1; i <= h; i++) {
            printGivenLevel(root, i);
            System.out.println();
        }
    }

    private static int height(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    private static void printGivenLevel(Node root, int level) {
        if (root == null) return;
        if (level == 1) {
            System.out.print(root.data + " ");
        } else {
            printGivenLevel(root.left, level - 1);
            printGivenLevel(root.right, level - 1);
        }
    }

    public static void main(String[] args) {
        // Build the sample tree
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(8);
        root.left.left = new Node(1);
        root.left.right = new Node(6);

        System.out.println("Before OddSwap:");
        printLevelOrder(root);

        swap(root);

        System.out.println("After OddSwap:");
        printLevelOrder(root);
    }
    public static void swap(Node root){
        if(root==null){
            return ;
        }
        if(level(root, root.data)%2==0){
            if (root.left!=null && root.right!=null) {
                if(root.left.data<root.right.data){
                int temp=root.left.data;
                root.left.data=root.right.data;
                root.right.data=temp;
                }
            }
            
        }
        swap(root.left);
        swap(root.right);
    }
    public static int level(Node root,int val){
        if(root==null){
            return -1;
        }
        if(root.data==val){
            return 0;
        }
        int l=level(root.left, val);
        int r=level(root.right, val);
        if(l!=-1){
            return l+1;
        }
        if(r!=-1){
            return r+1;
        }
        return -1;
    }
}
class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
    }
}
