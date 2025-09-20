class Solution66 {
    public int[] plusOne(int[] digits) {
        boolean increaseNext = false;
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] = digits[i] == 9 ? 0 : digits[i] + 1;
            
            increaseNext = digits[i] == 0;
            
            if (!increaseNext) {
                return digits;
            }
        }
        
        int[] newDigits = new int[digits.length+1];
        newDigits[0] = 1;
        return newDigits;
    }
}