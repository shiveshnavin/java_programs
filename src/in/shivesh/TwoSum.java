package in.shivesh;


/**
 * https://leetcode.com/problems/two-sum/description/
 * 
 * 
 * 
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
 */
class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> n = new HashMap();
        int[] r = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int l = target - nums[i];
            if (n.containsKey(l)) {
                int t = n.get(l);
                if (t != i) {
                    r[0] = t;
                    r[1] = i;
                    break;
                }
            }
            n.put(nums[i], i);
        }

        return r;
    }
}