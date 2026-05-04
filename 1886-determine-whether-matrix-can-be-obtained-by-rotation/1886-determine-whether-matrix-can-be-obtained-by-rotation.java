class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int k = 0; k < 4; k++) {
            if(isValid(mat, target)) return true;
            rotate(mat);
        }

        return false;
    }

    public boolean isValid(int[][] mat, int[][] target) {
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat.length; j++){
                if(mat[i][j] != target[i][j]) return false;
            }
        }

        return true;
    }

    public void rotate(int[][] mat) {
        for(int i = 0; i < mat.length; i++) {
            for(int j = i; j < mat.length; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat.length / 2; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[i][mat.length - 1 - j];
                mat[i][mat.length - 1 - j] = temp;
            }
        }
    }
}