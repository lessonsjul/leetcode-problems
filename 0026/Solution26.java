import java.util.HashMap;

class Solution26 {
    public static int removeDuplicates(int[] nums) {
        int cursor = 0;
        int duplicationGap = 0;
        var map = new HashMap<Integer, Boolean>();
        while (cursor < nums.length && cursor + duplicationGap < nums.length) {
            int current = nums[cursor];
            boolean numExists = map.getOrDefault(current, false);

            if (numExists) {
                duplicationGap++;
            } else {
                map.put(current, true);
                cursor++;
            }

            if (duplicationGap > 0 && cursor + duplicationGap < nums.length) {
                swap(nums, cursor, cursor + duplicationGap);
            }
        }

        return map.size();
    }

    public static void swap(int[] nums, int prev, int next) {
        int tmp = nums[prev];
        nums[prev] = nums[next];
        nums[next] = tmp;
    }
}