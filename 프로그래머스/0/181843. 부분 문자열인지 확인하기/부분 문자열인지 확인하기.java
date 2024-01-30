public class Solution {
    public int solution(String my_string, String target) {
        int answer = 0;
        if (my_string.contains(target)){
            answer = 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "banana";
        String target = "ana";
        int answer = sol.solution(my_string, target);
        System.out.println("answer = " + answer);
    }
}