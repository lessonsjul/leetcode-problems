class Solution5 {
    public String longestPalindrome(String s) {
        var chars = s.toCharArray();
        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentSize = end - start + 1;
            int left = i;
            int right = i;

            while (left >= 0 && right < chars.length && chars[left] == chars[right]) {
                left--;
                right++;
            }

            int size = right - left - 1;

            if (size > currentSize) {
                var dist = size / 2;
                start = i - dist;
                end = i + dist;
            }

            left = i;
            right = i + 1 ; // even length palidrom center

            while (left >= 0 && right < chars.length && chars[left] == chars[right]) {
                left--;
                right++;
            }

            size = right - left - 1;
            if (size > currentSize) {
                var dist = size / 2 - 1;
                start = i - dist;
                end = i + 1 + dist;
            }
        }

        return s.substring(start, end + 1);
    }
}