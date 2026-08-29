class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        result=[]

        rowbegin=0
        rowend=len(matrix)-1
        colbegin=0
        colend=len(matrix[0])-1

        while rowbegin<=rowend and colbegin<=colend:
            for j in range(colbegin,colend+1):
                result.append(matrix[rowbegin][j])
            rowbegin+=1
            for j in range(rowbegin,rowend+1):
                result.append(matrix[j][colend])
            colend-=1
            if rowbegin<=rowend:
                for j in range(colend,colbegin-1,-1):
                    result.append(matrix[rowend][j])
                rowend-=1
            if colbegin<=colend:
                for j in range(rowend,rowbegin-1,-1):
                    result.append(matrix[j][colbegin])
                colbegin+=1
        return result
                    