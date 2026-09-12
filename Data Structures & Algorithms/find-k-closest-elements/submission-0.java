class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int windowSize = arr.length;
        int left = 0;
        int right = arr.length - 1;

        while (windowSize > k) {
            if (Math.abs(arr[left] - x) > Math.abs(arr[right] - x)) left++;
            else right--;

            windowSize--;
        }
        
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            result.add(arr[i]);
        }
        return result;
    }
}