public class MaxWaterArea {
    public int maxArea(int[] height) {
        int maxCap = height[0] > height[height.length - 1] ? height[height.length - 1] * (height.length - 1) : height[0] * (height.length - 1);
        for (int i = 0, j = height.length - 1; i < j; ) {
            int newCap = 0;
            if (height[i] > height[j]) {
                newCap = height[i] > height[--j] ? height[j] * (j - i) : height[i] * (j - i);
            } else {
                newCap = height[++i] > height[j] ? height[j] * (j - i) : height[i] * (j - i);
            }
            maxCap = maxCap > newCap ? maxCap : newCap;
        }

        return maxCap;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = new MaxWaterArea().maxArea(height);
    }
}
