class Solution {
    public void setZeroes(int[][] matrix) {
        HashSet<Integer>rows=new HashSet<>();
        HashSet<Integer>cols=new HashSet<>();
        int m=matrix.length; int n=matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        for(int row:rows){
            for(int j=0;j<n;j++){
                matrix[row][j]=0;
            }
        }
        for(int col:cols){
            for(int j=0;j<m;j++){
                matrix[j][col]=0;
            }
        }
  }
    
}

// Another approach this is 1 ms above is 2 ms see both
 //     boolean firstRow = false, firstCol = false;
    // // Set markers in first row and first column
    // for (int i = 0; i < matrix.length; i++)
    //   for (int j = 0; j < matrix[0].length; j++)
    //     if (matrix[i][j] == 0) {
    //       if (i == 0) firstRow = true;
    //       if (j == 0) firstCol = true;
    //       matrix[0][j] = 0;
    //       matrix[i][0] = 0;
    //     }

    // // Replace inner matrix
    // for (int i = 1; i < matrix.length; i++)
    //   for (int j = 1; j < matrix[0].length; j++)
    //     if (matrix[i][0] == 0 || matrix[0][j] == 0)
    //       matrix[i][j] = 0;

    // // Last remaining checks
    // if (firstRow)
    //   for (int j = 0; j < matrix[0].length; j++)
    //     matrix[0][j] = 0;

    // if (firstCol)
    //   for (int i = 0; i < matrix.length; i++)
    //     matrix[i][0] = 0;