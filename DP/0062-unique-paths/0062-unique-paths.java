class Solution{
    public int uniquePaths(int m, int n) {
        int[][] resGrid = new int[m][n];

        resGrid[m-1][n-1] = 1;
        for(int r = m - 1; r > -1; r--){
            for(int c = n - 1; c > -1; c--){
                if(r < m - 1){
                    // bounds check
                    resGrid[r][c] = resGrid[r+1][c];
                }

                if(c < n - 1){
                    resGrid[r][c] += resGrid[r][c+1];
                }
            }
        }

        return resGrid[0][0];
    }

    // top-down approach
    public int uniquePathsTD(int m, int n){
        int[][] dp = new int[m][n];
        for(int i = 0; i < m ;i++){
            dp[i][0] = 1;
        }

        for(int j = 0; j < n; j++){
            dp[0][j] = 1;
        }

        for(int r = 1; r < m; r++){
            for(int c = 1; c < n; c++){
                dp[r][c] = dp[r-1][c] + dp[r][c-1];
            }
        }

        return dp[m-1][n-1];
    }
}