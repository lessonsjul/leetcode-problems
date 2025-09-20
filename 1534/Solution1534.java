class Solution1534 {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        var i = 0;
        var j = i + 1; 
        var k = j + 1;

        int count = 0;
        while (k < arr.length) {
            if (Math.abs(arr[i] - arr[j]) <= a 
                    && Math.abs(arr[j] - arr[k]) <= b 
                    && Math.abs(arr[i] - arr[k]) <= c) {
                count++;
            }

            if (k < arr.length - 1) {
                k++;
            } else if (j < arr.length - 2) {
                j++; k = j + 1;
            } else {
                i++; j = i + 1; k = j + 1;
            }

        }

        return count;
        
    }
}