class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = 0;
        Set<Character> charsInWindow = new HashSet<Character>();
        int left = 0;
        int longestLength = 0;

        for (int right = 0; right < s.length(); right++) {
            while (charsInWindow.contains(s.charAt(right))) {
                charsInWindow.remove(s.charAt(left));
                left++;
                length--;
            }
            charsInWindow.add(s.charAt(right));
            length++;
            longestLength = Math.max(longestLength, right - left + 1);
        }
        return longestLength;
    }
}
