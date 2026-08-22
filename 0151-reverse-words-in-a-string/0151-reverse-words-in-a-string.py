class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        result=[]
        n=len(s)
        i=0
        while i<n:
            while i<n and s[i]==' ': i+=1
            if i>=n: break
            j=i+1
            while j<n and s[j]!=' ': j+=1
            sub=s[i:j]
            if len(result)==0:
                result.append(sub)
            else:
                result.insert(0,sub+" ")
            i=j+1
        return ''.join(result)
        
        