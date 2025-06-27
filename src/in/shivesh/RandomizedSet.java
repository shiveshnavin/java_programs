package in.shivesh;


/**
 * https://leetcode.com/problems/insert-delete-getrandom-o1/
 * 
 * Insert Delete GetRandom O(1)
bool insert(int val) Inserts an item val into the set if not present. Returns true if the item was not present, false otherwise.
bool remove(int val) Removes an item val from the set if present. Returns true if the item was present, false otherwise.
int getRandom() Returns a random element from the current set of elements (it's guaranteed that at least one element exists when this method is called). Each element must have the same probability of being returned.
You must implement the functions of the class such that each function works in average O(1) time complexity.
 */
class RandomizedSet {

    Map<Integer, Integer> m = new HashMap();
    List<Integer> s = new ArrayList();
    public RandomizedSet() {
        
    }
    
    public void log(String op,Integer val){
        System.out.println(op+" "+val+" : "+s.toString()+" :: "+m.toString());
    }

    public boolean insert(int val) {
        if(m.containsKey(val)){
            return false;
        }
        m.put(val, s.size());
        s.add(val);
        // log("inserted",val);
        return true;
    }
    
    public boolean remove(int val) {
         if(!m.containsKey(val)){
            return false;
        }
        int idx = m.remove(val);
        int lastVal = s.get(s.size() - 1);
        // System.out.println("REMOVING ["+idx+("] = "+s.get(idx))+" last="+lastVal);

        m.put(lastVal, idx);
        s.set(idx, lastVal);
        s.remove(s.size() - 1 );
        m.remove(val);
        // log("removed",val);

        return true;
    }
    
    public int getRandom() {
        double rand = Math.random();
        int idx = (int) Math.round(rand * s.size());
        // log("random", idx);

        return s.get(Math.min(idx, s.size() - 1));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */