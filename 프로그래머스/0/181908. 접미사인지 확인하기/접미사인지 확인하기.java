public class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        if (my_string.endsWith(is_suffix)){
            answer = 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "banana";
        String is_suffix = "ana";
        int answer = sol.solution(my_string, is_suffix);
        System.out.println("answer = " + answer);
    }
}
