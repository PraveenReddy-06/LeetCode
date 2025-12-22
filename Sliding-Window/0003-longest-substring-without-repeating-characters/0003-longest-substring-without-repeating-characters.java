class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left=0;
        int max=0;

        for(char c : s.toCharArray()) {
            while(set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            max=Math.max(max,set.size());
        }
        return max;
    }
}