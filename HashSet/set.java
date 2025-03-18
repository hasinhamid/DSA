import java.util.HashSet;
import java.util.Iterator;
public class set {

    // imp functions 
    /*
     * 1. add (value)
     * 2. contains (value)      return true/false
     * 3. remove(value)
     * 4. size  return int
     */
    public static void main(String[] args) {
        HashSet<Integer> unique= new HashSet<>();
        unique.add(1);
        unique.add(2);
        unique.add(3);
        System.out.println(unique.contains(1));
        System.out.println(unique.contains(4));

        unique.remove(1);
        System.out.println(unique.size());
        System.out.println(unique);     // print all the elem in once

        for(Integer i:unique){      // to iterate
            System.out.print(i+" >");
        }
        System.out.println();
        //or use iterate class
        Iterator<Integer> it= unique.iterator();     //2func 1.hasNext() 2.next()
        while (it.hasNext()) {
            System.out.print(it.next()+" >");
        }


    }
}
