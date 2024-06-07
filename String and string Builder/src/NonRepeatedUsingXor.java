public class NonRepeatedUsingXor {
    public static void main(String[] args) {
        int[] arr={2,3,5,2,3,4,4,5,6,7,7};
        System.out.println(ansk(arr));
    }
    private static int ansk(int[]arr){
        int unique=0;
        for(int n:arr){
            unique^=n;
        }
        return unique;
    }
}
