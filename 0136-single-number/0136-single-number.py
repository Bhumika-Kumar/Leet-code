class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        map={}
        for num in nums:
            map[num]=map.get(num,0)+1
        for key,value in map.items():
            if value==1:
                return key
        return -1
        