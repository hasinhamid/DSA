public class stackArr {
    public static void main(String[] args) {
        stackA arr= new stackA();
        arr.push(1);
        arr.push(2);
        arr.push(3);
        arr.push(4);
        for(int i=arr.i;i>0;i--){
            System.out.println(arr.pop());
        }
    }
}
class stackA{
    int[] arr= new int[100];
    public int i=0;
    public void push(int a){
        arr[i++]=a;
    }
    public int pop(){
        int a= arr[--i];
        arr[i]=0;
        return a;
    }
    public int peak(){
        return arr[i-1];
    }

}
