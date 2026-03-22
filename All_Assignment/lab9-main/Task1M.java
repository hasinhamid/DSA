public class Task1M {
    public static void main(String[] args) {
        int v=7;
        GraphM grp=new GraphM(v);
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
class GraphM{
    int[][] matrix;
    public GraphM(int n){
        matrix= new int[n][n];
    }
    public void addEdge(int[]edge){
        matrix[edge[0]][edge[1]]=1;
        matrix[edge[1]][edge[0]]=1;
    }
    public int[] maxEdge(){
        int[] ans=new int[2];
        for(int i=0;i<matrix.length;i++){
            int edg=0;
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==1){
                    edg++;
                }
            }
            if(edg>ans[1]){
                ans[0]=i;
                ans[1]=edg;
            }

        }
        return ans;
    }



}
