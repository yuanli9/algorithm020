import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

public class TopK {
    public static int[] topKFrequent(int[] nums, int k) {
        if (nums.length < 0 || k < 0) {
            return new int[0];
        }


        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        PriorityQueue pq = new PriorityQueue(Comparator.comparingInt(map::get));

        for (int key : map.keySet()) {
            if (pq.size() < k) {
                pq.add(key);
            } else if (map.get(key) > map.get(pq.peek())) {
                pq.remove();
                pq.add(key);
            }
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = (int)pq.poll();
        }

        return result;
    }
}
