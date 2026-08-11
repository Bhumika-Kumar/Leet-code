class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        map={}
        longest=0
        sum=0
        for i in range(len(nums)):
            sum+=-1 if nums[i]==0 else 1
            if sum==0:
                longest=i+1
            elif sum in map:
                longest=max(longest, i-map[sum])
            else:
                map[sum]=i
        return longest
        