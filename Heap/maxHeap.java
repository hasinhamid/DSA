public class maxHeap {
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
    private int capacity,size,sort;
    private int[] arr;
    public MH(int c){
        capacity=c;
        arr=new int[c];
        size=0;
        sort=0;
    }
    private int left(int i){
        return 2*i+1;
    }
    private int right(int i){
        return 2*i+2;
    }
    private int parent(int i){
        return (i-1)/2;
    }
    private void swap(int i,int j){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    private void heapify(){
        int i=size-1;
        while (i>0 && arr[parent(i)]<arr[i]) {
            swap(i, parent(i));
            i=parent(i);
        }
    }
    public void insert(int i){
        if(size<capacity){
            sort++;
            arr[size++]=i;
            heapify();
        }
        else{
            System.out.println("out of capacity");
        }
    }
    public void sink(int i){
        int l=left(i);
        int r=right(i);
        int max=i;
        if (l<size && arr[l]>arr[max]) {
            max=l;
        }
        if(r<size && arr[r]>arr[max]) {
            max=r;
        }
        if(max!=i){
            swap(i, max);
            sink(max);
        }
    }
    public void remove(){
        swap(--size, 0);
        sink(0);
    }
    public void print(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public void sort(){
        for(int i=0;i<sort;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
