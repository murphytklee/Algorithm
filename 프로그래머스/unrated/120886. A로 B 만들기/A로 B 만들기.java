public class Solution {
    public int solution(String before, String after) {
        StringBuilder wordCheck = new StringBuilder(before);
        int answer = 0;

        for (int i = 0; i < before.length(); i++) {
            if (wordCheck.indexOf(after.substring(i, i + 1)) != -1) {
                wordCheck.deleteCharAt(wordCheck.indexOf(after.substring(i, i + 1)));
            }
        }

        if (wordCheck.length() == 0) {
            answer = 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String before = "olleh";
        String after = "hello";
        int answer = sol.solution(before, after);
        System.out.println("answer = " + answer);
    }
}
