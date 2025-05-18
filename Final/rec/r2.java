package Final.rec;

public class r2 {
    public static void main(String[] args) {
        int[] arr1={2,4,7};
        int[] arr2={1,3,5,6,8};
        node h1=make(arr1);
        node h2=make(arr2);
        node h3= merge(h1,h2);
        while(h3!=null){
            System.out.print(h3.val+" ");
            h3=h3.next;
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
    public static node merge(node a, node b){
        if(a==null){
            return b;
        }
        if(b==null){
            return a;
        }
        if(a.val<b.val){
            a.next=merge(a.next,b);
            return a;
        }
        b.next=merge(a, b.next);
        return b;
    }
}
class node{
    int val;
    node next;
    public node(int a){
        val=a;
    }
} 
