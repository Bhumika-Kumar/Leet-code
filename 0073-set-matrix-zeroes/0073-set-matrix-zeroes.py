class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        m,n=len(matrix) , len(matrix[0])
        rows=set()
        cols=set()

        for i in range(m):
            for j in range(n):
                if matrix[i][j]==0:
                    rows.add(i)
                    cols.add(j)
        for row in rows:
            for j in range(n):
                matrix[row][j]=0
        for col in cols:
            for j in range(m):
                matrix[j][col]=0
        