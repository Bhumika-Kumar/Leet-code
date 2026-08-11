class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        count=0
        prefixsum=0
        map={0:1}
        for num in nums:
            prefixsum+=num
            diff=prefixsum-k
            if diff in map:
                count+=map.get(diff)
            map[prefixsum]=map.get(prefixsum,0)+1
        return count
    
        