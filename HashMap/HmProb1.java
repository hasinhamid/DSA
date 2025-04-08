import java.util.HashMap;


//majority element
public class HmProb1{
    public static void main(String[] args) {
        int[] nums={1,2,1,1,1,4,5,2,3,4,5};
        HashMap<Integer,Integer> map= new HashMap<>();
        for(Integer i: nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i, 1);
            }
        }
        for(HashMap.Entry<Integer,Integer> i: map.entrySet()){
            if(i.getValue()>1){
                System.out.println(i.getKey()+" > "+i.getValue());
            }
        }
    }
}