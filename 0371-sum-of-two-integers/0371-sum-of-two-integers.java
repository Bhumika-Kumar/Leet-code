class Solution {
    public int getSum(int a, int b) {
        int sum = 0;
        List<Integer> list = new LinkedList<>();
        list.add(a);
        list.add(b);
        while(!list.isEmpty()) {
            sum += list.get(0);
            list.remove(0);
        }

        return sum;   
    }
}