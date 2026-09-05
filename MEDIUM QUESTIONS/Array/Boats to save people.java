class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n = people.length;
        int ans = 0;
        int p1 = 0;
        int p2 = n - 1;
        Arrays.sort(people);

        while (p1 <= p2) {
            int currentWeight = limit;
            int maxPeople = 2;
            while (p2 >= 0 && currentWeight - people[p2] >= 0) {
                if (maxPeople == 0) {
                    break;
                }
                currentWeight -= people[p2];
                p2--;
                maxPeople--;

            }
            while (currentWeight - people[p1] >= 0) {
                if (maxPeople == 0) {
                    break;
                }
                currentWeight -= people[p1];
                p1++;
                maxPeople--;

            }
            ans++;
        }
        return ans;
    }
}