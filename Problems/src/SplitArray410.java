public class SplitArray410 {
    public static void main(String[] args) {
       int[] nums = {7,2,5,10,8}; int k = 2;
        System.out.println(splitArray(nums,k));
    }
    static int splitArray(int[] nums, int k) {
        int start=0;
        int end=0;
        for(int i=0;i< nums.length;i++){
            start=Math.max(start,nums[i]);
            end+=nums[i];
        }
        while(start<end){
           //try for the middle to be potential answer
           int mid=start+(end-start)/2;

           //calculate how many pieces i can divide it in the max sum
            int sum=0;
            int pieces=1;
            for(int num:nums){
                if(sum+num > mid){
                    // you cannot add in this sub array create a new one
                    sum=num;
                    pieces++;
                }else {
                    sum+=num;
                }

            }
            if(pieces>k){
                start=mid+1;
            } else {
                end=mid;

            }

        }
        return end;
    }
}
