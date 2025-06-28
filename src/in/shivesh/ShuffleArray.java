package in.shivesh;


/**
 https://leetcode.com/problems/shuffle-an-array/
 Given an integer array nums, design an algorithm to randomly shuffle the array. All permutations of the array should be equally likely as a result of the shuffling.

 Implement the Solution class:

 Solution(int[] nums) Initializes the object with the integer array nums.
 int[] reset() Resets the array to its original configuration and returns it.
 int[] shuffle() Returns a random shuffling of the array.
 */
class ShuffleArray {

    int [] nums;
    int [] cur;
    public Solution(int[] nums) {
        this.nums = nums;
        this.reset();
    }

    public int[] reset() {
        this.cur = new int[this.nums.length];
        for(int i=0;i<this.nums.length;i++){
            this.cur[i] = this.nums[i];
        }
        return this.cur;
    }

    public int[] shuffle() {
        int [] nums = this.cur;
        Map<Integer, Integer> s = new HashMap();
        for(int i=0;i<nums.length;i++){
            int r = (int) Math.floor(Math.random() * nums.length);
            if(s.containsKey(r)){
                continue;
            }
            int tmp = nums[r];
            nums[r] = nums[i];
            nums[i] = tmp;
        }

        return nums;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */