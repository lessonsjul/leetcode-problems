class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int[] merged = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;

        int middle = merged.length / 2;

        for (int current = 0; current < merged.length; current++) {
            if (i < nums1.length && j < nums2.length) {
                if (nums1[i] < nums2[j]) {
                    merged[current] = nums1[i];
                    i++;
                } else {
                    merged[current] = nums2[j];
                    j++;
                }
            } else if (i < nums1.length) {
                merged[current] = nums1[i];
                i++;
            } else if (j < nums2.length) {
                merged[current] = nums2[j];
                j++;
            }

            if (current == middle) {
                break;
            }

            
        }

        if (merged.length % 2 == 0) {
            int one = merged[middle - 1];
            int two = merged[middle];

            return (one + two) / 2.0;
        } else {
            return (double) merged[merged.length / 2];
        }
        
    }
}