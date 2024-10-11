package LinkedList;
import java.util.LinkedList;
import java.util.Collections;
public class LinkedList0 {
    public static void main(String[] args) {
        LinkedList<Integer> list= new LinkedList<>();
        System.out.println(list.size());//size :0
        list.add(2);
        list.add(5);
        System.out.println(list);
        list.add(1,3);
        System.out.println(list);
        list.add(7);
        list.remove(1);
        System.out.println(list);
        System.out.println(list.indexOf(5));
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(6);
        Collections.sort(list);
        System.out.println(list);
    }
}
