class Solution {
    List<List<Integer>> combinations;
    int[] sortedCandidates;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        this.combinations = new ArrayList<>();

        this.sortedCandidates = candidates;
        Arrays.sort(sortedCandidates);

        backtrack(0, target, new ArrayList<>());
        return combinations;
    }

    public void backtrack(int index, int remainingTarget, List<Integer> currList) {
        if (remainingTarget == 0) {
            combinations.add(new ArrayList<>(currList));
            return;
        }

        if (remainingTarget < 0 || index == sortedCandidates.length || sortedCandidates[index] > remainingTarget) return;

        currList.add(sortedCandidates[index]);
        backtrack(index + 1, remainingTarget - sortedCandidates[index], currList);
        currList.remove(currList.size() - 1);

        while (index + 1 < sortedCandidates.length && sortedCandidates[index] == sortedCandidates[index + 1]) index++;
        backtrack(index + 1, remainingTarget, currList);
    } 
}