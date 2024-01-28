import java.util.Arrays;

public class Solution {
    public String[] solution(String myString) {
        String[] answer  = myString.replaceAll(" ", "").split("x");

        answer = Arrays.stream(answer)
                .filter(s -> !s.isEmpty())
                .toArray(String[]::new);
        
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String myString = "dxccxbbbxaaaa";
        String[] answer = sol.solution(myString);
        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));
    }
}
