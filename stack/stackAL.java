import java.util.ArrayList;
public class stackAL {
    public static void main(String[] args) {
        Stack arr= new Stack();
        arr.push(1);
        arr.push(2);
        arr.push(3);
        arr.push(4);
        arr.push(5);
        arr.push(6);
        System.out.println(arr.peak());
        while(!arr.isEmpty()){
            System.out.println(arr.pull());
        }
    }
}
class Stack{
    ArrayList<Integer> arr= new ArrayList<>();
    public boolean isEmpty(){
        return arr.size()==0;
    }
    public void push(int a){
        arr.add(a);
    }
    public int pull(){
        int top= arr.get(arr.size()-1);
        arr.remove(arr.size()-1);
        return top;
    }
    public int peak(){
        return arr.get(arr.size()-1);
    } 
}