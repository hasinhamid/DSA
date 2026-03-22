// Complete the sumTree method
public class Task3 {

        //===================================TASK#3===================================
        // This method takes only 1 parameter which is root of the given tree
        // This method returns an Integer
        // At times you may need to typeCast root.elem to Integer
        // You can use extra helper private static methods as per need

        public static Integer sumTree( BTNode root ){
            return helper(root,0);
        }
        private static int helper(BTNode rt, int lvl){
            if(rt==null){
                return 0;
            }
            int m=0;
            int val=(Integer)rt.elem;
            if(lvl==0){
                m=val;
            }
            else{
                m=val%lvl;
            }
            Integer left=helper(rt.left,lvl+1);
            Integer right=helper(rt.right,lvl+1);
            return m+left+right;
        }
        //============================================================================

}
