package LinkedList;

public class LL {
    public static void main(String[] args) {
        list l=new list();
        l.addL(1);
        l.addf(0);
        l.addL(3);
        l.insert(2,2);
        l.print();
        System.out.println(l.nodeAt(3).val);
        l.rem(2);
        l.print();
        l.insert(2, 2);
        l.rev();
        l.print();

    }
}

class list{
    class node{
        int val;
        node next;
        public node(int a){
            val=a;
            next=null;
        }
    }
    node head;
    public void addf(int a){
        if(head==null){
            head=new node(a);
        }
        else{
            node newnode= new node(a);
            newnode.next=head;
            head=newnode;
        }
    }
    public void addL(int a){
        node ptr= head;
        if(ptr==null){
            head=new node(a);
            return;
        }
        while(ptr.next!=null){
            ptr=ptr.next;
        }
        ptr.next=new node(a);
    }
    public void rev(){
        node ptr=head;
        if(ptr.next!=null){
            node ptr2=ptr.next;
            while (ptr2!=null) {
                node ptr3= ptr2.next;
                ptr2.next=ptr;
                ptr=ptr2;
                ptr2=ptr3;
            }
            head.next=null;
            head=ptr;  
        }
    }

    public void insert(int index,int val){
        int i=0;
        node nn=new node(val);
        if(index==0){
            nn.next=head;
            head=nn;
            return;
        } 
        node ptr=head;
        while (ptr!=null) {
            i++;
            if (index==i) {
                nn.next=ptr.next;
                ptr.next=nn;
            }
            ptr=ptr.next;
        }
 
    }
    public void rem(int a) {
        node ptr=head;
        if(ptr.val==a) {
            head=head.next;
            return;
        }
        node ptr2=head.next;
        while (ptr2!=null) {
            if(ptr2.val==a) {
                ptr.next=ptr.next.next;
                return;
            }
            ptr=ptr2;
            ptr2=ptr2.next;
        }
    }

    public void print(){
        node ptr=head;
        while (ptr!=null) {
            System.out.print(ptr.val+" ->");
            ptr=ptr.next;
        }   
        System.out.println("null");
    }

    public node nodeAt(int index){
        node ptr=head;
        int i=0;
        while (i<index && ptr!=null) {
            ptr=ptr.next;
            i++;
        }
        return ptr;
    }
}
