class Solution2405 {
    public int partitionString(String s) {
        var map = new int[256];

        var chars = s.toCharArray();
        int start = 0, end = 0, count = 1;

        while (end < s.length()) {
            if (map[chars[end++]]++ > 0) {
                if (end - start > 0) {
                    count++;
                }

                while (start < end - 1) {
                    map[chars[start++]]--;
                }
            }
        }

        return count;
    }
}