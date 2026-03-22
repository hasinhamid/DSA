// Complete the levelSum method
public class Task6 {

    //===================================TASK#6===================================
    // This method takes only 1 parameter which is root of the given tree
    // This method returns an Integer
    // At times you may need to typeCast root.elem to Integer
    // You can use extra helper private static methods with extra extra params as per need
    public static Integer levelSum( BTNode root ){
        return sum(root,0);
    }
    private static int sum(BTNode rt, int lvl){
        if(rt==null){
            return 0;
        }
        int s=0;
        if(lvl%2==0){
            s-=(Integer)rt.elem;
        }
        else{
            s+=(Integer)rt.elem;
        }
        return s+sum(rt.left,lvl+1)+sum(rt.right,lvl+1);
    }
    //============================================================================

}