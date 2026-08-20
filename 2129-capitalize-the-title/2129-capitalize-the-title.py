class Solution(object):
    def capitalizeTitle(self, title):
        """
        :type title: str
        :rtype: str
        """
        charray=list(title)
        length=len(charray)
        i=0

        while i < length:
            firstindex=i
            while i<length and charray[i]!=' ':
                charray[i]=charray[i].lower()
                i+=1
            if i-firstindex > 2:
                charray[firstindex]=charray[firstindex].upper()
            i+=1
        return ''.join(charray)
        