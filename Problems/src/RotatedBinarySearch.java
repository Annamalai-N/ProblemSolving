public class RotatedBinarySearch {
    public static void main(String[] args) {

    }

    static int search(int[] nums, int target){
        int pivot=FindPivot(nums);
        if (nums[pivot]==target){
            return pivot;
        }
        if(target>nums[0]){
            pivot=pivot-1;
        } else if (target<nums[0]) {
            pivot=pivot+1;
            int start=0;
            while(start<=pivot){
                int mid=start+(pivot-start)/2;

                if (target<nums[mid]){
                    pivot=mid-1;
                }else if(target>nums[mid]){
                    start=mid+1;
                }else {
                    return mid;
                }


            }
            return -1;

        }
        if(pivot==-1){
            int start=0;
            int end=nums.length-1;
            while(start<=end){
                int mid=start+(end-start)/2;

                if (target<nums[mid]){
                    end=mid-1;
                }else if(target>nums[mid]){
                    start=mid+1;
                }else {
                    return mid;
                }


            }
            return -1;
        }

    return 0;
    }
    static int FindPivot(int[] arr){
        int start=0;

        int end=arr.length-1;
        while(start<=end){
            //4 cases
            int mid= start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            } else if (mid>start && arr[mid]<arr[mid-1]) {

             return mid;
            }else if(arr[start]>=arr[mid]){
                end=mid-1;
            } else if (arr[mid]<=arr[mid]) {
                start=mid+1;

            }
        }
        return -1;

    }

    
}
