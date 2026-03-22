public class Task1 {

    public static void main(String[] args) {
        MinHeap heap= new MinHeap(10);
        int[] arr={10,3,4,2,5,7,6,9,8};
        for(int i=0;i<arr.length;i++){
            heap.insert(arr[i]);
        }
        heap.print();            
        System.out.println();
        System.out.println(heap.extractMin());     
        heap.print();           
        System.out.println();
        System.out.println(heap.extractMin());     
        heap.print();           
        System.out.println();
        heap.HeapSort();       
        heap.print();         
    }
}
class MinHeap{
    private int capacity,size;
    private int[] arr;
    public MinHeap(int c){
        capacity=c;
        arr=new int[c];
        size=0;
    }
    public void insert(int a){
        if(size>=capacity){
            System.out.println("out of capacity");
            return;
        }
        arr[size++]=a;
        swim();
    }
    public void swim(){
        int i=size-1;
        while (i>0 && arr[parent(i)]>arr[i]) {
            swap(i, parent(i));
            i=parent(i);
        }
    }
    public int extractMin(){
        if(size==0){
            System.out.println("no value no extract");
        }
        int ans=arr[0];
        swap(0, --size);
        sink(0);
        return ans;
    }
    public void sink(int i){
        int l=left(i);
        int r=right(i);
        int small=i;
        if(l<size && arr[small]>arr[l]){
            small=l;
        }
        if(r<size && arr[small]>arr[r]){
            small=r;
        }
        if(small!=i){
            swap(i, small);
            sink(small);
        }
    }
    public void HeapSort(){
        int temp=size;
        while (size>0) {
            extractMin();
        }
        size=temp;
    }
    private int left(int i){
        return (i*2)+1;
    }
    private int right(int i){
        return (i*2)+2;
    }
    private int parent(int i){
        return i/2;
    }
    private void swap(int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void print(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
} 