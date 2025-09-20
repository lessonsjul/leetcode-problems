class Solution42 {
    public int trap(int[] height) {
        var totalWater = 0;

        int start = 0, end = height.length - 1;
        int maxLeft = 0, maxRight = 0;

        while (start < end) {
            if (height[start] <= height[end]) {
                maxLeft = Math.max(height[start], maxLeft);
                totalWater += maxLeft - height[start];
                start++;
            } else {
                maxRight = Math.max(height[end], maxRight);
                totalWater += maxRight - height[end];
                end--;
            }
        }

        return totalWater;

    }
}