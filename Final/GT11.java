package Final;

import java.util.LinkedList;
import java.util.Queue;

public class GT11 {
    public static void main(String[] args) {
          int[][] graph = {
            {0, 0, 5, 2, 0},  // Vertex 0 has an edge to 2 with weight 5
            {1, 0, 0, 0, 3},  // Vertex 1 → 4 with weight 3
            {0, 6, 0, 0, 0},  // Vertex 2 → 1 with weight 6
            {0, 0, 4, 0, 0},  // Vertex 3 has no outgoing edges
            {4, 0, 0, 3, 0}   // Vertex 4 has no outgoing edges
        };

        int s = 0;  // Starting vertex
        int p = 15; // Available points

        int result = findMinPath(graph, s, p);
        System.out.println("Last reachable vertex = " + result);
    }
    public static int findMinPath(int[][] arr,int s, int p){
        boolean []vis=new boolean[5];
        vis[s]=true;
        while (p>0) {
            vis[s]=true;
            int next=-1;
            for(int i=0;i<arr.length;i++){
                if (arr[s][i]!=0 && !vis[i]) {
                    if(next==-1){
                        next=i;
                    }
                    if (arr[s][i]<arr[s][next]) {
                        next=i;
                    } 
                }
            }
            p-=arr[s][next];
            if(p<0){
                return s;
            }
            s=next;
        }
        return s;


    }
}
