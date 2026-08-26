class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet hs = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            if (hs.contains(curr)) return true;
            hs.add(curr);

        }
        return false;
    }
}