import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
//    public static boolean isAnagram(String s, String t) {
//        if (s.length() != t.length()) {
//            return false;
//        }
//
//        Map<Character, Integer> map = new HashMap<Character, Integer>();
//        for (int i = 0; i < s.length(); i++) {
//            Integer count = map.get(s.charAt(i));
//            map.put(s.charAt(i), count == null ? 1 : count + 1);
//        }
//
//        for (int i = 0; i < t.length(); i++) {
//            if (!map.containsKey(t.charAt(i))) {
//                return false;
//            }
//            int v = map.get(t.charAt(i));
//            if (v - 1 < 0) {
//                return false;
//            } else {
//                map.put(t.charAt(i), v - 1);
//            }
//        }
//
//        return true;
//    }
//
//    public static boolean isAnagram(String t, String s) {
//        if (t.length() != s.length()) {
//            return false;
//        }
//
//        int[] table = new int[26];
//        for (int i = 0; i < t.length(); i++) {
//            table[t.charAt(i) - 'a'] += 1;
//        }
//
//        for (int i = 0; i < s.length(); i++) {
//            table[s.charAt(i) - 'a'] -= 1;
//        }
//
//        for (int i = 0; i < table.length; i++) {
//            if (table[i] < 0) {
//                return false;
//            }
//        }
//
//        return true;
//    }

    public static boolean isAnagram(String t, String s) {
        if (t.length() != s.length()) {
            return false;
        }
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        return Arrays.equals(sArray, tArray);
    }
    public static void main(String[] args) {
        isAnagram("anagram", "nagaram");
    }
}
