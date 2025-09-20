/**
 * The Prefix Sum Technique is used for problems needing fast range queries or cumulative calculations, such as:
 * * Subarray sum between indices L and R
 * * Count of elements in a range
 * * Checking if a subarray with given sum exists
 * * 2D prefix sums → submatrix sum queries
 *
 * It precomputes cumulative sums so range queries can be answered in O(1).
 */
public class PrefixSum {

    public int[] createPrefixSumInPlace(int[] array) {
        for(int i = 1; i < array.length; i++) {
            array[i] += array[i - 1]; // save sum of all elements before current position
        }

        return array;
    }
}
