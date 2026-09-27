class Solution {
    private static String reverse(String a){
        return (new StringBuilder(a).reverse()).toString();
    }
    public String reverseParentheses(String s) {
        Stack<String> stack=new Stack<>();
        String ans="";
        for (char c:s.toCharArray()){
            if(c=='('){
                stack.push(ans);
                ans="";
            }
            else if(c==')'){
                ans=stack.pop()+reverse(ans);
            }
            else{
                ans+=c;
            }
        }
        return ans;
    }
}