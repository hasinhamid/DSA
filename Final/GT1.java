package Final;

import java.util.Arrays;

public class GT1 {
    public static void main(String[] args) {
        int [][] arr={
        {0,5,10,7},
        {2,0,14,13},
        {8,4,0,9},
        {3,6,1,0}
        };
        int[] a= spend(arr);
        System.out.println(Arrays.toString(a));
    }
    public static int[] spend(int[][] arr){
        int[] banks=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr.length;j++){
                sum+=arr[i][j];
                sum-=arr[j][i];
            }
            banks[i]=sum;
        }


        return banks;

    }


}
