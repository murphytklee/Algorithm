class Solution {
    public int solution(int n) {
        int answer = 0;
        if (n % 2 == 1){
            n -= 1;
        }
        while (n > 0){
            answer += n;
            n -= 2;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 10;
        int answer = sol.solution(n);
        System.out.println("answer = " + answer);
    }
}
