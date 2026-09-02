class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] frequencyS1 = new int[26]; int[] frequencyS2 = new int[26];

        for (char c : s1.toCharArray()) {
            frequencyS1[c - 'a']++;
        }

        int k = s1.length();
        for (int i = 0; i < k; i++) {
            frequencyS2[s2.charAt(i) - 'a']++;
        }
        if (Arrays.equals(frequencyS1, frequencyS2)) return true;
        
        for (int right = k; right < s2.length(); right++) {
            frequencyS2[s2.charAt(right) - 'a']++;
            frequencyS2[s2.charAt(right - k) - 'a']--;
            if (Arrays.equals(frequencyS1, frequencyS2)) return true;

        }
        return false; 
    }
}