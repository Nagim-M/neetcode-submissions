class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        Set<Integer> hs = new HashSet<>();
        for (int num : nums) {
            hs.add(num);
        }

        int count = 1;
        int highestCount = 0;
        Iterator<Integer> iterator = hs.iterator();

        while (iterator.hasNext()) {
            Integer curr = iterator.next();
            if (hs.contains(curr - 1)) {
                continue;
            }
            while (hs.contains(curr + 1)) {
                count++;
                curr++;
            }
            if (count > highestCount) {
                highestCount = count;
            }
            count = 1;
        }

        return highestCount;
    }
}
