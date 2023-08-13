class Solution {
    public int solution(int angle) {
        int answer = 0;
        if (angle > 0 && angle < 90) {
            answer = 1;
        } else if (angle == 90) {
            answer = 2;
        } else if (angle > 90 && angle < 180) {
            answer = 3;
        } else answer = 4;
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int angle = 70;
        int answer = sol.solution(angle);
        System.out.println("answer = " + answer);
    }
}
