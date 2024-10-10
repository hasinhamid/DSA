package ArrayList;

/* ArrayList collection framework example
 * add,remove, get, sort, size,foreach
 */
import java.util.ArrayList;
import java.util.Collections;
public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        //size
        System.out.println(arr.size()); //size=0
        //adding element in ending
        arr.add(5);
        //print full list
        System.out.println(arr);
        arr.add(2);
        arr.add(1);
        //get element from a given index
        System.out.println(arr.get(0)); //[5,2.1] print: 5
        //adding element in-between 
        arr.add(1,3);// [5, {3} ,2,1]
        System.out.println(arr);
        arr.remove(2);// [5,3,1] index2=2 removed
        System.out.println(arr);
        for (Integer a : arr) {
            System.out.print(a+" -> ");
        }
        Collections.sort(arr);// sort using built-in function
       // ( list sort korte Collections er sort func use korte hoi )
        System.out.println(arr);// sorted list print

    }
    
}
