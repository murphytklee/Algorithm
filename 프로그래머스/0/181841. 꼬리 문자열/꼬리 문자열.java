public class Solution {
    public String solution(String[] str_list, String ex) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < str_list.length; i++) {
            if (!str_list[i].contains(ex)){
                answer.append(str_list[i]);
            }
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] str_list = {"abc", "def", "ghi"};
        String ex = "ef";
        String answer = sol.solution(str_list, ex);
        System.out.println("answer = " + answer);
    }
}