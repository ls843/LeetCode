class Solution {
    public int numSpecial(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int row[] = new int[n];
        int col[] = new int[m];

        for(int i = 0; i < n; i++) {
            int cnt = 0;
            for(int j = 0; j < m; j++) {
                if(mat[i][j] == 1) cnt++;
            }
            row[i] = cnt;
        }

        for(int j = 0; j < m; j++) {
            int cnt = 0;
            for(int i = 0; i < n; i++) {
                if(mat[i][j] == 1) cnt++;
            }
            col[j] = cnt;
        }

        int specialPos = 0;
         for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(mat[i][j] == 1) {
                    if(row[i] == 1 && col[j] == 1) {
                        specialPos++;
                    }
                }
            }
        }

        return specialPos;
    }
}