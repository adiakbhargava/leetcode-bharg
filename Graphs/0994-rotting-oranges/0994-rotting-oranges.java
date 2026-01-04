class Solution {
    public int orangesRotting(int[][] grid){
            int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
            Queue<int[]> q = new LinkedList<>();
            int numOfOnes = 0;
            int numOfSeconds = 0;
    
            for(int r = 0; r < grid.length; r++){
                for(int c = 0; c < grid[0].length; c++){
                    if(grid[r][c] == 1){
                        numOfOnes++;
                    } else if(grid[r][c] == 2){
                        q.add(new int[]{r,c});
                    }
                }
            }
    
            while(!q.isEmpty() && numOfOnes > 0){
                numOfSeconds++;
                int qSize = q.size();
                for(int i = 0; i < qSize; i++){
                    int[] infectedElement = q.poll();
    
                    for(int[] d : dirs){
                        int nextR = infectedElement[0] + d[0];
                        int nextC = infectedElement[1] + d[1];
                        if(isWithinBounds(nextR, nextC, grid) &&
                            grid[nextR][nextC] == 1){
                                grid[nextR][nextC] = 2;
                                numOfOnes--;
                                q.add(new int[]{nextR,nextC});
                        }
                    }
                }
            }
    
            return numOfOnes == 0 ? numOfSeconds : -1;
        }
    
        public boolean isWithinBounds(int r, int c, int[][] grid){
            return (0 <= r && r < grid.length) && (0 <= c && c < grid[0].length);
        }
    }