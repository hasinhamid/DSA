package graph;
import java.util.*;
public class graphM {
    public static void main(String[] args) {
        int[][] edge={
            {0,5,0,0,0,0,0},
            {5,0,0,0,0,0,0},
            {0,3,0,0,0,0,0},
            {0,6,4,0,0,0,0},
            {7,0,0,2,7,0,0},
            {11,0,0,9,10,0,0},
            {0,0,8,0,11,0,0}
        };
        grp gp=new grp(edge, edge.length);
        gp.bfs();
    }
}
class grp{
    int[][] matrix;
    public grp(int[][] arr,int size){
        matrix=new int[size][size];
        build(arr);
    }
    public void build(int[][] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                matrix[i][j]=a[i][j];
            }
        }
    }
    public void bfs(){
        Queue<Integer> que=new LinkedList<>();
        boolean[] visited=new boolean[7];
        que.add(6);
        while(!que.isEmpty()){
            int curr=que.remove();
            if (visited[curr]) {
                continue;
            }
            for(int i=0;i<matrix.length;i++){
                int c=matrix[curr][i];
                if (c!=0 && !visited[i]) {
                    que.add(i);
                }
            }
            visited[curr]=true;
            System.err.print(curr+" ");
        }
        

    }
    

}
