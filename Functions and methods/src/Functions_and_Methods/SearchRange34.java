package Functions_and_Methods;

public class SearchRange34 {
    public int[] searchRange(int[] nums, int t) {


        int ans[]=new int[2];
        ans[0]=first_positions(nums,t);
        ans[1]=last_position(nums,t);
        return ans;

    }
    public static int first_positions(int nums[],int t){

        int n=nums.length;
        int fp=-1;
        int i=0;
        int j=n-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(nums[mid]==t){
                fp=mid;
                j=mid-1;

            }else if(nums[mid]<t){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        return fp;

    }
    public static int last_position(int nums[],int t){

        int n=nums.length;
        int lp=-1;
        int i=0;
        int j=n-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(nums[mid]==t){
                lp=mid;
                i=mid+1;

            }else if(nums[mid]<t){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        return lp;
    }
}
