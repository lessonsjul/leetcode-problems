import java.util.PriorityQueue;
import java.util.Queue;

class Solution2519 {
    public int kBigIndices(int[] nums, int k) {
        int[] indices = new int[nums.length];

        Queue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0; i < nums.length; i++) {
            if (pq.size() == k && pq.peek() < nums[i]) {
                indices[i] = 1;
            } else {
                pq.add(nums[i]);
            }

            if (pq.size() > k) {
                pq.poll();
            }
        }

        int count = 0;
        pq = new PriorityQueue<>((a,b) -> b - a);
        for (int i = nums.length - 1; i >= 0; i--) {
            if (pq.size() == k && pq.peek() < nums[i]) {
                count += indices[i];
            } else {
                pq.add(nums[i]);
            }

            if (pq.size() > k) {
                pq.poll();
            }
        }

        return count;
    }
}