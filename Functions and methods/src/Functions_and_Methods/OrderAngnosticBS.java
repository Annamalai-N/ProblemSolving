package Functions_and_Methods;

public class OrderAngnosticBS {
    public static void main(String[] args) {
      int nums[]={1,2,3,4,5,6};
        System.out.println(OABS(nums,9));
    }

    static int OABS(int[] arr,int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean iasc;
        if (start < end) {
             iasc=true;
        }else {
            iasc=false;
        }


        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid]==target){
                return mid;
            }
            if(iasc){
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            }else{
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return 0;
    }
}
