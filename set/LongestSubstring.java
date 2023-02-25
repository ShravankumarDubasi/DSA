package set;

import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {

       String s="abcdbbef";

            HashSet<Character> set = new HashSet<>();
            int n = s.length();
            int count = 0, left = 0, right = 0, max_count = 0;
            for (int i = 0; i < n; i++) {
                if (!set.contains(s.charAt(right))) {
                    set.add(s.charAt(right));
                    right++;
                } else {
                    while (set.contains(s.charAt(right))) {


                        set.remove(s.charAt(left));
                        left++;
                    }
                    set.add(s.charAt(right));
                    right++;
                }
                count = right - left ;
                max_count = Math.max(max_count, count);
            }
            System.out.println(max_count);


    }
}
