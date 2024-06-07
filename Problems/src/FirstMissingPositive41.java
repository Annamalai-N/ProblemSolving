public class FirstMissingPositive41 {

    public int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length){
        int correct=nums[i];
        if( nums[i]>0 && nums[i]<nums.length && nums[i]!=nums[correct]){
            swapArray(nums,i,correct);
        }else{
            i++;
        }
    }
        for (int j=0;j<nums.length;j++){
        if(nums[j]!=j+1){
            return j;
        }
    }

return 1;
    }
static void swapArray(int[]arr,int first,int second){
    int temp=arr[first];
    arr[first]=arr[second];
    arr[second]=temp;

}
}
