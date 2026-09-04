class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> res =new ArrayList<>();
        int minDiff=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            int currmin=arr[i]-arr[i-1];
            if(currmin<minDiff){
                res=new ArrayList<>();
                minDiff=currmin;
            }
            if(currmin==minDiff){
                res.add(Arrays.asList(arr[i-1],arr[i]));
            }
            
        }
        return res;
    }
}