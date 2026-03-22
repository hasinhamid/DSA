// Complete the sumOfLeaves method
public class Task3 {

    //===================================TASK#3======================
    // This method takes only 2 parameters
    // 1st one is root
    // 2nd one is the sum initiliazed as 0
    // You'll need to return the sum of the leaf nodes
    public static Integer sumOfLeaves( BSTNode root, Integer sum ){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return (int)root.elem;
        }
        int left= sumOfLeaves(root.left,sum);
        int right= sumOfLeaves(root.right,sum);

        return right+left; //remove this line
    }
    //===============================================================

}
