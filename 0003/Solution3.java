class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        int[] dictionary = new int[256];

        var chars = s.toCharArray();

        int start = 0, end = 0, maxLength = 0;

        while (end < s.length()) {
            if (dictionary[chars[end]]++ > 0) {
                while (start <= end && dictionary[chars[end]] > 1) {
                    dictionary[chars[start++]]--;
                }
            }

            end++;
            maxLength = Math.max(end - start, maxLength);
        }

        return maxLength;
    }
}