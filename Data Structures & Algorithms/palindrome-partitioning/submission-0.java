class Solution {
    private List<List<String>> palindromes;
    private String s;

    public List<List<String>> partition(String s) {
        this.palindromes = new ArrayList<>();
        this.s = s;
        backtrack(0, new ArrayList<>());
        return palindromes;
    }

    public void backtrack(int start, List<String> currentList) {
        if (start == s.length()) {
            palindromes.add(new ArrayList<>(currentList));
            return;
        }

        for (int end = start; end < s.length(); end++) {
            if (isPalindrome(start, end)) {
                currentList.add(s.substring(start, end + 1));
                backtrack(end + 1, currentList);
                currentList.remove(currentList.size() - 1);
            }
        } 
    }

    public boolean isPalindrome(int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++; right--;
        }
        return true;
    }
}
