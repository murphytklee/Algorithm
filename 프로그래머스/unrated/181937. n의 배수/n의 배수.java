class Solution {
    public int solution(int num, int n) {
        int answer = 0;
        if (num % n == 0){
            answer = 1;
        } else answer = 0;
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int num = 34;
        int n = 3;
        int answer = sol.solution(num, n);
        System.out.println("answer = " + answer);
    }
}
