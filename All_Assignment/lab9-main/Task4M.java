public class Task4M {
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
        grp.printGraph();
        System.out.println("----------------><---------------");
        grp.toUndirected();
        grp.printGraph();
    }
}
class GraphM{
    int[][] matrix;
    public GraphM(int n){
        matrix= new int[n][n];
    }
    public void addEdge(int[]edge){
        matrix[edge[0]][edge[1]]=edge[2];
    }
    public void toUndirected(){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[j][i]=matrix[i][j];
            }
        }
    }
    public void printGraph(){
        for(int i=0;i<matrix.length;i++){
            System.out.print("vertex :"+i+" edges: ");
            for(int k=0;k<matrix.length;k++){
                if(matrix[i][k]!=0){
                    System.out.print("des "+k+" weigth "+matrix[i][k]+" ,");
                }
            }
            System.out.println();
        }
    }

}
