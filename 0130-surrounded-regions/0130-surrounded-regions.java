class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;

        boolean vis[][] = new boolean[m][n];

        for(int i = 0; i < n; i++) {
            if(!vis[0][i]) dfs(board, vis, 0, i, m, n); 
        }

        for(int i = 0; i < n; i++) {
            if(!vis[m - 1][i]) dfs(board, vis, m - 1, i, m, n); 
        }

        for(int i = 0; i < m; i++) {
            if(!vis[i][0]) dfs(board, vis, i, 0, m, n); 
        }

        for(int i = 0; i < m; i++) {
            if(!vis[i][n - 1]) dfs(board, vis, i, n - 1, m, n); 
        }

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(!vis[i][j]) {
                    board[i][j] = 'X';
                }
            }
        }
    }

    public void dfs(char[][] board, boolean[][] vis, int i, int j, int m, int n){
        if(i < 0 || j < 0 || i >= m || j >= n) return;
        if(vis[i][j] || board[i][j] == 'X') return;

        vis[i][j] = true;

        dfs(board, vis, i + 1, j, m, n);
        dfs(board, vis, i - 1, j, m, n);
        dfs(board, vis, i, j + 1, m, n);
        dfs(board, vis, i, j - 1, m, n);
    }
}