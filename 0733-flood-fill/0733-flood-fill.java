class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int original = image[sr][sc];
        if(original == color) return image;

        int m = image.length;
        int n = image[0].length;

        int ans[][] = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                ans[i][j] = image[i][j];
            }
        }

        dfs(ans, sr, sc, original, color);

        return ans;
    }

    public void dfs(int[][] ans, int r, int c, int original, int color) {
        if(r < 0 || c < 0 || r >= ans.length || c >= ans[0].length)
            return;

        if(ans[r][c] != original) return;

        ans[r][c] = color;

        dfs(ans, r + 1, c, original, color);
        dfs(ans, r - 1, c, original, color);
        dfs(ans, r, c + 1, original, color);
        dfs(ans, r, c - 1, original, color);
    }
}