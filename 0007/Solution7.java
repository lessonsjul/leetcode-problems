class Solution7 {
    public int reverse(int x) {
        int target = Math.abs(x);
        int result = 0;

        while (target > 0) {
            if (Integer.MAX_VALUE / 10 < result || Integer.MAX_VALUE - (result * 10) < target % 10) {
                return 0;
            }

            result = result * 10 + target % 10;
            target = target / 10;
        }

        return x < 0 ? -result : result;
    }
}