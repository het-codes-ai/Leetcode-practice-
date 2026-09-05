class Solution {
    public int[] sortTransformedArray(int[] nums, int a, int b, int c) {
        int n = nums.length;
        int[] ans = new int[n];

        int p1 = 0;
        int p2 = n - 1;

        if (a > 0) {
            int p4 = n - 1;

            while (p1 <= p2) {
                long left = (long) a * nums[p1] * nums[p1]
                          + (long) b * nums[p1] + c;

                long right = (long) a * nums[p2] * nums[p2]
                           + (long) b * nums[p2] + c;

                if (left > right) {
                    ans[p4--] = (int) left;
                    p1++;
                } else {
                    ans[p4--] = (int) right;
                    p2--;
                }
            }

        } else if (a < 0) {
            int p3 = 0;

            while (p1 <= p2) {
                long left = (long) a * nums[p1] * nums[p1]
                          + (long) b * nums[p1] + c;

                long right = (long) a * nums[p2] * nums[p2]
                           + (long) b * nums[p2] + c;

                if (left < right) {
                    ans[p3++] = (int) left;
                    p1++;
                } else {
                    ans[p3++] = (int) right;
                    p2--;
                }
            }

        } else {
            // a == 0 → linear function: bx + c

            if (b >= 0) {
                for (int i = 0; i < n; i++) {
                    ans[i] = b * nums[i] + c;
                }
            } else {
                for (int i = 0; i < n; i++) {
                    ans[i] = b * nums[n - 1 - i] + c;
                }
            }
        }

        return ans;
    }
}