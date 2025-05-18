package Final.rec;

public class recRev {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,6,7,8};
        node h1=make(arr1);
        node head= rV(h1);
        while (head!=null) {
            System.out.print(head.v+" ");
            head=head.next;
        }
    }
    public static node rV(node root){
        if (root==null || root.next==null) {
            return root;
        }
        node nn=rV(root.next);
        node ptr=nn;
        while (ptr.next!=null) {
            ptr=ptr.next;
        }
        ptr.next=root;
        root.next=null;
        return nn;
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
    int v;
    node next;
    public node(int a){
        v=a;
        next=null;
    }
}
