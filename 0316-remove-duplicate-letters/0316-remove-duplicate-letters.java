import java.util.*;

class Solution {
    public String removeDuplicateLetters(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) freq[c - 'a']++;

        Stack<Character> stack = new Stack<>();
        HashSet<Character> set = new HashSet<>();

        for (char c : s.toCharArray()) {
            freq[c - 'a']--;

            if (set.contains(c)) continue;

            while (!stack.isEmpty() && stack.peek() > c && freq[stack.peek() - 'a'] > 0) {
                char removed = stack.pop();
                set.remove(removed);
            }

            stack.push(c);
            set.add(c);
        }

        StringBuilder res = new StringBuilder();
        for (char c : stack) res.append(c);

        return res.toString();
    }
}
