package Functions_and_Methods;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target=5;
        System.out.println(search(arr, target));
    }

    static int search(int[][] nums,int target){
        for (int i=0;i< nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                if(nums[i][j]==target){
                    return j;

                }
            }
        }
    return -1;
     }
}
