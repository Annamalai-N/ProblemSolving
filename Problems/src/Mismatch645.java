import java.util.ArrayList;
import java.util.List;

class Mismatch645 {
    public static void main(String[] args) {

    }
    static int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swapArray(nums, i, correct);
            } else {
                i++;
            }
        }

        for(int j=0;j< nums.length;j++){
            if(nums[j]!=j+1){
                return new int[] {nums[j],j+1};
            }
        }
    return new int[]{1};
    }
    static void swapArray(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }

}