class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;

        // Check first and last columns
        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O')
                dfs(i, 0, board);

            if (board[i][n - 1] == 'O')
                dfs(i, n - 1, board);
        }

        // Check first and last rows
        for (int j = 0; j < n; j++) {
            if (board[0][j] == 'O')
                dfs(0, j, board);

            if (board[m - 1][j] == 'O')
                dfs(m - 1, j, board);
        }

        // Convert remaining O's to X
        // Restore protected cells
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O')
                    board[i][j] = 'X';

                else if (board[i][j] == '#')
                    board[i][j] = 'O';
            }
        }
    }

    public void dfs(int r, int c, char[][] board) {
        int m = board.length;
        int n = board[0].length;

        if (r < 0 || c < 0 || r >= m || c >= n)
            return;

        if (board[r][c] != 'O')
            return;

        board[r][c] = '#';

        dfs(r + 1, c, board); // Down
        dfs(r - 1, c, board); // Up
        dfs(r, c + 1, board); // Right
        dfs(r, c - 1, board); // Left
    }
}