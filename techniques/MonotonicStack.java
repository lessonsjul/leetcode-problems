import java.util.Arrays;
import java.util.Stack;
import java.util.stream.IntStream;

/**
 * The Monotonic Stack Technique is used for problems that need next/previous greater or smaller elements, such as:
 * 	* Next greater/smaller element in array
 * 	* Largest rectangle in histogram
 * 	* Trapping rainwater
 * 	* Stock span problems
 *
 * It keeps elements in sorted order to answer queries in O(n).
 */

public class MonotonicStack {

    public int[] nextGreaterElement(int[] array) {
        int size = array.length;
        var stack = new Stack<Integer>();
        int[] result = IntStream.range(0, size).map(__ -> -1).toArray();

        for (int i = 0; i < size; i++) {
            while (!stack.isEmpty() && array[i] > array[stack.peek()]) {
                result[stack.pop()] = array[i];
            }
            stack.add(i);
        }

        return result;
    }
}
