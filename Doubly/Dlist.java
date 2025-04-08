package Doubly;

public class Dlist {
    class node{
        int var;
        node prev;
        node next;
        public node(int a){
            var=a;
            prev=null;
            next=null;
        }
        public node(int a,node n,node p){
            var=a;
            next=n;
            prev=p;
        }
    }
    node head;
    public void add(int a){
        if (head==null) {
            head=new node(a);
        }
        else{
            node curr=head;
            while (curr.next!=null) {
                curr=curr.next;
            }
            node nn=new node(a);
            curr.next=nn;
            nn.prev= curr;
        }
    }
    
    public void addF(int a){
        node nn= new node(a);
        if(head==null){
            head=nn;
            return;
        }
        nn.next=head;
        head.prev=nn;
        head=nn;
    }
    public void rev(){
        node curr=head, temp=head;
        while (curr!=null) {
            temp=curr.next;
            curr.next=curr.prev;
            curr.prev=temp;
            if(temp==null){
                head=curr;
            }
            curr=temp;
        }
        
    }

    public int size(){
        int i=0;
        node curr=head;
        while(curr!=null){
            curr=curr.next;
            i++;
        }
        return i;
    }
    public void remove(int idx){
        if(idx<0 || idx>=size()){
            return;
        }
        int i=0;
        node curr=head;
        while(i<idx){
            curr=curr.next;
            i++;
        }
        node a=curr.next.next;
        curr.next=a;
        a.prev=curr;

    }
}
