class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq= new int[26];
        int[] win = new int[26];
        if(s1.length()>s2.length()) return false;

        for(char c:s1.toCharArray()) {
            freq[c-'a']++;
        }
        for(int i=0;i<s1.length();i++) {
            win[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(freq,win)) return true;
        int left=0;
        for(int right=s1.length();right< s2.length();right++) {
            win[s2.charAt(right)-'a']++;
            win[s2.charAt(left)-'a']--;
            left++;
            if(Arrays.equals(freq,win)) return true;
        }
        return false;
    }
}