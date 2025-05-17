package graph;

import java.util.Stack;

public class GMT2 {
    public static void main(String[] args) {
        int[][] edge={
            {0, 0, 0, 0, 0, 0, 0}, 
            {1, 0, 0, 0, 0, 0, 0}, 
            {0, 1, 0, 0, 0, 0, 0}, 
            {0, 1, 1, 0, 0, 1, 0}, 
            {1, 0, 0, 1, 1, 0, 0}, 
            {1, 0, 0, 0, 1, 0, 0}, 
            {0, 0, 1, 0, 1, 0, 0}
        };
        grp gp=new grp(edge, edge.length);
        gp.dfs();
        System.out.println();
        boolean []vis=new boolean[7];
        gp.recDFS(vis, 6);
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
    public void dfs(){
        Stack<Integer> stk=new Stack<>();
        boolean[] visited=new boolean[7];
        stk.add(6);
        while(!stk.isEmpty()){
            int curr=stk.pop();
            if (visited[curr]) {
                continue;
            }
            for(int i=0;i<matrix.length;i++){
                int c=matrix[curr][i];
                if (c!=0 && !visited[i]) {
                    stk.add(i);
                }
            }
            visited[curr]=true;
            System.err.print(curr+" ");
        }
    }
    public void recDFS(boolean [] vis,int start){
        vis[start]=true;
        System.out.print(start+" ");
        for(int i=matrix.length-1;i>=0;i--){
            if(matrix[start][i]!=0 && !vis[i]){
                recDFS(vis, i);
            }
        }
    }
}
