// Complete the sumOfLeaves method
public class Task4 {

    //===================================TASK#4======================
    // This method takes only one parameter
    // it is root of the given tree
    // You can use extra helper private static methods as per need
    public static Integer mirrorSum( BSTNode root ){
        return helper(root.left,root.right);
    }

    private static int helper(BSTNode l, BSTNode r){
        if(l==null && r==null){
            return 0;
        }
        else if(l!=null && r!=null){
            return l.elem+r.elem+helper(l.left,r.right) + helper(l.right,r.left);
        }
        return 0;
    }
    //===============================================================


}
