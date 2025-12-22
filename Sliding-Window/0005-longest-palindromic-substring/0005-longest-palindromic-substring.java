class Solution {
    public String longestPalindrome(String s) {
        int len= s.length();
        if(len ==0 || len ==1) return s;
        int res=1;
        int i,right,left;
        int start=0;
        for(i=1;i<len-1;i++) {
                left=i-1; right=i+1;
                while(left>=0 && right<len && s.charAt(left)==s.charAt(right)) {
                        left--;
                        right++;
                }
                if(right - left - 1 > res) {
                res = right - left - 1;
                start = left + 1;
                }
            }
        for(i=0;i<len-1;i++) {
                left=i; right=i+1;
                while(left>=0 && right<len && s.charAt(left)==s.charAt(right) ) {
                        left--;
                        right++;
                }
               if (right - left - 1 > res) {
                res = right - left - 1;
                start = left + 1;
                }
        }
        return s.substring(start,start+res);
    }
}