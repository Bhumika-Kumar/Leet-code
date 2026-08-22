class Solution {
    public int longestPalindrome(String s) {
        int[] hash =new int[128];
        for(char ch:s.toCharArray()){
            hash[ch-'0']++;
        }
        boolean flag=false;
        int res=0;
        for(int i: hash){
            if(i%2==0){
                res+=i;//res+=i/2
            }
            else{
                flag=true;
                res+=(i-1); // res+=(i-1)/2
            }
        }
        return flag ? res+1 :res; // return flag ? (res*2)+1 : (res*2)
    }
}