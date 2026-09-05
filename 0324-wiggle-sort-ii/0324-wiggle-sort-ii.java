class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int mid=(nums.length-1)/2;
        int right=nums.length-1;
        int[] res=new int[right+1];
        int counter=0;

        while(mid>=0 || right>(nums.length-1)/2){
            if(counter%2==0){
                res[counter++]=nums[mid--];
            } else{
                res[counter++]=nums[right--];
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=res[i];
        }
    }
}