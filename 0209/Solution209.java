class Solution209 {
    public int minSubArrayLen(int target, int[] nums) {
        int[] prefix = new int[nums.length + 1];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i - 1];
        }

        var minLength = Integer.MAX_VALUE;
        var start = 0;

        while (start < nums.length) {
            var next = start + 1;
            var end = nums.length;
            while (next <= end) {
                var mid = next + (end - next) / 2;
                if (prefix[mid] - prefix[start] >= target) {
                    minLength = Math.min(mid - start, minLength);
                    end = mid - 1;
                } else {
                    next = mid + 1;
                }
            }

            start++;
            
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;

    }
}