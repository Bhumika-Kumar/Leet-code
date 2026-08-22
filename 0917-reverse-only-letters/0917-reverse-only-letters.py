class Solution(object):
    def reverseOnlyLetters(self, s):
        """
        :type s: str
        :rtype: str
        """
        str_arr=list(s)
        start,end = 0 , len(str_arr)-1
        while start<end:
            if str_arr[start].isalpha():
                if str_arr[end].isalpha():
                    str_arr[start],str_arr[end]=str_arr[end],str_arr[start]
                    start+=1
                    end-=1
                else:
                    end-=1
            else:
                start+=1
        return ''.join(str_arr)