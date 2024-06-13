package Functions_and_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class Dimensional2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] nums =new int[3][3];

        for (int row=0;row<nums.length;row++){
            for (int col=0;col<nums[row].length;col++){
                nums[row][col]= in.nextInt();
            }
        }

        for (int row=0;row<nums.length;row++){
            for (int col=0;col<nums[row].length;col++){
                System.out.print(nums[row][col]+" ");
            }
            System.out.println();
        }

        for(int[] a :nums){

        }

    }
}
