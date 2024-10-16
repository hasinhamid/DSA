public class stackLL {
    public static void main(String[] args) {
    Stack st= new Stack();
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);
    st.push(6);
    st.push(7);
    System.out.println(st.peak());
    while(!st.isEmpty()){
        System.out.println(st.pull());
    }
    System.out.println(st.peak());
    }
   
}
class Stack{
    class node{
        public int data;
        node next;
        public node(int data){
            this.data=data;
        }
    }
    int size;
    node head=null;
    public boolean isEmpty(){
        return head==null;
    }
    public void push(int a){
        node newnode= new node(a);
        if(isEmpty()){
            head=newnode;
        }
        else{
            newnode.next=head;
            head=newnode;
        }
    }
    public int pull(){
        if(isEmpty()){
            return -1;
        }
        int a=head.data;
        head=head.next;
        return a;
    }
    public int peak(){

        if(isEmpty()){
            return -1;
        }
        int a=head.data;
        return a;
    }
}