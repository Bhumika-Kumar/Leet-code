class Solution:
    def longestPalindrome(self, s: str) -> str:
        def expand(s,left,right):
            while left>=0 and right<len(s) and s[left]==s[right]:
                left-=1
                right+=1
            return right-left-1
        start=0
        maxlen=0
        for i in range(len(s)):
            len1=expand(s,i,i)
            len2=expand(s,i,i+1)
            cur_len=max(len1,len2)
            if cur_len > maxlen:
                start=i-(cur_len-1)//2
                maxlen=cur_len
        return s[start:start+maxlen]
        