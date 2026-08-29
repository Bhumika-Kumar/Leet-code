class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        # m,n=len(matrix) , len(matrix[0])
        # rows=set()
        # cols=set()

        # for i in range(m):
        #     for j in range(n):
        #         if matrix[i][j]==0:
        #             rows.add(i)
        #             cols.add(j)
        # for row in rows:
        #     for j in range(n):
        #         matrix[row][j]=0
        # for col in cols:
        #     for j in range(m):
        #         matrix[j][col]=0

        m = len(matrix) 
        n = len(matrix[0])
        rows = [False] * m 
        cols = [False] * n  
        for i in range(m): 
            for j in range(n): 
                if matrix[i][j] == 0: 
                    rows[i] = True
                    cols[j] = True 
        # Second loop: set the required rows and columns to zero 
        for i in range(m): 
            for j in range(n): 
                if rows[i] or cols[j]: 
                    matrix[i][j] = 0
        