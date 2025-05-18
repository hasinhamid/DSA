package Final.rec;

public class r3 {
    public static void main(String[] args) {
        int[] arr1={2,3,4,5,6};
        int [] arr2={10,1,2};
        node h1=make(arr1);
        node h2=make(arr2);
        int ans1=sumProd(h1);
        int ans2=sumProd(h2);
        System.out.println(ans1+" "+ans2);
    }
    public static int sumProd(node h){
        return sum(h)-pro(h.next);
    } 
    public static int sum(node h){
        if(h==null){
            return 0;
        }
        if (h.next==null) {
            return h.val;
        }

        return h.val+sum(h.next.next);
        
        
        
    }
    public static int pro(node h){
        if(h==null){
            return 1;
        }
        if (h.next==null) {
            return h.val;
        }
        return h.val*pro(h.next.next);

        
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
}
class node{
    int val;
    node next;
    public node(int v){
        val=v;
    }
}
