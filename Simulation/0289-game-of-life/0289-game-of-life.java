class Solution{
    public void gameOfLife(int[][] board){
        // Original | New | State
        //    0     |  0  |   0
        //    1     |  0  |   1
        //    0     |  1  |   2
        //    1     |  1  |   3

        int m = board.length;
        int n = board[0].length;

        for(int r = 0; r < m; r++){
            for(int c = 0; c < n; c++){
                int neighCount = countNeighbors(r,c, board);

                if(board[r][c] == 1){
                    if(neighCount == 2 || neighCount == 3){
                        board[r][c] = 3;
                    }
                } else if(neighCount == 3){
                    board[r][c] = 2;
                }
            }
        }

        for(int r = 0; r < m; r++){
            for(int c = 0; c < n; c++){
                if(board[r][c] == 1){
                    board[r][c] = 0;
                } else if(board[r][c] == 2 || board[r][c] == 3){
                    board[r][c] = 1;
                }
            }
        }
    } 

    public int countNeighbors(int r, int c, int[][] board){
        int neighbors = 0;
        for(int i = r - 1; i < r + 2; i++){
            for(int j = c - 1; j < c + 2; j++){
                if((i == r && j == c) || i < 0 || j < 0 || i == board.length || j == board[0].length){
                    continue;
                }

                if(board[i][j] == 1 || board[i][j] == 3){
                    neighbors++;
                }
            }
        }

        return neighbors;
    }
}