class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        int num1;
        int num2;
        for(String i:tokens){
            switch(i){
                case "+"-> stack.push(stack.pop()+stack.pop());
                case "-"->{
                    num1=stack.pop();
                    num2=stack.pop();
                    stack.push(num2-num1);
                }
                case "*"-> stack.push(stack.pop()*stack.pop());
                case "/"-> {
                    num1=stack.pop();
                    num2=stack.pop();
                    stack.push(num2/num1);
                }
                default -> stack.push(Integer.parseInt(i));
            }
        }
        return stack.pop();
    }
}