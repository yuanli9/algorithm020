public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {

        int p = 0, q = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[q] == nums[p]) {
                q++;
            } else {
                nums[++p] = nums[q++];
            }
        }

        return p;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        removeDuplicates(nums);
    }
}
