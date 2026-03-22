public class Task2M {
    public static void main(String[] args) {
        int v=7;
        GraphM grp=new GraphM(v);
        int[][] edges={
            {0,1,2},{0,2,2},{0,3,1},{0,4,1},{0,5,1},{0,6,1},
            {1,2,2},{1,3,2},{1,4,2},{1,5,2},{1,6,2},
            {2,3,5},{2,4,5},{2,5,5},{2,6,5},
            {3,6,6}
        };
        for(int[] i:edges){
            grp.addEdge(i);
        }
        int[] max= grp.maxSum();
        System.out.println(max[0]+" vertex has highest edge weight sum "+max[1]);

    }
}
class GraphM{
    int[][] matrix;
    public GraphM(int n){
        matrix= new int[n][n];
    }
    public void addEdge(int[]edge){
        matrix[edge[0]][edge[1]]=edge[2];
        matrix[edge[1]][edge[0]]=edge[2];
    }
    public int[] maxSum(){
        int max[]=new int[2];
        for(int i=0;i<matrix.length;i++){
            int sum=0;
            for(int j=0;j<matrix[0].length;j++){
                sum+=matrix[i][j];
            }
            if(sum>max[1]){
                max[0]=i;
                max[1]=sum;
            }
        }
        return max;
    }



}
