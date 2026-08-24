class Solution {
    public int singleNumber(int[] nums) {
        // this approach is just reference for hashmap but in this program they said constant space so we can't use hashmap
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int num:nums){
            // if(map.containsKey(num)){
            //     int freq=map.get(num);
            //     map.put(num,freq+1);
            // } else{
            //     map.put(num,1);
            // }

           map.put(num, map.getOrDefault(num,0)+1);
        }
        for(Map.Entry <Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return -1;
    }
}