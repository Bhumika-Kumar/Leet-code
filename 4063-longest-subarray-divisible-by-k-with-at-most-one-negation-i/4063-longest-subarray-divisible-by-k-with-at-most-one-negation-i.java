class Solution {
    public int longestSubarray(int[] nums, int k) {
        int N = nums.length;
        int ans = 0;
        //System.out.println((-37)%13);
        for(int i=0;i<N;i++){
            Set<Integer> set = new HashSet<>();
            long sum = 0;
            for(int j=i;j<N;j++){
                int x = (nums[j] + nums[j])%k;
                set.add((x+k)%k);
                sum += nums[j];
                boolean flag = false;
                if(sum%k == 0){
                    flag = true;
                }else{
                    int r = (int)(sum%k);
                    r = (r+k)%k;
                    if((set.contains(r))){
                        flag = true;
                    }
                }
                if(flag)ans = Math.max(ans, j-i+1);
            }
        }

        return ans;
    }
}