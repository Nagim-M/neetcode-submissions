class Solution {
    public int maxArea(int[] heights) {
        int i = 0; int j = heights.length - 1;
        int highestArea = 0;
        int heightFirst = 0; int heightSecond = 0;

        while (i < j) {
            heightFirst = heights[i]; heightSecond = heights[j];
            int currArea = (j - i) * Math.min(heightFirst, heightSecond);
            highestArea = Math.max(highestArea, currArea);
            if (heightFirst < heightSecond) i++;
            else j--;
        }
        return highestArea;
    }
}
