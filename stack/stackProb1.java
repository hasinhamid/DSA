import java.util.Stack;         //Collections framework er built-in stack import
public class stackProb1 {       //push a data in the bottom with recurssion
    public static void main(String[] args) {
        Stack <Integer> s= new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        pushInBottom(0, s);
        while(!s.isEmpty()){    //dont use stack==null (error dey)
            System.out.println(s.pop());
        }

    }
    public static void pushInBottom(int a, Stack<Integer> str){
        if(str.isEmpty()){  //dont use stack==null (error dey)
            str.push(a);
            return;
        }
        int top= str.pop();
        pushInBottom(a, str);
        str.push(top);
    }
}
