import java.util.Arrays;

/**
 * The Sliding Window Technique is used for problems with subarrays or substrings of consecutive elements, like:
 * 	* Fixed size → max/min/sum of subarray size k
 * 	* Variable size → smallest/largest subarray meeting a condition
 * 	* Strings → the longest substring without repeats, anagrams, min window substring
 * 	* Streams → moving averages, recent max/min
 *
 * It avoids recomputation and often runs in O(n).
 */
public class SlidingWindow {

    public int[] maxSubarraySum(int[] array, int subArraySize) {
        int size = array.length;
        int windowSum = 0;

        // precalculate the sum of the first window
        for (int i = 0; i < subArraySize; i++) {
            windowSum += array[i];
        }

        int maxSum = windowSum;
        int maxStartIndex = 0;

        for (int i = 0; i < size - subArraySize; i++) {
            windowSum = windowSum - array[i] + array[i + subArraySize];

            if (windowSum > maxSum) {
                maxSum = windowSum;
                maxStartIndex = i  + 1;
            }
        }

        return Arrays.stream(array, maxStartIndex, maxStartIndex + subArraySize + 1).toArray();
    }
}
