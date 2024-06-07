import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int[] arr={6,3,10,9,2,4,9,7};
        CountSOrtAlgo(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void CountSOrtAlgo(int[]arr){
        if (arr==null || arr.length <=1){
            return;
        }
        int mac=arr[0];
        for (int num:arr) {
            if(num>mac){
                mac=num;
            }
        }
        int [] CountArray= new int[mac+1];
        for (int num:arr){
            CountArray[num]++;
        }
        int index=0;
        for (int i = 0; i <mac ; i++) {
            while(CountArray[i]>0){
                arr[index]=i;
                index++;
                CountArray[i]--;
            }
        }
    }
}
