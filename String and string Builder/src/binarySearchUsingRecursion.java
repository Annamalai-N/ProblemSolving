public class binarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        System.out.println(binarySearch(arr,3,0,arr.length-1));
    }
    static int binarySearch(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int m=start+(end-start)/2;
        if(arr[m]==target){
            return arr[m];
        }
        if(target<arr[m]){
            return binarySearch(arr,target,start,m-1);
        }
        else{
            return binarySearch(arr,target,m+1,end);
        }
    }
}
