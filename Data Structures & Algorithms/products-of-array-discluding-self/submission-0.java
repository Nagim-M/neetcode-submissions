class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] output = new int[length];

        int prefix = 1; int suffix = 1;

        for (int i = 0; i < length; i++) {
            output[i] = prefix;
            prefix *= nums[i];
        }
        for (int i = length - 1; i >= 0; i--) {
            output[i] *= suffix;
            suffix *= nums[i];
        }
        return output;
    }
}  
