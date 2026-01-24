class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int n = arr.length;
        if(n<2) return n;
        if (n == 2 && arr[1]!=arr[0]) return n;
        if (n == 2 && arr[1]==arr[0]) return 1;

        int max = 1;
        int k = 2; 

        for (int i = 1; i < n - 1; i++) {
            if ((arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) ||
                (arr[i - 1] > arr[i] && arr[i] < arr[i + 1])) {
                k++;
            } else {
                k = (arr[i] == arr[i + 1]) ? 1 : 2;
            }
            max = Math.max(max, k);
        }

        return max;
    }
}
