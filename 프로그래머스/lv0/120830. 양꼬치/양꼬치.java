class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        if (n >= 10){
            k -= n / 10;
        }
        answer = (12000 * n) + (2000 * k);
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 10;
        int k = 3;
        int answer = sol.solution(n, k);
        System.out.println("answer = " + answer);
    }
}
