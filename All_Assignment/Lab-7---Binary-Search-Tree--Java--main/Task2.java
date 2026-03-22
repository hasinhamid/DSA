// Complete the sumOfLeaves method
public class Task2 {

    //===================================TASK#2===================================
    // This method takes only 2 parameters
    // 1st one is root
    // 2nd one is an Integer
    // You'll need to find the path from the root to a node containing the Integer
    // return the path as a String
    public static String findPath( BSTNode root, Integer key ){
        if(root.elem==key){
            return ""+root.elem;
        }
        if(!search(root,key)){
            return "No Path Found";
        }
        if(root==null){
            return "";
        }
        String str=""+root.elem+" ";
        if(search(root.left,key)){
            str+=findPath(root.left,key);
        }
        else{
            str+=findPath(root.right,key);
        }
        return str;

    }

    public static boolean search(BSTNode root, int key){
        if(root==null){
            return false;
        }
        else if(root.elem==key){
            return true;
        }
        return search(root.left,key) || search(root.right,key);
    }
    //============================================================================

}
