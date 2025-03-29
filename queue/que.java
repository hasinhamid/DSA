package queue;

public class que {
    public static void main(String[] args) {
        Queue q= new Queue();
        System.out.println(q.isEmpty());
        q.enq(0);
        q.enq(1);
        q.enq(2);
        q.enq(3);
        q.deq();
        System.out.println(q.isEmpty());
        while (!q.isEmpty()) {
            System.out.println(q.deq());
        }
    }
}

class Queue{
    static class node{
        int val;
        node next;
        public node(int b){
            val=b;
            next=null;
        }
    } 
    private node head;
    private node tail;
    public void enq(int a){
        if(head==null){
            head=new node(a);
            tail=head;
        }
        else{
            tail.next=new node(a);
            tail=tail.next;
        }
    }
    public int deq(){
        int a;
        if(head!=null){
            a=head.val;
            head=head.next;
            if(head==null){
                tail=head;
            }
            return a;
        }
        return -1;
    }
    public boolean isEmpty(){
        if(head==null){
            return true;
        }
        return false;
    }
}


