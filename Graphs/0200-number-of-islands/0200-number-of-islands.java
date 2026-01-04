class Solution {
    public int numIslands(char[][] grid){
        if(grid == null){
            return 0;
        }

        int count = 0;
        for(int r = 0; r < grid.length; r++){
            for(int c = 0; c < grid[0].length; c++){
                if(Character.getNumericValue(grid[r][c]) == 1){
                    // perform dfs
                    dfs(r,c,grid);
                    count++;
                }
            }
        }

        return count;
    }

    public void dfs(int r, int c, char[][] grid){
        grid[r][c] = '2';
        int[][] dirs = {{-1,0}, {1,0}, {0,-1}, {0,1}};

        for(int[] d : dirs){
            int nextR = r + d[0];
            int nextC = c + d[1];
            // check its within bounds of the grid
            if(isWithinBounds(nextR, nextC, grid) && 
                Character.getNumericValue(grid[nextR][nextC]) == 1){
                    dfs(nextR, nextC, grid);
            }
        }
    }

    public boolean isWithinBounds(int r, int c, char[][] grid){
        return (0 <= r && r < grid.length) && (0 <= c && c < grid[0].length);
    }
}