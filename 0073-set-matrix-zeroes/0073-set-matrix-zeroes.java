class Solution {
    public void setZeroes(int[][] matrix) {
        // This is 1ms solution below uses hashset which is 3ms solution look both
        int m=matrix.length; int n=matrix[0].length;
        boolean[] rows =new boolean[m];
        boolean[] cols =new boolean[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    rows[i]=true;
                    cols[j]=true;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(rows[i] || cols[j]){
                    matrix[i][j]=0;
                }
            }
        }



        // HashSet<Integer>rows=new HashSet<>();
        // HashSet<Integer>cols=new HashSet<>();
        // int m=matrix.length; int n=matrix[0].length;
        // for(int i=0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         if(matrix[i][j]==0){
        //             rows.add(i);
        //             cols.add(j);
        //         }
        //     }
        // }
        // for(int row:rows){
        //     for(int j=0;j<n;j++){
        //         matrix[row][j]=0;
        //     }
        // }
        // for(int col:cols){
        //     for(int j=0;j<m;j++){
        //         matrix[j][col]=0;
        //     }
        // }
  }
    
}
