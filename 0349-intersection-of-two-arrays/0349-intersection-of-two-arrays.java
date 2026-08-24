class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> s1=new HashSet<>();
        HashSet<Integer> result=new HashSet<>();

        for(int num:nums1){
            s1.add(num);
        }

        for(int num:nums2){
            if(s1.contains(num)){
                result.add(num);
            }
        }

        int resarr[] = new int[result.size()];
        int index=0;
        for(int setelement:result){
            resarr[index++]=setelement;
        }
        return resarr;
    }
}