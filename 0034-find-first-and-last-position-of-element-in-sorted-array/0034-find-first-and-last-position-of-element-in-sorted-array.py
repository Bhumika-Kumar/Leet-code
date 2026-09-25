class Solution:
    def searchRange(self, nums: list[int], target: int) -> list[int]:
        start=self.binarysearch(nums,target)
        if start==len(nums) or nums[start]!=target: return [-1,-1]
        return[start, self.binarysearch(nums,target+1)-1]
    def binarysearch(self,nums,target):
        left,right=0,len(nums)
        while left<right:
            mid=left+(right-left)//2
            if nums[mid]<target:
                left=mid+1
            else:
                right=mid
        return left

        