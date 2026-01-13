import java.util.*;

class Solution {
    public int sumSubarrayMins(int[] arr) {
        long MOD = 1000000007L;
        Stack<Integer> stack = new Stack<>();
        long sum = 0;

        for (int i = 0; i <= arr.length; i++) {
            int cur = (i == arr.length) ? 0 : arr[i];

            while (!stack.isEmpty() && arr[stack.peek()] > cur) {
                int x = stack.pop();
                int left = stack.isEmpty() ? -1 : stack.peek();

                long len = (long)(x - left) * (i - x);
                sum = (sum + arr[x] * len) % MOD;
            }

            stack.push(i);
        }

        return (int) sum;
    }
}
