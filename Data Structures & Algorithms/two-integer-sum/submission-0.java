class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            int difference = target - curr;
            Integer prevIndex = hashMap.get(difference);

            if (prevIndex != null) return new int[]{prevIndex, i};
            
            hashMap.put(curr, i);
        }
        return null;
    }
}