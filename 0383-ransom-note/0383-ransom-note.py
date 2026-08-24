class Solution(object):
    def canConstruct(self, ransomNote, magazine):
        """
        :type ransomNote: str
        :type magazine: str
        :rtype: bool
        """
        hash=[0]*128
        for i in magazine:
            hash[ord(i)]+=1
        for i in ransomNote:
            hash[ord(i)]-=1
        for i in hash:
            if i<0:
                return False
        return True

        