class Solution704 {
    public int search(int[] nums, int target) {

        for (int l = 0, r = nums.length - 1; l <= r; ){
            int mid = l + (r - l) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (target > nums[mid]) {
                l = mid + 1;
            } else if (target < nums[mid]) {
                r = mid - 1;
            }
        }

        return -1;
    }

}