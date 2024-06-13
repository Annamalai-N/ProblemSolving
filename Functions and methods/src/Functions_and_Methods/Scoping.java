package Functions_and_Methods;

import java.util.Arrays;

public class Scoping {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        change(arr);
        System.out.println(Arrays.toString(arr));


    }
    static void change(int[] nums){
        nums[0]=99;
    }
}
