package Final;

import java.util.Stack;

public class GT3 {
    public static void main(String[] args) {
        int[][] edges={
            {0,1},{1,2},{2,3},{3,4},{4,1}
        };
        graph gp=new graph(edges, 5);
        System.out.println(gp.hasCycle(0));

    }
}
// checks cycle
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
    public boolean hasCycle(int s){
        Stack<Integer> stk=new Stack<>();
        boolean[] vis=new boolean[matrix.length];
        stk.push(s);
        vis[s]=true;
        while (!stk.isEmpty()) {
            int curr=stk.pop();
            for(int i=0;i<matrix.length;i++){
                if (matrix[curr][i]!=0) {
                    if(vis[i]){
                        return true;
                    }
                    stk.push(i); 
                }
            }
            vis[curr]=true;
        }
        return false;
    }
}
