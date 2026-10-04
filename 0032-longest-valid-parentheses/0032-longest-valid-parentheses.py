class Solution:
    def longestValidParentheses(self, s: str) -> int:
        stack=[]
        left=-1
        max_len=0
        for j in range(len(s)):
            if s[j]=='(': stack.append(j)
            else:
                if not stack: left=j
                else:
                    stack.pop()
                    if not stack: max_len=max(max_len,j-left)
                    else: max_len=max(max_len,j-stack[-1])
        return max_len

        