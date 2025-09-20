class Solution125 {
    public boolean isPalindrome(String s) {
        if (s.length() <= 1) {
            return true;
        }

        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        int start = 0, end = s.length() - 1;

        while (start <= end) {
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }

        return true;
    }
}