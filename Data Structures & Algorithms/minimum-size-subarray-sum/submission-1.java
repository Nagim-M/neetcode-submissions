class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE;
        int i = 0;
        int currSum = 0;
    
        for (int j = 0; j < nums.length; j++) {
            currSum += nums[j];

            while (currSum >= target) {
                minLength = Math.min(minLength, j - i + 1);
                currSum -= nums[i];
                i++;
            }
        }
        return (minLength == Integer.MAX_VALUE ? 0 : minLength);
    }
}