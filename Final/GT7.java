package Final;

import java.util.Arrays;

public class GT7 {
    public static void main(String[] args) {
        Graph graph=new Graph(5);
        graph.add(0, 1, 1);
        graph.add(1, 3, 4);
        graph.add(2, 4, 3);
        graph.add(3, 4, 6);
        graph.add(3, 2, 4);
        int v=graph.maxEdge();
        int[] ans=graph.ed(v);
        System.out.println(v+"  "+Arrays.toString(ans));
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
    public int maxEdge(){
        int max=0;
        int idx=-1;
        int j=2;
        for(int i=0;i<arr.length;i++){
            int k=len(arr[i]);
            if(k>=j && max<k){
                max=k;
                idx=i;
            }
        }
        return idx;
    }
    public int[] ed(int a){
        edge v=arr[a];
        int[] ans= new int[len(v)];
        for(int i=0;v!=null;v=v.next,i++){
            if(v.weight>5){
                ans[i]=v.weight;
            }
            else{
                ans[i]=0;
            }
        }
        return ans;
    }
    public int len(edge i){
        int l=0;
        while (i!=null){
            l++;
            i=i.next;
        }
        return l;
    }
    
}

