public class Heap{
    public int capacity;
    public int[] arr;
    public int size;
    public Heap (int c){
        capacity=c;
        arr=new int[c];
        size=0;
    }
    public int parent(int i){
        return (i-1)/2;
    }
    public void insert (int n){
        if (size == capacity) {
            throw new IllegalStateException("Heap is full");
        }
        int i = size;
        arr[size++] = n;
        heapify();
    }
    public void heapify(){
        int i=size-1;
        while(i>0 && arr[parent(i)]>arr[i]){
            swap(parent(i),i);
            i=parent(i);
        }
    }
    public void swap(int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public void remove(){
        swap(0,size-1);
        size--;
        sink(0);
    }
    public int left(int i){
        return 2*i+1;
    }
    public int right (int i){
        return 2*i+2;
    }
    private void sink(int i) {
        int smallest = i;
        int l = left(i);
        int r = right(i);

        if (l < size && arr[l] < arr[smallest]) {
            smallest = l;
        }
        if (r < size && arr[r] < arr[smallest]) {
            smallest = r;
        }

        if (smallest != i) {
            swap(i, smallest);
            sink(smallest);
        }
    }
    public void print(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }





}