class Solution {
    public void makeZeros(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        // Create a copy of the matrix to store original values
        int[][] temp = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                temp[i][j] = mat[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (temp[i][j] == 0) {
                    int sum = 0;

                  
                    if (i - 1 >= 0) {
                        sum += temp[i - 1][j];
                        mat[i - 1][j] = 0;
                    }
                   
                    if (i + 1 < n) {
                        sum += temp[i + 1][j];
                        mat[i + 1][j] = 0;
                    }
                   
                    if (j - 1 >= 0) {
                        sum += temp[i][j - 1];
                        mat[i][j - 1] = 0;
                    }
                    
                    if (j + 1 < m) {
                        sum += temp[i][j + 1];
                        mat[i][j + 1] = 0;
                    }

                    mat[i][j] = sum;
                }
            }
        }
    }
}