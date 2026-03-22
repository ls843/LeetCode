class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        
        boolean[][] visited = new boolean[m][n];
        int islands[] = new int[1];
        int max = 0;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1 && !visited[i][j]){
                    dfs(grid, visited, islands, i, j, m, n);
                    max = Math.max(max, islands[0]);
                    islands[0] = 0;
                }
            }
        }

        return max;
    }

    private void dfs(int[][] grid, boolean[][] vis,int[] islands, int i, int j, int m, int n) {
        if(i < 0 || i >= m || j < 0 || j >= n) return;  
        if(grid[i][j] == 0 || vis[i][j]) return;     

        vis[i][j] = true;
        islands[0]++;

        dfs(grid, vis, islands, i + 1, j, m, n);
        dfs(grid, vis, islands, i - 1, j, m, n);
        dfs(grid, vis, islands, i, j + 1, m, n);
        dfs(grid, vis, islands, i, j - 1, m, n);
    }
}