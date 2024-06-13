package Functions_and_Methods;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        String k="Anu";
        String p= Arrays.toString(k.toCharArray());


        System.out.println(p);
        int[] num={1,2,3,4,5,6,7,8,9};
        int target=4;
        System.out.println(LinearSearch(num,target));
    }
    static int LinearSearch(int[] arr,int target) {
        if (arr.length == 0) {
                return -1;
        }
        for(int i =0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }


}
