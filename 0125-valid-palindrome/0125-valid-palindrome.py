class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        sb=[]
        for i in s:
            if i.isalnum():
                sb.append(i.lower())
        temp=''.join(sb)
        left,right=0, len(temp)-1
        while left<=right:
            if temp[left]!=temp[right]:
                return False
            left+=1
            right-=1
        return True
        
        