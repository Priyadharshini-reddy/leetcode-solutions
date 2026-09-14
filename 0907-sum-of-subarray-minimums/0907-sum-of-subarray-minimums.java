

class Solution {
    public int sumSubarrayMins(int[] arr) {

        int n = arr.length;

        int[] prev = new int[n];
        int[] next = new int[n];

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        // Previous Smaller (strictly smaller)
        for (int i = n - 1; i >= 0; i--) {

            while (!s1.isEmpty() &&
                   arr[s1.peek()] > arr[i]) {

                prev[s1.pop()] = i;
            }

            s1.push(i);
        }

        while (!s1.isEmpty()) {
            prev[s1.pop()] = -1;
        }

        // Next Smaller or Equal
        for (int i = 0; i < n; i++) {

            while (!s2.isEmpty() &&
                   arr[s2.peek()] >= arr[i]) {

                next[s2.pop()] = i;
            }

            s2.push(i);
        }

        while (!s2.isEmpty()) {
            next[s2.pop()] = n;
        }

        long ans = 0;
        long MOD = 1_000_000_007;

        for (int i = 0; i < n; i++) {

            long leftChoices = i - prev[i];
            long rightChoices = next[i] - i;

            ans = (ans +
                  (long)arr[i] * leftChoices * rightChoices)
                  % MOD;
        }

        return (int) ans;
    }
}