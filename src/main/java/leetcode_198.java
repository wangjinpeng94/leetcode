public class leetcode_198 {
    public int rob(int[] nums) {
//dp[n][]=
        int n=nums.length;
        if (n==0) {
            return 0;
        }
        // 1 2 3 4 5
        //
        int [][] dps = new int [n][];
        int result =0;
        for (int i = 0; i < dps.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                dps[i][j]=dps[i][j-1]+nums[j];
                result=Math.max(dps[i][j],result);
            }
        }



        return result;

    }
}
