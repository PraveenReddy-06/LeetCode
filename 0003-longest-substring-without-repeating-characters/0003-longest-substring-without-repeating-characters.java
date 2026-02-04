class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> map = new HashSet<>();
        int max=0;
        int left=0;
        for(int i=0;i<s.length();i++) {
            while(map.contains(s.charAt(i))) {
                map.remove(s.charAt(left));
                left++;
            }
            map.add(s.charAt(i));
            max=Math.max(map.size(),max);
        }
        return max;
    }
}