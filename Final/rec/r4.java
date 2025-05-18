package Final.rec;

public class r4 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        node h1=make(arr1);
        System.out.println(fun(h1));

    }
    public static node make(int[]a){
        node head=new node(a[0]);
        node ptr=head;
        for(int i=1;i<a.length;i++){
            ptr.next=new node(a[i]);
            ptr=ptr.next;
        }
        return head;
        
    }
    public static boolean fun(node n){
        if(n==null || n.next==null){
            return true;
        }
        if(n.v<n.next.v){
            return fun(n.next);
        }
        return false;
    }
}
class node{
    int v;
    node next;
    public node(int a){
        v=a;
        next=null;
    }
}
