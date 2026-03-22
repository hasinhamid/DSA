public class Task2 {

    public static void main(String[] args) {
        MaxHeap heap= new MaxHeap(10);
        int[] arr={10,3,4,2,5,7,6,9,8};
        for(int i=0;i<arr.length;i++){
            heap.insert(arr[i]);
        }
        heap.print();           //prints: 10 9 8 7 5 4 2 6 3 
        System.out.println();
        System.out.println(heap.extractMax());     //prints: 10
        heap.print();           //prints: 9 7 8 6 5 4 2 3
        System.out.println();
        System.out.println(heap.extractMax());      //print: 9
        heap.print();           //prints: 8 7 4 6 5 3 2
        System.out.println();
        heap.HeapSort();        //sort
        heap.print();           //prints: 2 3 4 5 6 7 8  (ascending order sorting)
    }
}
class MaxHeap{
    private int capacity,size;
    private int[] arr;
    public MaxHeap(int c){
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
        while (i>0 && arr[parent(i)]<arr[i]) {
            swap(i, parent(i));
            i=parent(i);
        }
    }
    public int extractMax(){
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
        int large=i;
        if(l<size && arr[large]<arr[l]){
            large=l;
        }
        if(r<size && arr[large]<arr[r]){
            large=r;
        }
        if(large!=i){
            swap(i, large);
            sink(large);
        }
    }
    public void HeapSort(){
        int temp=size;
        while (size>0) {
            extractMax();
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