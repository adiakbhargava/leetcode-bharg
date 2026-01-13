class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int numRows = grid.length;
        int numCols = grid[0].length;
        int area = 0;

        for(int r = 0; r < numRows; r++){
            for(int c = 0; c < numCols; c++){
                if(grid[r][c] == 1){
                    area = Math.max(area, bfs(grid, r, c));
                }
            }
        }

        return area;
    }

    private int bfs(int[][] grid, int r, int c){
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        Queue<int[]> q = new LinkedList<>();
        grid[r][c] = 0;
        q.add(new int[]{r, c});
        int res = 1;

        while(!q.isEmpty()){
            int[] node = q.poll();
            int row = node[0];
            int col = node[1];

            for(int[] dir : directions){
                int newRow = row + dir[0];
                int newCol = col + dir[1];

                if(newRow >= 0 && newCol >= 0 && newRow < grid.length 
                    && newCol < grid[0].length && grid[newRow][newCol] == 1){
                        q.add(new int[]{newRow, newCol});
                        grid[newRow][newCol] = 0;
                        res++;
                }
            }
        }

        return res;
    }
}