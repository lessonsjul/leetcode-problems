import java.util.HashSet;
import java.util.Set;

class Solution217 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> count = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (count.contains(nums[i])) {
                return true;
            } else {
                count.add(nums[i]);
            }
        }
        
        return false;
    }
}