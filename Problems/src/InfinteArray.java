//Amazon level question (position of an element in sorted infinite array )
//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class InfinteArray {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target=10;
        System.out.println(ans(arr,target));


    }

    static int ans(int[]arr,int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int newstart=end+1;
            end= end+(end-start+1)*2;
            start=newstart;
        }
        return Search(arr,target,start,end);
    }
    static int Search( int[] nums,int target,int start,int end){
        while (start<end){
           int mid= start+(end-start)/2;
           if(nums[mid]>target){
               end=mid-1;
           } else if (nums[mid]<target) {
               start=mid+1;
           }else{
               return mid;
           }
        }
        return -1;

    }
}
