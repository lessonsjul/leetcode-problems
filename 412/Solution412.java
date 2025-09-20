import java.util.ArrayList;
import java.util.List;

class Solution412 {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            result.add(mapValue(i));
        }
        return result;
    }

    private String mapValue(int number) {
        String answer = "";
        if (number % 3 == 0) {
            answer += "Fizz";
        }
        if (number % 5 == 0) {
            answer += "Buzz";
        }
        return answer.isEmpty() ? String.valueOf(number) : answer;
    }
}