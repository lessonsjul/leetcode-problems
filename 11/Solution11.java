class Solution11 {
    public int maxArea(int[] height) {
        if (height == null || height.length <= 1) {
            return 0;
        }

        int start = 0, end = height.length - 1;
        int maxArea = 0;


        while (start < end) {
            var left = height[start];
            var right = height[end];
            var columns = end - start;
            var area = Math.min(left, right) * columns;

            if (area > maxArea) {
                maxArea = area;
            }

            if (height[start] > height[end]) {
                end--;
            } else {
                start++;
            }
        }

        return maxArea;
    }
}