package Final;

import java.util.Arrays;

public class GT9 {
    public static void main(String[] args) {
        int[][] matrix = {
            {0, 0, 0, 0, 1, 1},
            {0, 0, 0, 1, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0},
            {0, 0, 0, 1, 0, 0},
            {0, 1, 0, 0, 0, 0}
        };
        int [][] revO= revOdd(matrix);
        for(int[] i:revO){
            System.out.println(Arrays.toString(i));
        }
    }
    public static int[][] revOdd(int[][]arr){
        int[][] ans=new int[6][6];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i%2!=0 && arr[i][j]!=0){
                    ans[j][i]=1;
                }
                else if (i%2==0) {
                    ans[i][j]=arr[i][j];
                }
            }
        }
        return ans;
    }
}
