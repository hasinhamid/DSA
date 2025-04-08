public class count {
    public static void main(String[] args) {
        int[] arr={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        node root= built(arr);
        preTrevarse(root);
        System.out.println();
        // int count=trevarse(root);
        // System.out.println(count);
        // int sum= sum(root);
        // System.out.println(sum);
        System.out.println(diameter(root));
    }
    // sum
    public static int sum(node n){
        if(n==null){
            return 0;
        }
        int c= n.val;
        int a=sum(n.left);
        int b=sum(n.right);
        return a+b+c;
    }
    static int i=0;
    public static node b(int[] arr){
        if(arr[i]==-1){
            i++;
            return null;
        }
        node n= new node(arr[i++]);
        n.left=b(arr);
        n.right=b(arr);
        return n;
    }

    //diameter
    public static int diameter(node n){
        if(n==null){
            return 0;
        }
        int l=height(n.left);
        int r=height(n.right);
        int m=l+r+1;
        return m;
    }
    //height
    public static int height(node n){
        if(n==null){
            return 0;
        }
        int l=height(n.left);
        int r=height(n.right);
        int m=Math.max(l, r)+1;
        return m;
    }




    //count
    public static int trevarse(node n){
        if(n==null){
            return 0;
        }
        int a=trevarse(n.left);
        int b=trevarse(n.right);
        return a+b+1;
    }
    //build tree
    static int idx=0;
    public static node built(int[]arr){   //preorder making    
        if(idx>=arr.length||arr[idx]==-1){
            idx++;
            return null;
        }
        node nnode= new node(arr[idx++]);        //1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1
        nnode.left=built(arr);
        nnode.right=built(arr);
        return nnode;
    }
    
    public static void preTrevarse(node n){
        if(n==null){
            return;
        }
        System.out.print(n.val+" ->");
        preTrevarse(n.left);
        preTrevarse(n.right);
    }

    static class node{
        int val;
        node right;
        node left;
        public node(int v){
            val=v;
            right=null;
            left=null;
        }
    }
}


