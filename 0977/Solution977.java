class Solution977 {
    public int[] sortedSquares(int[] nums) {
        int[] results = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        for (int i = right; i >= 0; i--) {
            int valueL = Math.abs(nums[left]);
            int valueR = Math.abs(nums[right]);

            if (valueL > valueR) {
                results[i] = valueL * valueL;
                left++;
            } else {
                results[i] = valueR * valueR;
                right--;
            }
        }

        return results;
    }
}