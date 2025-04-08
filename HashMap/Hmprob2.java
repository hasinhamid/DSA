import java.util.HashMap;
public class Hmprob2 {
    // array union
    public static void main(String[] args) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int[]arr1={1,2,3,4};
        int [] arr2={1,1,2,3,4,5,6,9,10};
        for(int i:arr1){
            map.put(i,1 );
        }
        for(int i:arr2){
            map.put(i, 1);
        }
        System.out.println("size ->"+map.size());
        for(Integer i:map.keySet()){
            System.out.print(i+" -> ");
        }
    }
}
