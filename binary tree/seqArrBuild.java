public class seqArrBuild {
    public static void main(String[] args) {
        Integer []arr={1,2,3,4,5,6};
        node root=build(arr, 0);
        preorder(root);
        System.out.println();
        // System.out.println(count(root));
        System.out.println(diameter(root));

    }
    //depth
    public static int depth(node root,int tar){
        if (root==null) {
            return -1;
        }
        if(root.val==tar){
            return 0;
        }
        int l=depth(root.left, tar);
        int r=depth(root.right, tar);
        if(l!=-1){
            return l+1;
        }
        if(r!=-1){
            return 1+r;
        }
        return -1;
    }
    public static int diameter(node root){
        if (root==null) {
            return 0;
        }
        int dia=height(root.left)+height(root.right)+1;
        int diaL=diameter(root.left);
        int diaR=diameter(root.right);
        return Math.max(dia,Math.max(diaL, diaR));


    }
    //height
    public static int height(node root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(height(root.left),height(root.right));
    }
    //sum
    public static int sum(node root){
        if(root==null){
            return 0;
        }
        return root.val+sum(root.left)+sum(root.right);
    }
    public static void preorder(node root){
        if (root==null){
            return;
        }
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    } 
    //seqArrBuild
    public static node build(Integer[] arr,int i){
        if(i>=arr.length || arr[i]==null){
            return null;
        }
        node root=new node(arr[i]);
        root.left=build(arr, 2*i+1);
        root.right=build(arr, 2*i+2);
        return root;
    }
    //count
    public static int count(node root){
        if(root==null){
            return 0;
        }
        return 1+count(root.left)+count(root.right);
    }
}
class node{
    int val;
    node left,right;
    node(int a){
        val=a;
    }
}
