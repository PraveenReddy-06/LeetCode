class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (s.length() < p.length()) return res;

        int[] freq = new int[26];

        for (int i = 0; i < p.length(); i++) {
            freq[p.charAt(i) - 'a']++;
        }

        int left = 0;
        int count = p.length();

        for (int right = 0; right < s.length(); right++) {

            char r = s.charAt(right);
            if (freq[r - 'a'] > 0) {
                count--;
            }
            freq[r - 'a']--;

            if (right - left + 1 == p.length()) {

                if (count == 0) {
                    res.add(left);
                }

                char l = s.charAt(left);
                if (freq[l - 'a'] >= 0) {
                    count++;
                }
                freq[l - 'a']++;
                left++;
            }
        }
        return res;
    }
}
