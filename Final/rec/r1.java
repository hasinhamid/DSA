package Final.rec;

public class r1 {
    public static void main(String[] args) {
        node head=new node("10");
        head.next=new node("20");
        head.next.next=new node("-5");
        head.next.next.next=new node("0");
        head.next.next.next=new node("7");
        int a=sum(head);
        System.out.println(a);
    }
    public static int sum(node root){
        if(root==null){
            return 0;
        }
        if(Integer.parseInt(root.val)<0){
            return sum(root.next);
        }
        return Integer.parseInt(root.val)+sum(root.next);
    }
}
class node{
    String val;
    node next;
    node(String a){
        val=a;
    }
}
