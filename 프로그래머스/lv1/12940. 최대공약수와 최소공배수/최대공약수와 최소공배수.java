class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        // n = 큰수
        if(n < m) {
            int temp = n;
            n = m;
            m = temp;
        }

        int a = n;
        int b = m;
        int gcd = 0;
        // gcd 최대공약수 구하기 유클리드 호제법
        while(b != 0) {
            int r = a % b;
            a = b;
            b = r;
            gcd = a;
        }

        answer[0] = gcd;
        answer[1] = n * m / gcd;
        return answer;
    }
}