
package Final.rec;

public class r6 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6,7,8};
        node h1=make(arr1);
        node h=fun(h1);
        while (h!=null) {
            System.out.print(h.v+" ");
            h=h.next;
        }

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
    public static node fun(node n){
        node mid=m(n,n);
        node head= mul(n,mid.v);
        return head;
    }
    public static node mul(node h,int a){
        if(h==null){
            return null;
        }
        h.v*=a;
        h.next=mul(h.next, a);
        return h;

    }
    public static node m(node t, node h){
        if(t==null ){
            return null; 
        }
        if(h.next==null){
            return t;
        }
        if(h.next.next==null){
            return t.next;
        }
        return m(t.next,h.next.next);
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
