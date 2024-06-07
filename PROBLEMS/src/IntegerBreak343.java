public class IntegerBreak343 {
    public int integerBreak(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i], Math.max(j, dp[j]) * Math.max(i - j, dp[i - j]));
            }
        }

        return dp[n];
    }


    public static void main(String[] args) {
        IntegerBreak343 k= new IntegerBreak343();
        int j=k.integerBreak(10);
        System.out.println(j);
    }
}
