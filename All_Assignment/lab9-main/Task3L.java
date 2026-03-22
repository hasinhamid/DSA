public class Task3L{
    public static void main(String[] args) {
        int v=7;
        Graph grp=new Graph(v);
        int[][] edges={
            {0,1,2},{0,2,2},{0,3,1},{0,4,1},{0,5,1},{0,6,1},
            {1,2,2},{1,3,2},{1,4,2},{1,5,2},{1,6,2},
            {2,3,5},{2,4,5},{2,5,5},{2,6,5},
            {3,6,6}
        };
        for(int[] i:edges){
            grp.addEdge(i);
        }
        int[] max= grp.maxWeight();
        System.out.println(max[0]+" vertex has highest weight "+max[1]);
        int[] m= grp.maxEdge();
        System.out.println(m[0]+" vertex has highest degree "+m[1]);
    }
}

class Graph{
    static class edge{
        int des;
        int weight;
        edge next;
        public edge(int d,int w){
            des=d;
            weight=w;
            next=null;
        }
    }
    edge[] arr;
    public Graph(int a){
        arr=new edge[a];
        for(int i=0;i<a;i++){
            arr[i]=null;
        }
    }
    public void addEdge(int[] ed){
        int x=ed[0];
        int y=ed[1];
        int w=ed[2];
        edge ne=new edge(y,w);
        ne.next=arr[x];
        arr[x]=ne;
    }
    public int[] maxWeight(){
        int max[]=new int[2];
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(edge j=arr[i];j!=null;j=j.next){
                sum+=j.weight;
            }
            if(sum>max[1]){
                max[0]=i;
                max[1]=sum;
            }
        }
        return max;
    }
    public int[] maxEdge(){
        int[] ans=new int[2];
        int max=0;
        for(int i=0;i<arr.length;i++){
            int degree=0;
            for(edge e=arr[i];e!=null;e=e.next){
                degree++;
            }
            if(degree>max){
                max=degree;
                ans[0]=i;
                ans[1]=max;
            }
        }

        return ans;
    }
    


}