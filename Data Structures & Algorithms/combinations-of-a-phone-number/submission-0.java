class Solution {
    List<String> combinations;
    String[] mapping;
    String digits;
    
    public List<String> letterCombinations(String digits) {
        this.combinations = new ArrayList<>();
        if (digits.isEmpty()) return this.combinations;

        this.digits = digits;
        this.mapping = new String[] {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        backtrack(new StringBuilder(), 0);
        return combinations;    
    }

    public void backtrack(StringBuilder sb, int index) {
        if (index == digits.length()) {
            combinations.add(sb.toString());
            return;
        }

        int currNum = digits.charAt(index) - '0';
        for (int i = 0; i < mapping[currNum].length(); i++) {
            sb.append(mapping[currNum].charAt(i));
            backtrack(sb, index + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}