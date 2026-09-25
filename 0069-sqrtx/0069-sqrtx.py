class Solution:
    def mySqrt(self, x: int) -> int:
        if x<=0:
            return 0
        left,right,ans=1,x,1
        while left<right:
            mid=left+(right-left)//2
            if mid>x//mid:
                right=mid
            else:
                ans=mid
                left=mid+1
        return ans
        