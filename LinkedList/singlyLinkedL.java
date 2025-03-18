package LinkedList;

public class singlyLinkedL {
    public static void main(String[] args) {
        LL list= new LL();
        System.out.println(list.size());
        // list.addLast(9);  //[9]
        // list.remove(9);    //[null]
        // list.printLL();       //nothing
        list.addFirst(2);   //2
        list.addFirst(3);   //3,2
        list.addFirst(5);   //5,3,2
        list.addFirst(1);   //1,5,3,2
        list.addFirst(4);   //4,1,5,3,2
        list.addLast(0);    //4,1,5,3,2,0
        list.printLL();       //print [4,1,5,3,2,0]

        list.remove(3);     //5removed
        list.printLL();       //print [4,1,3,2,0]
        // list.addByIndex(2, 8);
        // list.printLL();         //[4,1,8,3,2,0]
        // System.out.println(list.size());    //6
        // int[] ar={1,2,3,4};
        // LL arr=new LL(ar);
        // arr.printLL();
        // list.printLL();
        // System.out.println(list.search(0)); //5
        // list.reverseList();
        // list.printLL();
    }
}
class node{
    int data;
    node next;
    public node(int a){
        data=a;
        next=null;
    }
}
class LL{
    private node head;
    private int size;
    public LL(){
        size=0;
    }
    public LL(int[] arr){
        size=arr.length;
        for(Integer i:arr){
            addLast(i);
        }
    }
    public void addFirst(int a){
        if (head==null) {
            head= new node(a);
            size++;
        }
        else{
            node ptr= new node(a);
            ptr.next=head;
            head=ptr;
            size++;
        }
    }
    public void addLast(int a){
        if(head==null){
            head= new node(a);
            size++;
        }
        else{
            node ptr= head;
            while(true){
                if(ptr.next==null){
                    ptr.next=new node(a);
                    size++;
                    break;
                }
                else{
                    ptr=ptr.next;
                }
            }
        }
    }
    public int size(){
        return size;
    }
    public void printLL(){
        node ptr=head;
        while(ptr!=null){
            if(ptr.next!=null){
                System.out.print(ptr.data+"->");
                ptr=ptr.next;
            }
            else{
                System.out.println(ptr.data);
                ptr=ptr.next;
            }
            
        }
    }
    public void remove(int a){
        node ptr= head;
        node ptr2= head.next;
        boolean bool=false;
        if(size>=2){
            while(ptr2!=null){
                if(ptr2.data==a){
                    ptr2=ptr2.next;
                    ptr.next=ptr2;
                    bool=true;
                    size--;
                    break;
                }
                else{
                    ptr2=ptr2.next;
                    ptr=ptr.next;
                }
            }
        }
        else if(size==1){
            if (ptr.data==a) {
                head=null;
                bool=true;
                size--;
            }
        }
        if(bool){
            System.out.println(a +" element removed");
        }
        else{
            System.out.println(a+" element not found");
        }   
    }

    public void addByIndex(int index, int el){
        node ptr1= head;
        node ptr2= head.next;

        if(index>size ||size<0){
            System.out.println("index out of bound");
            return;
        }
        else if( index==0){
            node ptr= new node(el);
            ptr.next=head;
            head=ptr;
            size++;
            return;
        }
        else{
            for(int i=1;i<size;i++){  
                if(index==i){           
                    node ptr= new node(el); 
                    ptr1.next=ptr;
                    ptr.next=ptr2;
                    size++;
                    return;
                }
                else{
                    ptr2=ptr2.next;
                    ptr1=ptr1.next;
                }
            }
        }
    }
    public int search(int a){
        int ind=-1;
        node ptr=head;
        for(int i=0;i<size;i++){
            if(ptr.data==a){
                ind= i;
                break;
            }
            else{
                ptr=ptr.next;
            }

        }
        return ind;
    }
    public void reverseList(){
        if(size>1){
            node ptr1=head;
            node ptr2=head.next;
            while(ptr2!=null){
                node ptr3= ptr2.next;
                ptr2.next=ptr1;
                ptr1=ptr2;      
                ptr2=ptr3;
            }
            head.next= null;
            head=ptr1;
        }
        
        
    }

    
}

