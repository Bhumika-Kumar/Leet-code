class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        nums.sort()
        n=len(nums)
        res=[]
        for i in range(n-1):
            if i==0 or (i>0 and nums[i]!=nums[i-1]):
                low,high=i+1,n-1
                target=-nums[i]
                while(low<high):
                    currsum=nums[low]+nums[high]
                    if currsum==target:
                        res.append([nums[i],nums[low],nums[high]])
                        while low<high and nums[low]==nums[low+1]:
                            low+=1
                        while low<high and nums[high]==nums[high-1]:
                            high-=1
                        low+=1
                        high-=1
                    elif currsum>target:
                        high-=1
                    else:
                        low+=1
        return res
                
            
        