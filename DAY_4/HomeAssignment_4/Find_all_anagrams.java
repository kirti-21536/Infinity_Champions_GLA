import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_all_anagrams {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        System.out.println(findAnagrams(s,p));
    }
    public static  List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;

        int[] pCount = new int[26];
        int[] sCount = new int[26];
        for (char ch : p.toCharArray()) {
            pCount[ch - 'a']++;
        }
        int window = p.length();

        for (int i = 0; i < s.length(); i++) {
            sCount[s.charAt(i) - 'a']++;
            
            if (i >= window) {
                sCount[s.charAt(i - window) - 'a']--;
            }
            if (Arrays.equals(sCount, pCount)) {
                result.add(i - window + 1);
            }
        }
        return result;
           
    }
    
}
