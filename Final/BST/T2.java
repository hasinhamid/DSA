package Final.BST;

class Node {
    int val;
    Node left, right;
    Node(int val) {
        this.val = val;
        left = right = null;
    }
}

public class T2 {
    // Build the sample BST from the image
    public static Node buildSampleTree() {
        Node root = new Node(8);
        root.left = new Node(3);
        root.right = new Node(10);
        root.left.left = new Node(1);
        root.left.right = new Node(6);
        root.left.right.left = new Node(4);
        root.left.right.right = new Node(7);
        root.right.right = new Node(14);
        root.right.right.left = new Node(13);
        return root;
    }

    // Helper class to keep track of count and sum
    static class Counter {
        int count = 0;
        int sum = 0;
    }

    // Returns the sum of k smallest nodes using only recursion
    public static int smallest_sum(Node root, int k) {
        Counter counter = new Counter();
        smallest_sum_helper(root, k, counter);
        return counter.sum;
    }

    // Recursive inorder traversal
    private static void smallest_sum_helper(Node node, int k, Counter counter) {
        if (node == null || counter.count >= k) return;
        smallest_sum_helper(node.left, k, counter);
        if (counter.count < k) {
            counter.sum += node.val;
            counter.count++;
        }
        smallest_sum_helper(node.right, k, counter);
    }

    public static void main(String[] args) {
        Node root = buildSampleTree();
        int[] ks = {3, 5, 6};
        for (int k : ks) {
            int result = smallest_sum(root, k);
            System.out.println("Sum of " + k + " smallest nodes: " + result);
        }
    }
}
