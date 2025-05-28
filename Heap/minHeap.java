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
    public void print(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public int left(int a){
        return a*2+1;
    }
    public int right(int a){
        return a*2+2;
    }
    public int parent(int i){
        return (i-1)/2;
    }
    public void swap(int a,int b){
        int t=arr[a];
        arr[a]=arr[b];
        arr[b]=t;
    }
    public void insert(int s){
        arr[size++]=s;
        swim();
    }
    public void swim(){
        int i=size-1;
        int p=parent(i);
        while (i>0 && arr[i]<arr[p]) {
            swap(i, p);
            i=p;
        }
    }
    public void remove(){
        swap(0, size-1);
        size--;
        sink(0);
    }
    public void sink(int a){
        int l=left(a);
        int r=right(a);
        int min=a;
        if(l<size && arr[l]<arr[min]){
            min=l;
        }
        if(r<size && arr[r]<arr[min]){
            min=r;
        }
        if(min!=a){
            swap(a, min);
            sink(min);
        }
    }
}