import java.util.Arrays;
public class Task3 {
    public static void main(String[] args) {
        int[] arr={2, 4, 7, 1, 6};
        int m=4;
        int [] ans=solve(arr, m);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] solve (int[] a, int m){
        MinHeap heap= new MinHeap(m);
        int i=0;
        while (i<m && !heap.isFull()) {
            heap.insert(a[i++]);
        }
        while (i<a.length) {
            int val=heap.extractMin();
            val+=a[i++];
            heap.insert(val);
        }
        return heap.getArray();

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
    public boolean isFull(){
        return size==capacity;
    }
    public int[] getArray(){
        return arr;
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
} 

