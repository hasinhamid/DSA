package graph;
public class graph {
    public static void main(String[] args) {
        grp gp=new grp(5);
    }
}

class grp{
    class edge{
        int src,des;
        edge next;
        public edge(int s,int e){
            src=s;
            des=e;
            next=null;
        }
    }
    edge[] arr;
    public grp(int size){
        arr=new edge[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=null;
        }
    }
    public void insert(int src,int des){
        if(exist(arr[src], des)){
            return;
        }
        edge ne=new edge(src, des);
        ne.next=arr[src];
        arr[src]=ne;
    }
    public boolean exist(edge i, int d){
        while (i!=null) {
            if(i.des==d){
                return true;
            }
            i=i.next;
        }
        return false;
    }
    
}