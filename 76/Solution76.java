class Solution76 {
    public String minWindow(String s, String t) {
        var map = new int[256];
        for (var c : t.toCharArray()) {
            map[c]++;
        }

        int start = 0, end = 0, head = 0;
        int counter = t.length(), minSubstringLength = Integer.MAX_VALUE;
        var source = s.toCharArray();

        while (end < s.length()) {
            if (map[source[end++]]-- > 0) {
                counter--;
            }

            while (counter == 0) {
                if (end - start < minSubstringLength) {
                    head = start;
                    minSubstringLength = end - start;
                }

                if (map[source[start++]]++ == 0) {
                    counter++;
                }
            }
        }

        return minSubstringLength == Integer.MAX_VALUE ? "" : s.substring(head, head + minSubstringLength);
    }
}