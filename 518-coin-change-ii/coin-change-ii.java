class Solution {
    public int change(int amount, int[] coins) {
        if(coins== null || coins.length==0) return 0;

        int m = coins.length;
        int n =amount;

        //using 2 space matrix
        // int [][]dp = new int[m+1][n + 1];

        // dp[0][0] = 1;
        // for(int i = 1; i <= m; i ++){
        //     for(int j =0; j <= n; j++){
        //         if(j < coins[i-1]){
        //             dp[i][j] = dp[i-1][j];
        //         }else{
        //             dp[i][j] = dp[i-1][j] + dp[i][j- coins[i-1]];
        //         }
        //     }
        // }
        // return dp[m][n];
 //------------------------------------------------------------------
        // using 1 space

        int []dp = new int[n + 1];

        dp[0] = 1;
        for(int i = 1; i <= m; i ++){
            for(int j =0; j <= n; j++){
                if(j < coins[i-1]){
                    dp[j] = dp[j];
                }else{
                    dp[j] = dp[j] + dp[j- coins[i-1]];
                }
            }
        }
        return dp[n];
    }
}