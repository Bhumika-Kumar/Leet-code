class Solution:
    def maxArea(self, height: List[int]) -> int:
        left,right,maxarea=0,len(height)-1,0
        while left<right:
            currheight=min(height[left],height[right])
            width=right-left
            area=currheight*width
            maxarea=max(area,maxarea)
            if height[left]<height[right]:
                left+=1
            else:
                right-=1
        return maxarea
        