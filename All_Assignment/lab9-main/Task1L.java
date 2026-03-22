public class Task1L{
    public static void main(String[] args) {
        int v=7;
        Graph grp=new Graph(v);
        int[][] edges={
            {0,1},{0,2},{0,3},{0,4},{0,5},{0,6},
            {1,2},{1,3},{1,4},{1,5},{1,6},
            {2,3},{2,4},{2,5},{2,6},
            {3,6}
        };
        for(int[] i:edges){
            grp.addEdge(i);
        }
        int[] max= grp.maxEdge();
        System.out.println(max[0]+" vertex has highest degree "+max[1]);

    }
}

class Graph{
    static class edge{
        int des;
        edge next;
        public edge(int d){
            des=d;
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
        edge ne1=new edge(x);
        edge ne2=new edge(y);
        ne1.next=arr[y];
        arr[y]=ne1;
        ne2.next=arr[x];
        arr[x]=ne2;
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