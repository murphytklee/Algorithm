class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for (int i = 1; i <= number; i++) {
            int count = 0; // 각 숫자마다 약수의 갯수 초기화
            
            // i의 약수 구하기
            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    count++;
                    if (j * j < i) {
                        count++;
                    }
                }
            }
            
            // 약수의 갯수에 따라 결과값 계산
            if (count > limit) {
                answer += power;
            } else {
                answer += count;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int number = 5;
        int limit = 3;
        int power = 2;
        int answer = sol.solution(number, limit, power);
        System.out.println("answer = " + answer);
    }
}
