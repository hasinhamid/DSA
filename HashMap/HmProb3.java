import java.util.HashSet;
public class HmProb3 {
    //intersection
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,2,1,3};
        int[] arr2={3,4,5,6,7,8,9};
        HashSet<Integer> set= new HashSet<>();
        HashSet<Integer> out= new HashSet<>();
        for(int i:arr1){
            set.add(i);
        }
        for(int i:arr2){
            if(set.contains(i)){
                set.remove(i);
                out.add(i);
            }
        }
        
        for(Integer i:out){
            System.out.print(i+" ->");
        }
    }
}
