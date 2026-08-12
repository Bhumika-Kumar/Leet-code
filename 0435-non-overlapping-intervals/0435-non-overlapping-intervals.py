class Solution:
    def eraseOverlapIntervals(self, intervals: List[List[int]]) -> int:
        intervals.sort(key=lambda x:x[1])
        end=-100000
        remove=0
        for interval in intervals:
            if interval[0]>=end:
                end=interval[1]
            else:
                remove+=1
        return remove
        