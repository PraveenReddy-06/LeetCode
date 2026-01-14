import java.util.*;

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - arr[i - 1];

            if (diff < min) {
                min = diff;
                list.clear(); 
            }
            if (diff == min) {
                list.add(Arrays.asList(arr[i - 1], arr[i]));
            }
        }
        return list;
    }
}
