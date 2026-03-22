import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {
        int[] arr={4, 10, 2, 8, 6, 7};
        int k=3;
        int[] ans= solve(arr,k);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] solve(int[] nums, int k){
        int[] ans=new int[k];
        MaxHeap heap=new MaxHeap(nums);
        for(int i=0;i<k;i++){
            ans[i]=heap.extractMax();
        }
        return ans;
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
    public MaxHeap(int[] array){
        capacity=array.length;
        size=0;
        arr=new int[capacity];
        for(int i=0;i<capacity;i++){
            insert(array[i]);
        }
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