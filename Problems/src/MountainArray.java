public class MountainArray {
    public static void main(String[] args) {

    }
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
    public int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length -1;

        while (start<end){
            int mid=start+(end-start)/2;
            if (arr[mid]>arr[mid+1]){
                // decreasing part of array , this maybe the answer but still look at the left part of array
                end=mid;
            } else if (arr[mid]<arr[mid+1]) {
                // youre in increasing part of the array , look ath the right part of the array
                start=mid+1;//because we know that mid+1 > mid element so we ignore the middle element

            }
            //start and end are equal then they are the maximum element so that will be the answer
        }
        return start;

    }
}
