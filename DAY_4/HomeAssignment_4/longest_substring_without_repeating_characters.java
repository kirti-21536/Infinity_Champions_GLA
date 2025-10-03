package DAY_4.HomeAssignment_4;

import java.util.HashSet;
import java.util.Set;

public class longest_substring_without_repeating_characters {
    public static void main(String[] args) {
        String s="pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
        
    }
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int left=0;
        int max_len=0;
        for(int i=0;i<s.length();i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
            max_len=Math.max(max_len,i-left+1);
        }

        return max_len;
    }
    
}
