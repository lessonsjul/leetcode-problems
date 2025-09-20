import java.util.HashMap;
import java.util.Map;

class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            char letter = magazine.charAt(i);
            int quantity = map.getOrDefault(letter, 0);
            map.put(letter, quantity + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char letter = ransomNote.charAt(i);
            int quantity = map.getOrDefault(letter, 0);
            
            if (quantity > 0) {
                map.put(letter, quantity - 1);
            } else {
                return false;
            }
        }

        return true;
    }
}