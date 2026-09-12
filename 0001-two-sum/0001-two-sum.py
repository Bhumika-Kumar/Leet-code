class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hmap={}
        for i in range(0,len(nums)):
            currentvalue=target-nums[i]
            if currentvalue in hmap:
                return [hmap[currentvalue],i]
            else:
                hmap[nums[i]]=i
        return [-1,-1]
        