class Solution69 {
    public int mySqrt(int x) {
        long left = 1, right = x, mid = (left + right) / 2;

        while (left <= right) {
            long res = mid * mid;
            if (res == x) {
                return (int) mid;
            } if (res > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
            mid = (left + right) / 2;
        }

        return (int)mid;
    }
}