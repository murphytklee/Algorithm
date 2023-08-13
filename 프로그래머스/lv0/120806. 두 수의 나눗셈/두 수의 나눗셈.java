class Solution {
    public int solution(float num1, float num2) {
        int answer = 0;
        answer = (int) ((num1 / num2) * 1000);
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        float num1 = 7;
        float num2 = 3;
        int answer = sol.solution(num1, num2);
        System.out.println("answer = " + answer);
    }
}
