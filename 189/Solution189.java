class Solution189 {
    public void rotate(int[] nums, int k) {
        int steps = k % nums.length;
        int count = 0;
        for (int i = 0; count < nums.length; i++) {
            int currentIndex = i;
            int prev = nums[i];

            do {
                var nextIndex = (currentIndex + steps) % nums.length;
                var tmp = nums[nextIndex];
                nums[nextIndex] = prev;
                prev = tmp;

                currentIndex = nextIndex;
                count++;
            } while (i != currentIndex);

        }
    }
}