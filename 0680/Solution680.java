class Solution680 {
    public boolean validPalindrome(String s) {
        s = s.toLowerCase().replace("[^a-Z0-9]", "");

        int left = 0, right = s.length() - 1;

        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return validSubPalindrom(s, left + 1, right) || validSubPalindrom(s, left, right - 1);
            }
            left++;
            right--;
        }

        return true;
    }

    public boolean validSubPalindrom(String s, int left, int right) {
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}