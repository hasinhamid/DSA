package Final.BST;

class Node {
    int val;
    Node left, right;
    Node(int val) {
        this.val = val;
        left = right = null;
    }
}

public class T1 {
    // Sample BST builder (from the image)
    public static Node buildSampleTree() {
        Node root = new Node(30);
        root.left = new Node(15);
        root.right = new Node(40);
        root.left.left = new Node(9);
        root.left.right = new Node(20);
        root.left.left.left = new Node(7);
        root.right.left = new Node(35);
        root.right.right = new Node(45);
        root.right.left.left = new Node(32);
        return root;
    }

    // Stub for calculate_energy
    public static Object calculate_energy(Node root, int destination) {
        if(root==null){
            return "not found";
        }
        if(root.val==destination){
            return root.val;
        }
        if(root.val<destination){
            return root.val*(int)calculate_energy(root.right, destination);
        }
        if(root.val>destination){
            return root.val*(int)calculate_energy(root.left, destination);
        }
        return 0;

    }

    public static void main(String[] args) {
        Node root = buildSampleTree();
        int destination = 35;
        Object result = calculate_energy(root, destination);
        System.out.println("Result for destination " + destination + ": " + result);
    }
}
