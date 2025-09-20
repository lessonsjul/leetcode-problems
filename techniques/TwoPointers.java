/**
 * The Two Pointers Technique is used for problems on sorted arrays, strings, or linked lists where two indices move to find pairs or ranges, such as:
 * * Pair with given sum in sorted array
 * * Removing duplicates from sorted array
 * * Partitioning arrays (e.g., move negatives left, positives right)
 * * Trapping rainwater, container with most water
 * * Longest substring/subarray under certain conditions
 *
 * It helps reduce complexity to O(n).
 */
public class TwoPointers {

    public boolean isPalindrome(String input) {
        int left = 0, right = input.length() - 1; // one pointer
        char[] chars = input.toCharArray();      // second pointer

        // algorithm stops when two pointers meet
        while (left < right) {
            // each pointer moves toward each other
            if (chars[left++] != chars[right--]) {
                return false;
            }
        }

        return true;
    }
}
