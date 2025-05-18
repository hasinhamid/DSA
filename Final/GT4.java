package Final;

public class GT4 {
    public static void main(String[] args) {
        int[][] edges={
            {0,1},{1,2},{2,3},{3,4},{4,1}
        };
        graph gp=new graph(edges, 5);
        System.out.println(gp.fun(0, 4));
    }

}
class graph{
    int[][] matrix;
    public graph(int[][] arr,int size){
        matrix=new int[size][size];
        build(arr);
    }
    public void build(int[][] a){
        for(int[] i:a){
            matrix[i[0]][i[1]]=1;
        }
    }
    public boolean fun(int s, int d){
        return rfd(s, d, new boolean[matrix.length]);
    }
    public boolean rfd(int s,int d,boolean[] vis){
        if(s==d){
            return true;
        }
        vis[s]=true;
        boolean bool=false;
        for(int i=0;i<matrix.length;i++){
            if (matrix[s][i]!=0 && !vis[i]) {
                bool=bool || rfd(i, d, vis);
            }
        }
        return bool;
        
    }
}

