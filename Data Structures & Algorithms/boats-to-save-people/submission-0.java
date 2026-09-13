class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int i = 0; int j = people.length - 1;
        int boatCount = 0;
        int currBoatWeight = 0;

        Arrays.sort(people);

        while (i <= j) {
            boatCount++;
            if (people[i] + people[j] <= limit) i++; 
            j--;
        }
        return boatCount;
    }
}
// [1. 2. 4. 5]