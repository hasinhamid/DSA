import java.util.HashMap;
// import java.util.Map;
public class map {
    /* put (key,value)
     * containsKey (key)     return true/false
     * get (key)     returns value of that key
     * remove (key)     removes the pair
     * 
     * for(HashMap.Entry<String,Integer> i:table.entrySet())    ke-value pair iterate
     * i.getKey()       returns key
     * i.getvalue()    returns value
     * 
     * for(String i:table.keySet())     key iterate
     * get(i)       returns value
     * 
     * for(Integer i:table.values())    value iterate
    */
    public static void main(String[] args) {
        HashMap<String, Integer> table= new HashMap<>();


        //add key value pairs
        table.put("hasin",22);
        table.put("hamim",24);
        table.put("Tozo",25);
        System.out.println();

        //iterate trough the map in different way

        //1. entrySet use ...can access both key value
        for(HashMap.Entry<String,Integer> i:table.entrySet()){
            System.out.println(i+" >");     //print both key value
            System.out.println("getkey :"+i.getKey()+"> getvalue :"+i.getValue());      //separate 
        }
        System.out.println();

        //2. keySet() use only key access
        for(String i:table.keySet()){       //data type String coz key String type chilo
            System.out.print(i+" >");
            System.out.println(table.get(i));       //print value
        }
        System.out.println();

        //3. values() use only value access
        for(Integer i:table.values()){       //data type Integer coz value Integer type chilo
            System.out.print(i+" >");
        }

    }
}
