class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<Integer>();
        for(int num:nums) set.add(num);
        int count=0;
        //If we traverse in org array we get time limit exceeded becoz there may be many duplicate values like 0 0 every time we traverse it get executed again and again it will exceed the time limit so we traverse through set where duplicate values neglected
        for(int num:set){
            if(!set.contains(num-1)){
                int currcount=0;
                int j=num;
                while(set.contains(j)){
                    j++;
                    currcount++;
                }
                count=Math.max(count,currcount);
            }
        }
        return count;
    }
}