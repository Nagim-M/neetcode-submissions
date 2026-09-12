class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int threshold = nums.length / 3;

        for (Integer num : nums) {
            freqMap.merge(num, 1, Integer :: sum);
        }

        List<Integer> result = new ArrayList<>();

        for (Map.Entry<Integer, Integer> e : freqMap.entrySet()) {
            if (e.getValue() > threshold) {
                result.add(e.getKey());
            }
        }
        return result;
    }
}