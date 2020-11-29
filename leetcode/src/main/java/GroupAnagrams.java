import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<String, List<String>>();

        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sortedStr = Arrays.toString(chars);
            List<String> result = map.containsKey(sortedStr) ? map.get(sortedStr):new ArrayList<String>();
            result.add(strs[i]);
            map.put(sortedStr, result);
        }

        List<List<String>> result = new ArrayList<List<String>>();
        for (String str : map.keySet()) {
            result.add(map.get(str));
        }

        return result;
    }
}
