class Solution {
    public int solution(String message) {
        int answer = 0;
        answer = 2 * message.length();
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String message = "happy birthday!";
        int answer = sol.solution(message);
        System.out.println("answer = " + answer);
    }
}
