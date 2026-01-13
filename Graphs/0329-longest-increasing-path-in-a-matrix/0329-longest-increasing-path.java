class Solution{
    public int longestIncreasingPath(int[][] matrix) {
        if(matrix == null){
            return 0;
        }
        int res = 0;
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] memo = new int[m][n];
        for(int r = 0; r < m; r++){
            for(int c = 0; c < n; c++){
                res = Math.max(res, dfs(r, c, matrix, memo));
            }
        }

        return res;
    }

    private int dfs(int r, int c, int[][] matrix, int[][] memo){
        if(memo[r][c] != 0){
            return memo[r][c];
        }

        int maxPath = 1;
        int[][] dirs = {{1, 0},{-1, 0},{0, 1},{0, -1}};
        for(int[] d : dirs){
            int nextR = r + d[0];
            int nextC = c + d[1];
            if(isWithinBounds(nextR, nextC, matrix) && matrix[nextR][nextC] > matrix[r][c]){
                maxPath = Math.max(maxPath, 1 + dfs(nextR, nextC, matrix, memo));
            }
        }
        memo[r][c] = maxPath;

        return maxPath;
    }

    private boolean isWithinBounds(int r, int c, int[][] matrix){
        return 0 <= r && r < matrix.length && 0 <= c && c < matrix[0].length; 
    }
}