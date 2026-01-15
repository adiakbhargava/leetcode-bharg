class Solution{
    public int uniquePathsWithObstacles(int[][] obstacleGrid){
        int[][] resGrid = new int[obstacleGrid.length][obstacleGrid[0].length];
        int endRow = obstacleGrid.length - 1;
        int endCol = obstacleGrid[0].length - 1;

        if(obstacleGrid[endRow][endCol] == 1){
            return 0;
        }

        resGrid[endRow][endCol] = 1;
        for(int r = endRow; r > -1; r--){
            for(int c = endCol; c > -1; c--){
                if(obstacleGrid[r][c] == 1){
                    resGrid[r][c] = 0;
                } else{
                    // no obstacle in tile
                    if(r < obstacleGrid.length - 1){
                        // bounds check
                        resGrid[r][c] = resGrid[r+1][c];
                    }

                    if(c < obstacleGrid[0].length - 1){
                        resGrid[r][c] += resGrid[r][c+1];
                    }
                }
            }
        }
        return resGrid[0][0];
    }
}