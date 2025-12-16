class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq = new int[26];
        int[] win = new int[26];
        if(s1.length()>s2.length()) return false;
        for(char c : s1.toCharArray()) {
            freq[c-'a']++;
        }
        for(int i=0;i<s1.length();i++) {
            win[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(freq,win)) return true;

        for(int j= s1.length();j<s2.length();j++) {

            win[s2.charAt(j)-'a']++;
            win[s2.charAt(j-s1.length())-'a']--;

            if(Arrays.equals(win,freq)) return true;
        }
        return false;
    }
}