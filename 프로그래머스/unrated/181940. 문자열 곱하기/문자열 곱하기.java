class Solution {
    public String solution(String my_string, int k) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < k; i++) {
            answer.append(my_string);
        }
        return answer.toString();
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "string";
        int k = 3;
        String answer = sol.solution(my_string, k);
        System.out.println("answer = " + answer);
    }
}
