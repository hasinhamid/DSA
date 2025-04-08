import java.util.HashMap;
//ticket starting and ending point
public class HmProb4 {
    public static void main(String[] args) {
        HashMap<String,String> tick= new HashMap<>();
        tick.put("Pak","Ban");
        tick.put("Ban","Aus");
        tick.put("Aus","Ind");
        tick.put("Us","Pak");
        tick.put("Turk","Us");
        HashMap<String,String> rev= new HashMap<>();
        for(String i:tick.keySet()){
            rev.put(tick.get(i), i);
        }
        String start="";
        for(String i:tick.keySet()){
            if(!rev.containsKey(i)){
                start=i;
                break;
            }
        }
        while (start!=null) {
            System.out.print(start+" -> ");
            start= tick.get(start);
        }
    }
}
