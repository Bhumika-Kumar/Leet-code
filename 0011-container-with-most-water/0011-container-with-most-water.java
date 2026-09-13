class Solution {
    public int maxArea(int[] height) {
        int n=height.length-1;
        int left=0,right=n,maxarea=0;
        while(left<right){
            int currheight=Math.min(height[left],height[right]);
            int width=right-left;
            int area=currheight*width;
            maxarea=Math.max(area,maxarea);
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxarea;
    }
}