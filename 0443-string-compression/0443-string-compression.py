class Solution(object):
    def compress(self, chars):
        """
        :type chars: List[str]
        :rtype: int
        """
        index=0
        count=0
        n=len(chars)
        for i in range(n):
            count+=1
            if i+1 == n or chars[i]!=chars[i+1]:
                chars[index]=chars[i]
                index+=1
                if count>1:
                    for ch in str(count):
                        chars[index]=ch
                        index+=1
                count=0
        return index
        