class Solution {
    public int maxProduct(int[] arr) {

        if (arr == null || arr.length == 0) return 0;

        int minSoFar = arr[0];   // minimum product ending at current index
        int maxSoFar = arr[0];   // maximum product ending at current index
        int answer = arr[0];     // final maximum product

        for (int i = 1; i < arr.length; i++) {

            int current = arr[i];

            int option1 = current;
            int option2 = current * minSoFar;
            int option3 = current * maxSoFar;

            maxSoFar = Math.max(option1, Math.max(option2, option3));
            minSoFar = Math.min(option1, Math.min(option2, option3));

            answer = Math.max(answer, maxSoFar);
        }

        return answer;
    }
}
