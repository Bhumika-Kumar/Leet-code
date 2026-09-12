class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map<Integer,Integer> map=new HashMap<>();
      for(int i=0;i<nums.length;i++){
        int currentvalue=target-nums[i];
        if(map.containsKey(currentvalue)){
            return new int[]{map.get(currentvalue),i};
        } else{
            map.put(nums[i],i);
        }
      }
      return new int[]{-1,-1};
    }
}