class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m - 1, index2 = n - 1;
        int pointer = nums1.length - 1;

        while (index2 >= 0) {
            if (index1 < 0 || nums2[index2] >= nums1[index1]) {
                nums1[pointer--] = nums2[index2--];
            } else {
                nums1[pointer--] = nums1[index1--];
            }
        }
    }
}