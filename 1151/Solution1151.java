class Solution1151 {
    public int minSwaps(int[] data) {
        int ones = 0;

        for (int one: data) {
            ones += one;
        }

        int currentOnesInWindow = 0;
        int maxOnesInWindow = 0;

        for (int i = 0; i < data.length; i++) {
            currentOnesInWindow += data[i];

            if (i >= ones) {
                currentOnesInWindow -= data[i - ones];
            }

            maxOnesInWindow = Math.max(maxOnesInWindow, currentOnesInWindow);
        }

        return ones - maxOnesInWindow;
    }
}