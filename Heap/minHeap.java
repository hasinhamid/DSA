public class minHeap {
    public static void main(String[] args) {
        MH h=new MH(10);
        h.insert(0);
        h.insert(2);
        h.insert(4);
        h.insert(6);
        h.insert(3);
        h.insert(5);
        h.insert(8);
        h.print();
        System.out.println();
        h.remove();
        h.print();
        System.out.println();
        h.remove();
        h.print();
        System.out.println();
        h.remove();
        h.print();
        System.out.println();
        h.remove();
        h.print();
        System.out.println();
        h.remove();
        h.print();
        System.out.println();
        h.remove();
        h.print();
        System.out.println();
        h.remove();
        h.print();
        System.out.println();
        h.sort();
    }
}
class MH{
    int size,cap;
    int[] arr;
    public MH(int c){
        cap=c;
        size=0;
        arr=new int[c];
    }
    public
}