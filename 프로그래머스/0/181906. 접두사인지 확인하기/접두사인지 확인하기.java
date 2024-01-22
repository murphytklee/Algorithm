public class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        if (my_string.startsWith(is_prefix)){
            answer = 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "banana";
        String is_prefix = "ban";
        int answer = sol.solution(my_string, is_prefix);
        System.out.println("answer = " + answer);
    }
}
