class Solution {
    public int closedIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        for(int i = 0; i < m; i++) {
            dfs(grid, 0, i, n, m);
            dfs(grid, n - 1, i, n, m);
        }

        for(int i = 0; i < n; i++) {
            dfs(grid, i, 0, n, m);
            dfs(grid, i, m - 1, n, m);
        }

        int islands = 0;

        for(int i = 1; i < n - 1; i++) {
            for(int j = 1; j < m - 1; j++) {
                if(grid[i][j] == 0) {
                    dfs(grid, i, j, n, m);
                    islands++;
                }
            }
        }

        return islands;
    }

    public void dfs(int[][] grid, int i, int j, int n, int m) {
        if(i < 0 || i >= n || j < 0 || j >= m || grid[i][j] == 1) return;

        grid[i][j] = 1;

        dfs(grid, i + 1, j, n, m);
        dfs(grid, i - 1, j, n, m);
        dfs(grid, i, j + 1, n, m);
        dfs(grid, i, j - 1, n, m);
    }
}