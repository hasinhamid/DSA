public class Hmap {
    public static void main(String[] args) {
        Hashmap name= new Hashmap();
        name.put("Hasin", "23");
        name.put("Hamim", "25");
        name.put("Tozo", "26");
        name.put("Tousif", "18");
        System.out.println(name.get("Hasin"));
        System.out.println(name.containsKey("Hasin"));
        name.remove("Hasin");
        for(Hashmap.node a: name.entrySet()){
            System.out.println(a.key +"->" +a.value);
        }
        for(String i: name.ketSet()){
            System.out.println(i);
        }
        for(String i: name.values()){
            System.out.println(i);
        }
    }
    
}
class Hashmap{
    static class node{
        String key;
        String value;
        node next;
        public node(String key,String val){
            this.key=key;
            this.value=val;
            next=null;
        }
    }
    private node[] ht;
    public Hashmap(){
        ht= new node[5];
    }
    public int hashfunction(String key){
        int sum=0;
        for(int i=0;i<key.length();i++){
            int ch=key.charAt(i);
            sum+=ch;
        }
        return sum%ht.length;
    }
    public void put(String key,String val){
        int idx=hashfunction(key);
        node curr=ht[idx];
        if(curr==null){
            ht[idx]=new node(key, val);
        }
        else{
            curr=search(key);
            if(curr!=null){
                curr.value=val;
                return;
            }
            node nn=new node(key, val);
            nn.next=ht[idx];
            ht[idx]=nn;
        }
    }
    public String get(String key){
        node curr=search(key);
        return curr.value;
    }
    public boolean containsKey(String key){
        int idx= hashfunction(key);
        node curr= ht[idx];
        while(curr!=null){
            if(curr.key.equals(key)){
                return true;
            }
            curr=curr.next;
        }
        return false;
    }

    public node search(String key){
        int idx= hashfunction(key);
        node curr= ht[idx];
        while(curr!=null){
            if(curr.key.equals(key)){
                return curr;
            }
            curr=curr.next;
        }
        return null;
    }
    
    public node nodeAt(node h, int index){
        int i=0;
        while (i<index) {
            h=h.next;
            i++;
        }
        return h;
    }
    public int size(node h){
        int i=0;
        while (h!=null) {
            h=h.next;
            i++;
        }
        return i;
    }

    public void remove(String key){
        if(containsKey(key)){
            int idx= hashfunction(key);
            node curr=ht[idx];
            if (curr.key.equals(key)) {
                curr=curr.next;
                ht[idx]=curr;
            }
            while(curr.next!=null){
                node ptr=curr.next;
                if(ptr.key.equals(key)){
                    curr.next=ptr.next;
                    return;
                }
                curr=ptr;
            }
        }
        return;
    } 
    public node[] entrySet(){
        int i=0;
        node[] entry= new node[10];
        for(int j=0;j<ht.length;j++){
            node curr=ht[j];
            while (curr!=null) {
                entry[i++]=curr;
                curr=curr.next;  
            }
        }
        node[] arr= new node[i];
        for(int j=0;j<i;j++){
            arr[j]=entry[j];
        }
        return arr;
    }

    public String[] ketSet(){
        int i=0;
        String[] entry= new String[10];
        for(int j=0;j<ht.length;j++){
            node curr=ht[j];
            while (curr!=null) {
                entry[i++]=curr.key;
                curr=curr.next;
            }
        }
        String[] arr= new String[i];
        for(int j=0;j<i;j++){
            arr[j]=entry[j];
        }
        return arr;
    }

    public String[] values(){
        int i=0;
        String[] entry= new String[10];
        for(int j=0;j<ht.length;j++){
            node curr=ht[j];
            while (curr!=null) {
                entry[i++]=curr.value;
                curr=curr.next;
            }
        }
        String[] arr= new String[i];
        for(int j=0;j<i;j++){
            arr[j]=entry[j];
        }
        return arr;
    }

}
