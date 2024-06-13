package Functions_and_Methods;

public class Main {

    public static void main(String[] args) {
        int[] num={1,2,3,4,5,6,7,8,9};
        System.out.println(minn(num));
    }
    static int minn(int[] arr){
        int ans=arr[0];
        for(int i =1;i< arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];

            }
        }
        return ans;
    }
}
