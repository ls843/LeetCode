class Solution {
    public int numEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        boolean vis[][] = new boolean[m][n];

        for(int i = 0; i < n; i++) {
            dfs(grid, vis, 0, i, m, n); 
            dfs(grid, vis, m - 1, i, m, n); 
        }

        for(int i = 0; i < m; i++) {
            dfs(grid, vis, i, 0, m, n); 
            dfs(grid, vis, i, n - 1, m, n); 
        }

        int cnt = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(!vis[i][j] && grid[i][j] == 1) {
                    cnt++;
                }
            }
        }

        return cnt;
    }

    public void dfs(int[][] grid, boolean[][] vis, int i, int j, int m, int n){
        if(i < 0 || j < 0 || i >= m || j >= n) return;
        if(vis[i][j] || grid[i][j] == 0) return;

        vis[i][j] = true;

        dfs(grid, vis, i + 1, j, m, n);
        dfs(grid, vis, i - 1, j, m, n);
        dfs(grid, vis, i, j + 1, m, n);
        dfs(grid, vis, i, j - 1, m, n);
    }
}