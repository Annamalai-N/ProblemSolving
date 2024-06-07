public class CountNoOfRotation {
    public static void main(String[] args) {
            int[] arr={4,5,6,7,0,1,2};
        System.out.println(CountRotations(arr));
    }

    static int CountRotations(int[] nums){
                int pivot=FindPivot(nums);
                return pivot+1;
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
