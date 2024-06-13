package Functions_and_Methods;

public class Floor {
    public static void main(String[] args) {
        int[] nums={2,4,5,6};
        System.out.println(FloorofArray(nums,3));
    }
     // return index value smaller or equal to target
    static int FloorofArray(int[] arr,int target){
        if (target < arr[0]){
            return -1;
        }

        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;

            if (target<arr[mid]){
                end=mid-1;
            }else if(target>arr[mid]){
                start=mid+1;
            }else {
                return mid;
            }


        }
        return end;

    }
}
