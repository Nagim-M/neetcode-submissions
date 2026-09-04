class Solution {
    private List<List<Integer>> listOfSubsets;
    private int[] nums;

    public List<List<Integer>> subsets(int[] nums) {
        this.listOfSubsets = new ArrayList<List<Integer>>();
        this.nums = nums;

        backTrack(0, new ArrayList<>());
        return listOfSubsets;
    }

    public void backTrack(int index, List<Integer> currSet) {
        if (index == nums.length){
            listOfSubsets.add(new ArrayList<>(currSet));
            return;
        } 
        
        currSet.add(nums[index]);
        backTrack(index + 1, currSet);
        currSet.remove(currSet.size() - 1);
        backTrack(index + 1, currSet);
    }
}
