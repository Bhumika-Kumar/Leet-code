class Solution {
    public String capitalizeTitle(String title) {
        char[] charray= title.toCharArray();
        int len=charray.length;

        for(int i=0;i<len;i++){
            int firstindex=i;
            while(i<len && charray[i]!=' '){
                charray[i]=Character.toLowerCase(charray[i]);
                i++;
            }
            if(i-firstindex > 2){
                charray[firstindex]=Character.toUpperCase(charray[firstindex]);
            }
        }
        return String.valueOf(charray);
    }
}