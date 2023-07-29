class Solution {
    public int solution(int num1, int num2) {
        int answer = num1 / num2;
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int num1 = 10;
        int num2 = 5;
        int answer = s.solution(num1, num2);
        System.out.println("answer = " + answer);
    }
}
