public class HouseRobber198 {
    public int rob(int[] nums) {
        int mak=0;

        for (int i = 0; i < nums.length; i++) {

            for (int j = i+2; j <nums.length; j+=2) {
                int sum=nums[i]+nums[j];
                mak=Math.max(mak,sum);
            }
        }
        return mak;
    }

    public static void main(String[] args) {
        HouseRobber198 k=new HouseRobber198();
        int[]p={1,2,3,4,5};
        System.out.println(k.rob(p));
    }
}
