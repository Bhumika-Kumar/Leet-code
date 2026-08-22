class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        hash=[0]*128
        for ch in s:
            hash[ord(ch)]+=1
        res=0
        flag=False
        for i in hash:
            if i%2==0:
                res+=i
            else:
                flag=True
                res+=(i-1)
        return res+1 if flag else res
        