class Solution {
    public int[][] generateMatrix(int n) {
        int[][]ans=new int[n][n];

        int row =n;
        int col = n;
        int st_row = 0, st_col = 0;
        int end_row = row - 1, end_col = col - 1;
        int count=1;
        
        while (st_row <= end_row && st_col <= end_col) {
            
            for (int i = st_col; i <= end_col; i++) {
               // ans.add(mat[st_row][i]);
               ans[st_row][i]=count;
               count++;
            }
            st_row++;
            
            
            for (int i = st_row; i <= end_row; i++) {
                //ans.add(mat[i][end_col]);
                ans[i][end_col]=count++;
                
            }
            end_col--;
            
            
            if (st_row <= end_row) {
                for (int i = end_col; i >= st_col; i--) {
                    
                    ans[end_row][i]=count++;
                }
                end_row--;
            }
            
            
            if (st_col <= end_col) {
                for (int i = end_row; i >= st_row; i--) {
                    
                    ans[i][st_col]=count++;
                }
                st_col++;
            }
        }
        
        return ans;
        
    }
}