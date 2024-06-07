//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

import java.util.ArrayList;
import java.util.List;

class NumbersDisappearedInArray448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swapArray(nums, i, correct);
            } else {
                i++;
            }
        }
        List<Integer> m=new ArrayList<>();
        for(int j=0;j< nums.length;j++){
            if(nums[j]!=j+1){
                m.add(j+1);
            }
        }
        return m;
    }

    static void swapArray(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }


    
}