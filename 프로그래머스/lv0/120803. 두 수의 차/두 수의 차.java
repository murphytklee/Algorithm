class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        answer = num1 - num2;
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int num1 = 2;
        int num2 = 3;
        int answer = s.solution(num1, num2);
        System.out.println("answer = " + answer);
    }
}
