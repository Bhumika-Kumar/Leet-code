class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        numset=set(nums)
        count=0
        for num in numset:
            if num-1 not in numset:
                current=num
                curcount=0
                while current in numset:
                    current+=1
                    curcount+=1
                count=max(count,curcount)
        return count

        