class RandomizedSet {
    private HashMap<Integer,Integer> map;
    private ArrayList<Integer> arr;
    private Random random;

    public RandomizedSet() {
        map=new HashMap<>();
        arr=new ArrayList<>();
        random=new Random();
    }
    
    public boolean insert(int val) {
        boolean is_exist=map.containsKey(val);
        if(!is_exist){
            arr.add(val);
            map.put(val,arr.size()-1);
        }
        return !is_exist;
        
    }
    
    public boolean remove(int val) {
        boolean is_exist=map.containsKey(val);
        if(is_exist){
            int index=map.get(val);
            int lastval=arr.get(arr.size()-1);
            arr.set(index,lastval);
            map.put(lastval,index);

            arr.remove(arr.size()-1);
            map.remove(val);
        }
        return is_exist;
    }
    
    public int getRandom() {
        int idx=random.nextInt(arr.size());
        return arr.get(idx);
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */