
public class Task4{
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
        grp.printGraph();
        System.out.println("----------------><---------------");
        grp.toUndirected();
        grp.printGraph();
        
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
        if(exist(arr[ed[0]],ed[1])){
            return;
        }
        int x=ed[0];
        int y=ed[1];
        int w=ed[2];
        edge ne=new edge(y,w);
        ne.next=arr[x];
        arr[x]=ne;
    }
    public boolean exist( edge i, int t){
        edge ptr=i;
        while (i!=null) {
            if (i.des==t) {
                return true;
            }
            i=i.next;
        }
        return false;
    }
    public void toUndirected() {
        for (int i = 0; i < arr.length; i++) {
            for (edge e = arr[i]; e != null; e = e.next) {
                int d = e.des;
                int w = e.weight;
                if (!exist(arr[d], i)) {
                    edge re = new edge(i, w);
                    re.next = arr[d];
                    arr[d] = re;
                }
            }
        }
    }

    public void printGraph(){
        for(int i=0;i<arr.length;i++){
            System.out.print("vertex :"+i+" edges: ");
            for(edge k=arr[i];k!=null;k=k.next){
                System.out.print("des "+k.des+" weigth "+k.weight+" ,");
            }
            System.out.println();
        }
    }
}