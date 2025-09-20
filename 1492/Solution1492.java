class Solution1492 {
    public int kthFactor(int n, int k) {

        int result = -1;
        int num = 1;
        int count = 1;
        while (num <= n && count <= k) {
            if (n % num == 0) {
                if (count == k) {
                    result = num;
                    break;
                }
                count++;
            }
            
            num++;
        }

        return result;
    }
}