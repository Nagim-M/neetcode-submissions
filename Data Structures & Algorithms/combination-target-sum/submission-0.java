class Solution {
    private int[] nums;
    private List<List<Integer>> resultList;

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        this.nums = nums;
        this.resultList = new ArrayList<List<Integer>>();
        backTrack(0, target, new ArrayList<Integer>());
        return resultList;
    }

    public void backTrack(int index, int remainingTarget, List<Integer> currList) {
        if (remainingTarget == 0) {
            resultList.add(new ArrayList<>(currList));
            return;
        }
        if (remainingTarget < 0 || index == nums.length) return;

        int currNum = nums[index];
        currList.add(currNum);
        backTrack(index, remainingTarget - currNum, currList);
        currList.remove(currList.size() - 1);
        backTrack(index + 1, remainingTarget, currList);
    }
}
