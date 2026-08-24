class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] hash = new int[128];// space complexity is O(n) because even though we initialized new array the size is 128 we declared so no matter how long the input is it will always come under this 128 suppose if put size as n (dynamic array) then it can be O(n) but here since we declared the size 128 it is constant
        for(char ch:magazine.toCharArray()){
            hash[ch-'0']++;
        }
        for(char ch:ransomNote.toCharArray()){
            hash[ch-'0']--;
        }
        for(int i:hash){
            if(i<0){
                return false;
            }
        }
        return true;
        

    }
}