public class Rotate {
    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        if (k == 0) {
            return;
        }
        for (int i = 0, count = 0; count < nums.length; i++) {
            int current = i;
            int prevValue = nums[i];
            do {
                int idx = (current + k) % nums.length;
                int newValue = nums[idx];
                nums[idx] = prevValue;
                prevValue = newValue;
                current = idx;
                count++;
            } while (current != i);

        }
    }

    public static void main(String[] args) {
        int[] nums = {-1,-100,3,99};
        rotate(nums, 2);
    }
}
