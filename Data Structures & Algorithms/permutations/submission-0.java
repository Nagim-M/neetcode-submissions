class Solution {
    private int[] nums;
    private List<List<Integer>> permutations;

    public List<List<Integer>> permute(int[] nums) {
        this.nums = nums;
        this.permutations = new ArrayList<List<Integer>>();
        backTrack(new ArrayList<>(), new boolean[nums.length]);
        return this.permutations;
    }

    public void backTrack(List<Integer> list, boolean[] picked) {
        if (list.size() == nums.length) {
            permutations.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < picked.length; i++) {
            if (picked[i] == false) {
                list.add(nums[i]);
                picked[i] = true;

                backTrack(list, picked);
                list.remove(list.size() - 1);
                picked[i] = false;
            }
        }
    }
}
