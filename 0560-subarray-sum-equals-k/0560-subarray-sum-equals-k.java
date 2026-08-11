class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        if(n==0){
            return 0;
        }
        int count=0;
        int prefixsum=0;
        Map<Integer, Integer> map=new HashMap<>();
        map.put(0,1);
        for (int i=0;i<n;i++){
            prefixsum+=nums[i];
            int diff=prefixsum-k;
            if(map.containsKey(diff)){
                count+=map.get(diff);
            }
            map.put(prefixsum,map.getOrDefault(prefixsum,0)+1);
        }
        return count;
    }
}