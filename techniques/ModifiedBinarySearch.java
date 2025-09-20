/**
 * The Modified Binary Search Technique is used for problems where arrays are sorted or rotated, such as:
 * Search in rotated sorted array
 * Find first/last occurrence of an element
 * Find peak element or local minimum/maximum
 * Find the smallest element greater than or equal to target
 * Square root or other numeric searches
 * <p>
 * It tweaks binary search rules to fit special conditions.
 */

public class ModifiedBinarySearch {

    public int searchRotatedArray(int[] array, int target) {
        int left = 0, right = array.length;

        while (left <= right) {
            int middle = (right + left) / 2;

            if (array[middle] == target) {
                return middle;
            }

            if (array[left] <= array[middle]) {
                if (array[left] <= target && array[middle] > target) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            } else {
                if (array[middle] < target && array[right] > target) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }
        }


        return -1;
    }
}
