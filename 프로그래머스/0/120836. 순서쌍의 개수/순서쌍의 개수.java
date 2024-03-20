class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                answer += (i == n / i) ? 1 : 2;
            }
        }
        
        return answer;
    }
}