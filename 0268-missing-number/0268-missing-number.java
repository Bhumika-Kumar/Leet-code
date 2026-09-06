public class Solution {
    public int missingNumber(int[] nums) {
        //cyclic sort
        
        // int i=0;
        // while(i<nums.length){
        //     int correct=nums[i];
        //     if(nums[i]<nums.length && nums[i]!=nums[correct]){
        //         int temp=nums[i];
        //         nums[i]=nums[correct];
        //         nums[correct]=temp;
        //     }
        //     else{
        //         i++;
        //     }
        // }
        // for(int index=0;index<nums.length;index++){
        //     if(nums[index]!=index){
        //         return index;
        //     }
        // }
        // return nums.length;

        int missing = nums.length;
        
        for (int i = 0; i < nums.length; i++) {
            missing ^= nums[i] ^ i;
        }
        
        return missing;

    }
}
