package Final;

public class GT5 {
    public static void main(String[] args) {
        Graph graph=new Graph(6);
        graph.add(0, 1, 3);
        graph.add(0, 2, 5);
        graph.add(1, 3, 4);
        graph.add(2, 3, 6);
        graph.add(2, 4, 2);
        graph.add(3, 4, 1);
        graph.add(0, 4, 8);
        graph.add(1, 2, 11);
        graph.add(3, 5, 9);
        graph.add(4, 5, 10);
        int[]vs = graph.max_ver_sum();
        System.out.println("v= "+vs[0]+" sum "+vs[1]);

    }
}
class Graph{
    static class edge{
        int src,des,weight;
        edge next;
        public edge(int s,int d, int w){
            src=s;
            des=d;
            weight=w;
            next=null;
        }
    }
    edge[] arr;
    public Graph(int a){
        arr=new edge[a];
    }
    public void add(int s,int d, int w){
        if(exist(s,d)){
            return;
        }
        edge ne= new edge(s, d, w);
        ne.next=arr[s];
        arr[s]=ne;
    }
    public boolean exist(int s,int d){
        edge ptr=arr[s];
        while (ptr!=null) {
            if(ptr.des==d){
                return true;
            }
            ptr=ptr.next;
        }
        return false;
    }
    public int[] max_ver_sum(){
        int[] ans= new int[2];
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(edge j=arr[i];j!=null;j=j.next){
                sum+=j.weight;
            }
            if(sum>ans[1]){
                ans[0]=i;
                ans[1]=sum;
            }
        }

        return ans;
    }
}
